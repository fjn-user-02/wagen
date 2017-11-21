package focus.wagen.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Where;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the public_view_mst database table.
 * 
 */
@Entity
@Table(name="public_view_mst")
@NamedQuery(name="PublicViewMst.findAll", query="SELECT p FROM PublicViewMst p")
public class PublicViewMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="area_name")
	private String areaName;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="create_user")
	private Integer createUser;

	@Column(name="del_flg")
	private Boolean delFlg;

	@Column(name="img_path")
	private String imgPath;

	@Column(name="pause_flg")
	private Boolean pauseFlg;

	@Column(name="public_pattern")
	private String publicPattern;

	@Column(name="site_path")
	private String sitePath;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_user")
	private Integer updateUser;

	//bi-directional many-to-one association to HomeLayoutMst
	@OneToMany(mappedBy="publicViewMst")
	@Where(clause="del_flg = false AND pause_flg = false")
	private List<HomeLayoutMst> homeLayoutMsts;

	//bi-directional many-to-one association to PublicViewDetailMst
	@OneToMany(mappedBy="publicViewMst")
	@Where(clause="del_flg = false AND pause_flg = false")
	private List<PublicViewDetailMst> publicViewDetailMsts;

	public PublicViewMst() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	public Boolean getDelFlg() {
		return this.delFlg;
	}

	public void setDelFlg(Boolean delFlg) {
		this.delFlg = delFlg;
	}

	public String getImgPath() {
		return this.imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public Boolean getPauseFlg() {
		return this.pauseFlg;
	}

	public void setPauseFlg(Boolean pauseFlg) {
		this.pauseFlg = pauseFlg;
	}

	public String getPublicPattern() {
		return this.publicPattern;
	}

	public void setPublicPattern(String publicPattern) {
		this.publicPattern = publicPattern;
	}

	public String getSitePath() {
		return this.sitePath;
	}

	public void setSitePath(String sitePath) {
		this.sitePath = sitePath;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(Integer updateUser) {
		this.updateUser = updateUser;
	}

	public List<HomeLayoutMst> getHomeLayoutMsts() {
		return this.homeLayoutMsts;
	}

	public void setHomeLayoutMsts(List<HomeLayoutMst> homeLayoutMsts) {
		this.homeLayoutMsts = homeLayoutMsts;
	}

	public HomeLayoutMst addHomeLayoutMst(HomeLayoutMst homeLayoutMst) {
		getHomeLayoutMsts().add(homeLayoutMst);
		homeLayoutMst.setPublicViewMst(this);

		return homeLayoutMst;
	}

	public HomeLayoutMst removeHomeLayoutMst(HomeLayoutMst homeLayoutMst) {
		getHomeLayoutMsts().remove(homeLayoutMst);
		homeLayoutMst.setPublicViewMst(null);

		return homeLayoutMst;
	}

	public List<PublicViewDetailMst> getPublicViewDetailMsts() {
		return this.publicViewDetailMsts;
	}

	public void setPublicViewDetailMsts(List<PublicViewDetailMst> publicViewDetailMsts) {
		this.publicViewDetailMsts = publicViewDetailMsts;
	}

	public PublicViewDetailMst addPublicViewDetailMst(PublicViewDetailMst publicViewDetailMst) {
		getPublicViewDetailMsts().add(publicViewDetailMst);
		publicViewDetailMst.setPublicViewMst(this);

		return publicViewDetailMst;
	}

	public PublicViewDetailMst removePublicViewDetailMst(PublicViewDetailMst publicViewDetailMst) {
		getPublicViewDetailMsts().remove(publicViewDetailMst);
		publicViewDetailMst.setPublicViewMst(null);

		return publicViewDetailMst;
	}

}