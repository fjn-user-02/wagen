package focus.wagen.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dealer_auth_rel database table.
 * 
 */
@Entity
@Table(name="dealer_auth_rel")
@NamedQuery(name="DealerAuthRel.findAll", query="SELECT d FROM DealerAuthRel d")
public class DealerAuthRel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="auth_code")
	private String authCode;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="create_user")
	private Integer createUser;

	@Column(name="del_flg")
	private Boolean delFlg;

	@Column(name="pause_flg")
	private Boolean pauseFlg;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_user")
	private Integer updateUser;

	//bi-directional many-to-one association to DealerMst
	@ManyToOne
	@JoinColumn(name="dealer_id")
	private DealerMst dealerMst;

	//bi-directional many-to-one association to StaffMst
	@ManyToOne
	@JoinColumn(name="staff_id")
	private StaffMst staffMst;

	public DealerAuthRel() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public DealerMst getDealerMst() {
		return this.dealerMst;
	}

	public void setDealerMst(DealerMst dealerMst) {
		this.dealerMst = dealerMst;
	}

	public StaffMst getStaffMst() {
		return this.staffMst;
	}

	public void setStaffMst(StaffMst staffMst) {
		this.staffMst = staffMst;
	}

}