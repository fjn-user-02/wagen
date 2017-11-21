package focus.wagen.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the staff_mst database table.
 * 
 */
@Entity
@Table(name="staff_mst")
@NamedQuery(name="StaffMst.findAll", query="SELECT s FROM StaffMst s")
public class StaffMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String account;

	@Column(name="auth_code")
	private String authCode;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="create_user")
	private Integer createUser;

	@Column(name="del_flg")
	private Boolean delFlg;

	private String mail;

	private String password;

	@Column(name="pause_flg")
	private Boolean pauseFlg;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_user")
	private Integer updateUser;

	//bi-directional many-to-one association to DealerAuthRel
	@OneToMany(mappedBy="staffMst")
	private List<DealerAuthRel> dealerAuthRels;

	//bi-directional many-to-one association to StaffAuthRel
	@OneToMany(mappedBy="staffMst")
	private List<StaffAuthRel> staffAuthRels;

	//bi-directional many-to-one association to DealerMst
	@ManyToOne
	@JoinColumn(name="dealer_code", referencedColumnName="dealer_code")
	private DealerMst dealerMst;

	//bi-directional many-to-one association to ShopMst
	@ManyToOne
	@JoinColumn(name="shop_code", referencedColumnName="shop_code")
	private ShopMst shopMst;

	public StaffMst() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAuthCode() {
		return this.authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
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

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getPauseFlg() {
		return this.pauseFlg;
	}

	public void setPauseFlg(Boolean pauseFlg) {
		this.pauseFlg = pauseFlg;
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

	public List<DealerAuthRel> getDealerAuthRels() {
		return this.dealerAuthRels;
	}

	public void setDealerAuthRels(List<DealerAuthRel> dealerAuthRels) {
		this.dealerAuthRels = dealerAuthRels;
	}

	public DealerAuthRel addDealerAuthRel(DealerAuthRel dealerAuthRel) {
		getDealerAuthRels().add(dealerAuthRel);
		dealerAuthRel.setStaffMst(this);

		return dealerAuthRel;
	}

	public DealerAuthRel removeDealerAuthRel(DealerAuthRel dealerAuthRel) {
		getDealerAuthRels().remove(dealerAuthRel);
		dealerAuthRel.setStaffMst(null);

		return dealerAuthRel;
	}

	public List<StaffAuthRel> getStaffAuthRels() {
		return this.staffAuthRels;
	}

	public void setStaffAuthRels(List<StaffAuthRel> staffAuthRels) {
		this.staffAuthRels = staffAuthRels;
	}

	public StaffAuthRel addStaffAuthRel(StaffAuthRel staffAuthRel) {
		getStaffAuthRels().add(staffAuthRel);
		staffAuthRel.setStaffMst(this);

		return staffAuthRel;
	}

	public StaffAuthRel removeStaffAuthRel(StaffAuthRel staffAuthRel) {
		getStaffAuthRels().remove(staffAuthRel);
		staffAuthRel.setStaffMst(null);

		return staffAuthRel;
	}

	public DealerMst getDealerMst() {
		return this.dealerMst;
	}

	public void setDealerMst(DealerMst dealerMst) {
		this.dealerMst = dealerMst;
	}

	public ShopMst getShopMst() {
		return this.shopMst;
	}

	public void setShopMst(ShopMst shopMst) {
		this.shopMst = shopMst;
	}

}