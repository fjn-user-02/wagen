package focus.wagen.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Where;

import java.util.Date;


/**
 * The persistent class for the model_campaign_rel database table.
 * 
 */
@Entity
@Table(name="model_campaign_rel")
@NamedQuery(name="ModelCampaignRel.findAll", query="SELECT m FROM ModelCampaignRel m")
public class ModelCampaignRel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="create_user")
	private Integer createUser;

	@Column(name="pause_flg")
	private Boolean pauseFlg;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_user")
	private Integer updateUser;

	//bi-directional many-to-one association to CampaignMst
	@ManyToOne
	@JoinColumn(name="campaign_id")
	@Where(clause="del_flg = false AND pause_flg = false")
	private CampaignMst campaignMst;

	//bi-directional many-to-one association to ModelMst
	@ManyToOne
	@JoinColumn(name="model_id")
	@Where(clause="del_flg = false AND pause_flg = false")
	private ModelMst modelMst;

	public ModelCampaignRel() {
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

	public CampaignMst getCampaignMst() {
		return this.campaignMst;
	}

	public void setCampaignMst(CampaignMst campaignMst) {
		this.campaignMst = campaignMst;
	}

	public ModelMst getModelMst() {
		return this.modelMst;
	}

	public void setModelMst(ModelMst modelMst) {
		this.modelMst = modelMst;
	}

}