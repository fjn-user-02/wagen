package focus.wagen.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter.XFrameOptionsMode;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;

	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource)
				.usersByUsernameQuery("select md5(account) as account, md5(password) as password, true from staff_mst where md5(account) = ? and del_flg = FALSE")
				.authoritiesByUsernameQuery(
					"select md5(s.account) as account, a.auth_name "
					+ "from staff_mst s "
					+ "inner join staff_auth_rel sa on (s.id = sa.staff_id) "
					+ "inner join auth_mst a on (sa.auth_code = a.auth_code) "
					+ "where md5(s.account) = ?"
				);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.headers().addHeaderWriter(new XFrameOptionsHeaderWriter(XFrameOptionsMode.SAMEORIGIN)).and()
			.authorizeRequests()
				.antMatchers(
					"/js/**", "/css/**", "/img/**", "/_font/**", "/pdfjs/**", "/admin", "/error",
					"/change_password", "/print/autologin/**").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/shop").permitAll()
				.defaultSuccessUrl("/")
				.and()
			.logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.logoutSuccessUrl("/shop")
				.permitAll()
				.and()
			.exceptionHandling()
				.accessDeniedPage("/error");
	}
}
