package focus.wagen.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the estimation_tran database table.
 * 
 */
@Entity
@Table(name="estimation_tran")
@NamedQuery(name="EstimationTran.findAll", query="SELECT e FROM EstimationTran e")
public class EstimationTran implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="create_account")
	private String createAccount;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="create_user")
	private Integer createUser;

	@Column(name="del_flg")
	private Boolean delFlg;

	@Column(name="estimated_number")
	private String estimatedNumber;

	@Column(name="img_path")
	private String imgPath;

	@Column(name="install_time")
	private BigDecimal installTime;

	@Column(name="item_code")
	private String itemCode;

	@Column(name="item_discount")
	private BigDecimal itemDiscount;

	@Column(name="item_name")
	private String itemName;

	@Column(name="item_paint_price")
	private BigDecimal itemPaintPrice;

	private String memo;

	@Column(name="paint_price")
	private BigDecimal paintPrice;

	@Column(name="parts_no1")
	private String partsNo1;

	@Column(name="parts_no2")
	private String partsNo2;

	@Column(name="parts_no3")
	private String partsNo3;

	@Column(name="parts_no4")
	private String partsNo4;

	private BigDecimal price;

	@Column(name="price_in_tax")
	private BigDecimal priceInTax;

	private Integer quantity;

	@Column(name="sale_tag")
	private Integer saleTag;

	@Column(name="sale_title")
	private String saleTitle;

	@Column(name="total_discount")
	private BigDecimal totalDiscount;

	@Column(name="update_account")
	private String updateAccount;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_user")
	private Integer updateUser;

	//bi-directional many-to-one association to CampaignMst
	@ManyToOne
	@JoinColumn(name="campaign_id")
	private CampaignMst campaignMst;

	//bi-directional many-to-one association to DealerMst
	@ManyToOne
	@JoinColumn(name="dealer_id")
	private DealerMst dealerMst;

	//bi-directional many-to-one association to ItemMst
	@ManyToOne
	@JoinColumn(name="item_id")
	private ItemMst itemMst;

	//bi-directional many-to-one association to ModelMst
	@ManyToOne
	@JoinColumn(name="model_id")
	private ModelMst modelMst;

	//bi-directional many-to-one association to ShopMst
	@ManyToOne
	@JoinColumn(name="shop_id")
	private ShopMst shopMst;

	//bi-directional many-to-one association to TaxMst
	@ManyToOne
	@JoinColumn(name="tax_id")
	private TaxMst taxMst;

	public EstimationTran() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCreateAccount() {
		return this.createAccount;
	}

	public void setCreateAccount(String createAccount) {
		this.createAccount = createAccount;
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

	public String getEstimatedNumber() {
		return this.estimatedNumber;
	}

	public void setEstimatedNumber(String estimatedNumber) {
		this.estimatedNumber = estimatedNumber;
	}

	public String getImgPath() {
		return this.imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public BigDecimal getInstallTime() {
		return this.installTime;
	}

	public void setInstallTime(BigDecimal installTime) {
		this.installTime = installTime;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public BigDecimal getItemDiscount() {
		return this.itemDiscount;
	}

	public void setItemDiscount(BigDecimal itemDiscount) {
		this.itemDiscount = itemDiscount;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public BigDecimal getItemPaintPrice() {
		return this.itemPaintPrice;
	}

	public void setItemPaintPrice(BigDecimal itemPaintPrice) {
		this.itemPaintPrice = itemPaintPrice;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public BigDecimal getPaintPrice() {
		return this.paintPrice;
	}

	public void setPaintPrice(BigDecimal paintPrice) {
		this.paintPrice = paintPrice;
	}

	public String getPartsNo1() {
		return this.partsNo1;
	}

	public void setPartsNo1(String partsNo1) {
		this.partsNo1 = partsNo1;
	}

	public String getPartsNo2() {
		return this.partsNo2;
	}

	public void setPartsNo2(String partsNo2) {
		this.partsNo2 = partsNo2;
	}

	public String getPartsNo3() {
		return this.partsNo3;
	}

	public void setPartsNo3(String partsNo3) {
		this.partsNo3 = partsNo3;
	}

	public String getPartsNo4() {
		return this.partsNo4;
	}

	public void setPartsNo4(String partsNo4) {
		this.partsNo4 = partsNo4;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPriceInTax() {
		return this.priceInTax;
	}

	public void setPriceInTax(BigDecimal priceInTax) {
		this.priceInTax = priceInTax;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getSaleTag() {
		return this.saleTag;
	}

	public void setSaleTag(Integer saleTag) {
		this.saleTag = saleTag;
	}

	public String getSaleTitle() {
		return this.saleTitle;
	}

	public void setSaleTitle(String saleTitle) {
		this.saleTitle = saleTitle;
	}

	public BigDecimal getTotalDiscount() {
		return this.totalDiscount;
	}

	public void setTotalDiscount(BigDecimal totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public String getUpdateAccount() {
		return this.updateAccount;
	}

	public void setUpdateAccount(String updateAccount) {
		this.updateAccount = updateAccount;
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

	public CampaignMst getCampaignMst() {
		return this.campaignMst;
	}

	public void setCampaignMst(CampaignMst campaignMst) {
		this.campaignMst = campaignMst;
	}

	public DealerMst getDealerMst() {
		return this.dealerMst;
	}

	public void setDealerMst(DealerMst dealerMst) {
		this.dealerMst = dealerMst;
	}

	public ItemMst getItemMst() {
		return this.itemMst;
	}

	public void setItemMst(ItemMst itemMst) {
		this.itemMst = itemMst;
	}

	public ModelMst getModelMst() {
		return this.modelMst;
	}

	public void setModelMst(ModelMst modelMst) {
		this.modelMst = modelMst;
	}

	public ShopMst getShopMst() {
		return this.shopMst;
	}

	public void setShopMst(ShopMst shopMst) {
		this.shopMst = shopMst;
	}

	public TaxMst getTaxMst() {
		return this.taxMst;
	}

	public void setTaxMst(TaxMst taxMst) {
		this.taxMst = taxMst;
	}

}