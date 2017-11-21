package focus.wagen.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Where;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the model_mst database table.
 * 
 */
@Entity
@Table(name="model_mst")
@NamedQuery(name="ModelMst.findAll", query="SELECT m FROM ModelMst m")
public class ModelMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="create_user")
	private Integer createUser;

	@Column(name="del_flg")
	private Boolean delFlg;

	@Column(name="free_flg")
	private Integer freeFlg;

	@Column(name="img_path")
	private String imgPath;

	@Column(name="language_flg")
	private Integer languageFlg;

	@Column(name="model_code")
	private String modelCode;

	@Column(name="model_name")
	private String modelName;

	@Column(name="model_name_b")
	private String modelNameB;

	@Column(name="model_type")
	private String modelType;

	@Column(name="pause_flg")
	private Boolean pauseFlg;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_user")
	private Integer updateUser;

	//bi-directional many-to-one association to EstimationHistoryTran
	@OneToMany(mappedBy="modelMst")
	private List<EstimationHistoryTran> estimationHistoryTrans;

	//bi-directional many-to-one association to EstimationTran
	@OneToMany(mappedBy="modelMst")
	private List<EstimationTran> estimationTrans;

	//bi-directional many-to-one association to ModelCampaignRel
	@OneToMany(mappedBy="modelMst")
	@Where(clause="pause_flg = false")
	private List<ModelCampaignRel> modelCampaignRels;

	//bi-directional many-to-one association to ModelGenerationRel
	@OneToMany(mappedBy="modelMst")
	@Where(clause="pause_flg = false")	private List<ModelGenerationRel> modelGenerationRels;

	//bi-directional many-to-one association to ModelItemRel
	@OneToMany(mappedBy="modelMst")
	@Where(clause="pause_flg = false")	private List<ModelItemRel> modelItemRels;

	//bi-directional many-to-one association to PayMst
	@OneToMany(mappedBy="modelMst")
	@Where(clause="del_flg = false AND pause_flg = false")	private List<PayMst> payMsts;

	//bi-directional many-to-one association to ModelCodeMst
	@OneToMany(mappedBy="modelMst")
	private List<ModelCodeMst> modelCodeMsts;

	public ModelMst() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getFreeFlg() {
		return this.freeFlg;
	}

	public void setFreeFlg(Integer freeFlg) {
		this.freeFlg = freeFlg;
	}

	public String getImgPath() {
		return this.imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public Integer getLanguageFlg() {
		return this.languageFlg;
	}

	public void setLanguageFlg(Integer languageFlg) {
		this.languageFlg = languageFlg;
	}

	public String getModelCode() {
		return this.modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelNameB() {
		return this.modelNameB;
	}

	public void setModelNameB(String modelNameB) {
		this.modelNameB = modelNameB;
	}

	public String getModelType() {
		return this.modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
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

	public List<EstimationHistoryTran> getEstimationHistoryTrans() {
		return this.estimationHistoryTrans;
	}

	public void setEstimationHistoryTrans(List<EstimationHistoryTran> estimationHistoryTrans) {
		this.estimationHistoryTrans = estimationHistoryTrans;
	}

	public EstimationHistoryTran addEstimationHistoryTran(EstimationHistoryTran estimationHistoryTran) {
		getEstimationHistoryTrans().add(estimationHistoryTran);
		estimationHistoryTran.setModelMst(this);

		return estimationHistoryTran;
	}

	public EstimationHistoryTran removeEstimationHistoryTran(EstimationHistoryTran estimationHistoryTran) {
		getEstimationHistoryTrans().remove(estimationHistoryTran);
		estimationHistoryTran.setModelMst(null);

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
		estimationTran.setModelMst(this);

		return estimationTran;
	}

	public EstimationTran removeEstimationTran(EstimationTran estimationTran) {
		getEstimationTrans().remove(estimationTran);
		estimationTran.setModelMst(null);

		return estimationTran;
	}

	public List<ModelCampaignRel> getModelCampaignRels() {
		return this.modelCampaignRels;
	}

	public void setModelCampaignRels(List<ModelCampaignRel> modelCampaignRels) {
		this.modelCampaignRels = modelCampaignRels;
	}

	public ModelCampaignRel addModelCampaignRel(ModelCampaignRel modelCampaignRel) {
		getModelCampaignRels().add(modelCampaignRel);
		modelCampaignRel.setModelMst(this);

		return modelCampaignRel;
	}

	public ModelCampaignRel removeModelCampaignRel(ModelCampaignRel modelCampaignRel) {
		getModelCampaignRels().remove(modelCampaignRel);
		modelCampaignRel.setModelMst(null);

		return modelCampaignRel;
	}

	public List<ModelGenerationRel> getModelGenerationRels() {
		return this.modelGenerationRels;
	}

	public void setModelGenerationRels(List<ModelGenerationRel> modelGenerationRels) {
		this.modelGenerationRels = modelGenerationRels;
	}

	public ModelGenerationRel addModelGenerationRel(ModelGenerationRel modelGenerationRel) {
		getModelGenerationRels().add(modelGenerationRel);
		modelGenerationRel.setModelMst(this);

		return modelGenerationRel;
	}

	public ModelGenerationRel removeModelGenerationRel(ModelGenerationRel modelGenerationRel) {
		getModelGenerationRels().remove(modelGenerationRel);
		modelGenerationRel.setModelMst(null);

		return modelGenerationRel;
	}

	public List<ModelItemRel> getModelItemRels() {
		return this.modelItemRels;
	}

	public void setModelItemRels(List<ModelItemRel> modelItemRels) {
		this.modelItemRels = modelItemRels;
	}

	public ModelItemRel addModelItemRel(ModelItemRel modelItemRel) {
		getModelItemRels().add(modelItemRel);
		modelItemRel.setModelMst(this);

		return modelItemRel;
	}

	public ModelItemRel removeModelItemRel(ModelItemRel modelItemRel) {
		getModelItemRels().remove(modelItemRel);
		modelItemRel.setModelMst(null);

		return modelItemRel;
	}

	public List<PayMst> getPayMsts() {
		return this.payMsts;
	}

	public void setPayMsts(List<PayMst> payMsts) {
		this.payMsts = payMsts;
	}

	public PayMst addPayMst(PayMst payMst) {
		getPayMsts().add(payMst);
		payMst.setModelMst(this);

		return payMst;
	}

	public PayMst removePayMst(PayMst payMst) {
		getPayMsts().remove(payMst);
		payMst.setModelMst(null);

		return payMst;
	}

	public List<ModelCodeMst> getModelCodeMsts() {
		return this.modelCodeMsts;
	}

	public void setModelCodeMsts(List<ModelCodeMst> modelCodeMsts) {
		this.modelCodeMsts = modelCodeMsts;
	}

	public ModelCodeMst addModelCodeMst(ModelCodeMst modelCodeMst) {
		getModelCodeMsts().add(modelCodeMst);
		modelCodeMst.setModelMst(this);

		return modelCodeMst;
	}

	public ModelCodeMst removeModelCodeMst(ModelCodeMst modelCodeMst) {
		getModelCodeMsts().remove(modelCodeMst);
		modelCodeMst.setModelMst(null);

		return modelCodeMst;
	}
	public Integer getSaleStart() {
		Integer saleStart = null;
		if (!this.modelGenerationRels.isEmpty()) {
			for (ModelGenerationRel modelGeneratioRel : this.modelGenerationRels) {
				if (modelGeneratioRel.getGenerationMst() != null && modelGeneratioRel.getGenerationMst().getSaleStart() != null) {
					if (saleStart == null || modelGeneratioRel.getGenerationMst().getSaleStart() < saleStart) {
						saleStart = modelGeneratioRel.getGenerationMst().getSaleStart();
					}
				}
			}
		}
		return saleStart;
	}
	public List<GenerationMst> getSortListGenerationMst() {
		List<GenerationMst> lsGeneration = new ArrayList<GenerationMst>();
		if (!this.modelGenerationRels.isEmpty()) {
			for (ModelGenerationRel modelGeneratioRel : this.modelGenerationRels) {
				lsGeneration.add(modelGeneratioRel.getGenerationMst());
			}
		}
		lsGeneration.sort(Comparator.comparing(GenerationMst::getSaleStartNotNull).reversed());
		return lsGeneration;
	}
}