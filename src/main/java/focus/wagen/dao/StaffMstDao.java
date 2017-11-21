package focus.wagen.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import focus.wagen.entity.StaffMst;

@Transactional
public interface StaffMstDao extends CrudRepository<StaffMst, Long> {
	StaffMst findByAccount(String account);
	@Query("from StaffMst where md5(account)=:accountMd5")
	StaffMst findByAccountMd5(@Param("accountMd5") String accountMd5);
	@Query("from StaffMst where md5(account)=:accountMd5 and md5(password)=:passwordMd5")
	StaffMst findByAccountAndPassword(@Param("accountMd5") String accountMd5, @Param("passwordMd5") String passwordMd5);
	<S extends StaffMst> S save(S entity);
}