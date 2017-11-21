package focus.wagen.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Where;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the campaign_mst database table.
 * 
 */
@Entity
@Table(name="campaign_mst")
@NamedQuery(name="CampaignMst.findAll", query="SELECT c FROM CampaignMst c")
public class CampaignMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String caution;

	private BigDecimal cost;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="create_user")
	private Integer createUser;

	@Column(name="del_flg")
	private Boolean delFlg;

	private String description;

	@Column(name="excluded_item")
	private String excludedItem;

	@Column(name="img_path")
	private String imgPath;

	@Column(name="item_code")
	private String itemCode;

	@Column(name="item_name")
	private String itemName;

	@Column(name="must_item")
	private String mustItem;

	@Column(name="paint_flg")
	private Boolean paintFlg;

	@Column(name="parts_no1")
	private String partsNo1;

	@Column(name="parts_no2")
	private String partsNo2;

	@Column(name="parts_no3")
	private String partsNo3;

	@Column(name="parts_no4")
	private String partsNo4;

	@Column(name="pause_flg")
	private Boolean pauseFlg;

	private BigDecimal price;

	@Column(name="price_in_tax")
	private BigDecimal priceInTax;

	@Column(name="sale_info")
	private String saleInfo;

	@Column(name="sale_tag")
	private Integer saleTag;

	@Column(name="sale_title")
	private String saleTitle;

	private String spec;

	private String status;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_user")
	private Integer updateUser;

	@Column(name="view_priority")
	private Integer viewPriority;

	//bi-directional many-to-one association to EstimationHistoryTran
	@OneToMany(mappedBy="campaignMst")
	private List<EstimationHistoryTran> estimationHistoryTrans;

	//bi-directional many-to-one association to EstimationTran
	@OneToMany(mappedBy="campaignMst")
	private List<EstimationTran> estimationTrans;

	//bi-directional many-to-one association to ModelCampaignRel
	@OneToMany(mappedBy="campaignMst")
	@Where(clause="pause_flg = false")
	private List<ModelCampaignRel> modelCampaignRels;

	//bi-directional many-to-one association to ModelCampaignRel
	@OneToMany(mappedBy="campaignMst")
	@Where(clause="pause_flg = false")
	private List<CampaignViewRel> campaignViewRels;

	public CampaignMst() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCaution() {
		return this.caution;
	}

	public void setCaution(String caution) {
		this.caution = caution;
	}

	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExcludedItem() {
		return this.excludedItem;
	}

	public void setExcludedItem(String excludedItem) {
		this.excludedItem = excludedItem;
	}

	public String getImgPath() {
		return this.imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getMustItem() {
		return this.mustItem;
	}

	public void setMustItem(String mustItem) {
		this.mustItem = mustItem;
	}

	public Boolean getPaintFlg() {
		return this.paintFlg;
	}

	public void setPaintFlg(Boolean paintFlg) {
		this.paintFlg = paintFlg;
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

	public Boolean getPauseFlg() {
		return this.pauseFlg;
	}

	public void setPauseFlg(Boolean pauseFlg) {
		this.pauseFlg = pauseFlg;
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

	public String getSaleInfo() {
		return this.saleInfo;
	}

	public void setSaleInfo(String saleInfo) {
		this.saleInfo = saleInfo;
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

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Integer getViewPriority() {
		return this.viewPriority;
	}

	public Integer getViewPriorityNotNull() {
		return this.viewPriority != null? this.viewPriority : 0;
	}

	public void setViewPriority(Integer viewPriority) {
		this.viewPriority = viewPriority;
	}

	public List<EstimationHistoryTran> getEstimationHistoryTrans() {
		return this.estimationHistoryTrans;
	}

	public void setEstimationHistoryTrans(List<EstimationHistoryTran> estimationHistoryTrans) {
		this.estimationHistoryTrans = estimationHistoryTrans;
	}

	public EstimationHistoryTran addEstimationHistoryTran(EstimationHistoryTran estimationHistoryTran) {
		getEstimationHistoryTrans().add(estimationHistoryTran);
		estimationHistoryTran.setCampaignMst(this);

		return estimationHistoryTran;
	}

	public EstimationHistoryTran removeEstimationHistoryTran(EstimationHistoryTran estimationHistoryTran) {
		getEstimationHistoryTrans().remove(estimationHistoryTran);
		estimationHistoryTran.setCampaignMst(null);

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
		estimationTran.setCampaignMst(this);

		return estimationTran;
	}

	public EstimationTran removeEstimationTran(EstimationTran estimationTran) {
		getEstimationTrans().remove(estimationTran);
		estimationTran.setCampaignMst(null);

		return estimationTran;
	}

	public List<ModelCampaignRel> getModelCampaignRels() {
		return this.modelCampaignRels;
	}
	
	public Integer getModelId() {
		return this.modelCampaignRels.get(0).getModelMst().getId();
	}

	public void setModelCampaignRels(List<ModelCampaignRel> modelCampaignRels) {
		this.modelCampaignRels = modelCampaignRels;
	}

	public ModelCampaignRel addModelCampaignRel(ModelCampaignRel modelCampaignRel) {
		getModelCampaignRels().add(modelCampaignRel);
		modelCampaignRel.setCampaignMst(this);

		return modelCampaignRel;
	}

	public ModelCampaignRel removeModelCampaignRel(ModelCampaignRel modelCampaignRel) {
		getModelCampaignRels().remove(modelCampaignRel);
		modelCampaignRel.setCampaignMst(null);

		return modelCampaignRel;
	}

	public List<CampaignViewRel> getCampaignViewRels() {
		return this.campaignViewRels;
	}

	public void setCampaignViewRels(List<CampaignViewRel> campaignViewRels) {
		this.campaignViewRels = campaignViewRels;
	}

	public CampaignViewRel addCampaignViewRel(CampaignViewRel campaignViewRel) {
		getCampaignViewRels().add(campaignViewRel);
		campaignViewRel.setCampaignMst(this);

		return campaignViewRel;
	}

	public CampaignViewRel removeCampaignViewRel(CampaignViewRel campaignViewRel) {
		getCampaignViewRels().remove(campaignViewRel);
		campaignViewRel.setCampaignMst(null);

		return campaignViewRel;
	}

}