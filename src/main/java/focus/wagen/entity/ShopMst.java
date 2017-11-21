package focus.wagen.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the shop_mst database table.
 * 
 */
@Entity
@Table(name="shop_mst")
@NamedQuery(name="ShopMst.findAll", query="SELECT s FROM ShopMst s")
public class ShopMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String address1;

	private String address2;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="create_user")
	private Integer createUser;

	@Column(name="del_flg")
	private Boolean delFlg;

	private Integer fax;

	@Column(name="shop_code")
	private String shopCode;

	@Column(name="shop_kana")
	private String shopKana;

	@Column(name="shop_name")
	private String shopName;

	private Integer tel;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_user")
	private Integer updateUser;

	private Integer zip;

	//bi-directional many-to-one association to EstimationHistoryTran
	@OneToMany(mappedBy="shopMst")
	private List<EstimationHistoryTran> estimationHistoryTrans;

	//bi-directional many-to-one association to EstimationTran
	@OneToMany(mappedBy="shopMst")
	private List<EstimationTran> estimationTrans;

	//bi-directional many-to-one association to PayMst
	@OneToMany(mappedBy="shopMst")
	private List<PayMst> payMsts;

	//bi-directional many-to-one association to ShopAuthRel
	@OneToMany(mappedBy="shopMst")
	private List<ShopAuthRel> shopAuthRels;

	//bi-directional many-to-one association to StaffMst
	@OneToMany(mappedBy="shopMst")
	private List<StaffMst> staffMsts;
	
	public ShopMst() {
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

	public String getShopCode() {
		return this.shopCode;
	}

	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

	public String getShopKana() {
		return this.shopKana;
	}

	public void setShopKana(String shopKana) {
		this.shopKana = shopKana;
	}

	public String getShopName() {
		return this.shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
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

	public List<EstimationHistoryTran> getEstimationHistoryTrans() {
		return this.estimationHistoryTrans;
	}

	public void setEstimationHistoryTrans(List<EstimationHistoryTran> estimationHistoryTrans) {
		this.estimationHistoryTrans = estimationHistoryTrans;
	}

	public EstimationHistoryTran addEstimationHistoryTran(EstimationHistoryTran estimationHistoryTran) {
		getEstimationHistoryTrans().add(estimationHistoryTran);
		estimationHistoryTran.setShopMst(this);

		return estimationHistoryTran;
	}

	public EstimationHistoryTran removeEstimationHistoryTran(EstimationHistoryTran estimationHistoryTran) {
		getEstimationHistoryTrans().remove(estimationHistoryTran);
		estimationHistoryTran.setShopMst(null);

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
		estimationTran.setShopMst(this);

		return estimationTran;
	}

	public EstimationTran removeEstimationTran(EstimationTran estimationTran) {
		getEstimationTrans().remove(estimationTran);
		estimationTran.setShopMst(null);

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
		payMst.setShopMst(this);

		return payMst;
	}

	public PayMst removePayMst(PayMst payMst) {
		getPayMsts().remove(payMst);
		payMst.setShopMst(null);

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
		shopAuthRel.setShopMst(this);

		return shopAuthRel;
	}

	public ShopAuthRel removeShopAuthRel(ShopAuthRel shopAuthRel) {
		getShopAuthRels().remove(shopAuthRel);
		shopAuthRel.setShopMst(null);

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
		staffMst.setShopMst(this);

		return staffMst;
	}

	public StaffMst removeStaffMst(StaffMst staffMst) {
		getStaffMsts().remove(staffMst);
		staffMst.setShopMst(null);

		return staffMst;
	}

}