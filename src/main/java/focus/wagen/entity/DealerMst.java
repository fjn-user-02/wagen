package focus.wagen.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the dealer_mst database table.
 * 
 */
@Entity
@Table(name="dealer_mst")
@NamedQuery(name="DealerMst.findAll", query="SELECT d FROM DealerMst d")
public class DealerMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String address1;

	private String address2;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="dealer_code")
	private String dealerCode;
	
	@Column(name="create_user")
	private Integer createUser;

	@Column(name="dealer_kana")
	private String dealerKana;

	@Column(name="dealer_name")
	private String dealerName;

	@Column(name="del_flg")
	private Boolean delFlg;

	private Integer fax;

	private String mail;

	private Integer tel;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_user")
	private Integer updateUser;

	private Integer zip;

	//bi-directional many-to-one association to CreateNumTbl
	@OneToMany(mappedBy="dealerMst")
	private List<CreateNumTbl> createNumTbls;

	//bi-directional many-to-one association to DealerAuthRel
	@OneToMany(mappedBy="dealerMst")
	private List<DealerAuthRel> dealerAuthRels;

	//bi-directional many-to-one association to EstimationHistoryTran
	@OneToMany(mappedBy="dealerMst")
	private List<EstimationHistoryTran> estimationHistoryTrans;

	//bi-directional many-to-one association to EstimationTran
	@OneToMany(mappedBy="dealerMst")
	private List<EstimationTran> estimationTrans;

	//bi-directional many-to-one association to PayMst
	@OneToMany(mappedBy="dealerMst")
	private List<PayMst> payMsts;

	//bi-directional many-to-one association to ShopAuthRel
	@OneToMany(mappedBy="dealerMst")
	private List<ShopAuthRel> shopAuthRels;

	//bi-directional many-to-one association to StaffMst
	@OneToMany(mappedBy="dealerMst")
	private List<StaffMst> staffMsts;

	//bi-directional many-to-one association to CampaignViewRel
	@OneToMany(mappedBy="dealerMst")
	private List<CampaignViewRel> campaignViewRels;

	public DealerMst() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
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

	public String getDealerKana() {
		return this.dealerKana;
	}

	public void setDealerKana(String dealerKana) {
		this.dealerKana = dealerKana;
	}

	public String getDealerName() {
		return this.dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getDealerCode() {
		return this.dealerCode;
	}

	public void setDealerCode(String dealerCode) {
		this.dealerCode = dealerCode;
	}
	public Boolean getDelFlg() {
		return this.delFlg;
	}

	public void setDelFlg(Boolean delFlg) {
		this.delFlg = delFlg;
	}

	public Integer getFax() {
		return this.fax;
	}

	public void setFax(Integer fax) {
		this.fax = fax;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Integer getTel() {
		return this.tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
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

	public Integer getZip() {
		return this.zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public List<CreateNumTbl> getCreateNumTbls() {
		return this.createNumTbls;
	}

	public void setCreateNumTbls(List<CreateNumTbl> createNumTbls) {
		this.createNumTbls = createNumTbls;
	}

	public CreateNumTbl addCreateNumTbl(CreateNumTbl createNumTbl) {
		getCreateNumTbls().add(createNumTbl);
		createNumTbl.setDealerMst(this);

		return createNumTbl;
	}

	public CreateNumTbl removeCreateNumTbl(CreateNumTbl createNumTbl) {
		getCreateNumTbls().remove(createNumTbl);
		createNumTbl.setDealerMst(null);

		return createNumTbl;
	}

	public List<DealerAuthRel> getDealerAuthRels() {
		return this.dealerAuthRels;
	}

	public void setDealerAuthRels(List<DealerAuthRel> dealerAuthRels) {
		this.dealerAuthRels = dealerAuthRels;
	}

	public DealerAuthRel addDealerAuthRel(DealerAuthRel dealerAuthRel) {
		getDealerAuthRels().add(dealerAuthRel);
		dealerAuthRel.setDealerMst(this);

		return dealerAuthRel;
	}

	public DealerAuthRel removeDealerAuthRel(DealerAuthRel dealerAuthRel) {
		getDealerAuthRels().remove(dealerAuthRel);
		dealerAuthRel.setDealerMst(null);

		return dealerAuthRel;
	}

	public List<EstimationHistoryTran> getEstimationHistoryTrans() {
		return this.estimationHistoryTrans;
	}

	public void setEstimationHistoryTrans(List<EstimationHistoryTran> estimationHistoryTrans) {
		this.estimationHistoryTrans = estimationHistoryTrans;
	}

	public EstimationHistoryTran addEstimationHistoryTran(EstimationHistoryTran estimationHistoryTran) {
		getEstimationHistoryTrans().add(estimationHistoryTran);
		estimationHistoryTran.setDealerMst(this);

		return estimationHistoryTran;
	}

	public EstimationHistoryTran removeEstimationHistoryTran(EstimationHistoryTran estimationHistoryTran) {
		getEstimationHistoryTrans().remove(estimationHistoryTran);
		estimationHistoryTran.setDealerMst(null);

		return estimationHistoryTran;
	}

	public List<EstimationTran> getEstimationTrans() {
		return this.estimationTrans;
	}

	public void setEstimationTrans(List<EstimationTran> estimationTrans) {
		this.estimationTrans = estimationTrans;
	}

	public EstimationTran addEstimationTran(EstimationTran estimationTran) {
		getEstimationTrans().add(estimationTran);
		estimationTran.setDealerMst(this);

		return estimationTran;
	}

	public EstimationTran removeEstimationTran(EstimationTran estimationTran) {
		getEstimationTrans().remove(estimationTran);
		estimationTran.setDealerMst(null);

		return estimationTran;
	}

	public List<PayMst> getPayMsts() {
		return this.payMsts;
	}

	public void setPayMsts(List<PayMst> payMsts) {
		this.payMsts = payMsts;
	}

	public PayMst addPayMst(PayMst payMst) {
		getPayMsts().add(payMst);
		payMst.setDealerMst(this);

		return payMst;
	}

	public PayMst removePayMst(PayMst payMst) {
		getPayMsts().remove(payMst);
		payMst.setDealerMst(null);

		return payMst;
	}

	public List<ShopAuthRel> getShopAuthRels() {
		return this.shopAuthRels;
	}

	public void setShopAuthRels(List<ShopAuthRel> shopAuthRels) {
		this.shopAuthRels = shopAuthRels;
	}

	public ShopAuthRel addShopAuthRel(ShopAuthRel shopAuthRel) {
		getShopAuthRels().add(shopAuthRel);
		shopAuthRel.setDealerMst(this);

		return shopAuthRel;
	}

	public ShopAuthRel removeShopAuthRel(ShopAuthRel shopAuthRel) {
		getShopAuthRels().remove(shopAuthRel);
		shopAuthRel.setDealerMst(null);

		return shopAuthRel;
	}

	public List<StaffMst> getStaffMsts() {
		return this.staffMsts;
	}

	public void setStaffMsts(List<StaffMst> staffMsts) {
		this.staffMsts = staffMsts;
	}

	public StaffMst addStaffMst(StaffMst staffMst) {
		getStaffMsts().add(staffMst);
		staffMst.setDealerMst(this);

		return staffMst;
	}

	public StaffMst removeStaffMst(StaffMst staffMst) {
		getStaffMsts().remove(staffMst);
		staffMst.setDealerMst(null);

		return staffMst;
	}

	public List<CampaignViewRel> getCampaignViewRels() {
		return this.campaignViewRels;
	}

	public void setCampaignViewRels(List<CampaignViewRel> campaignViewRels) {
		this.campaignViewRels = campaignViewRels;
	}

	public CampaignViewRel addCampaignViewRel(CampaignViewRel campaignViewRel) {
		getCampaignViewRels().add(campaignViewRel);
		campaignViewRel.setDealerMst(this);

		return campaignViewRel;
	}

	public CampaignViewRel removeCampaignViewRel(CampaignViewRel campaignViewRel) {
		getCampaignViewRels().remove(campaignViewRel);
		campaignViewRel.setDealerMst(null);

		return campaignViewRel;
	}

}