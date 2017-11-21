package focus.wagen.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Where;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the generation_mst database table.
 * 
 */
@Entity
@Table(name="generation_mst")
@NamedQuery(name="GenerationMst.findAll", query="SELECT g FROM GenerationMst g")
public class GenerationMst implements Serializable {
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

	private Integer generation;

	@Column(name="pause_flg")
	private Boolean pauseFlg;

	@Column(name="sale_end")
	private Integer saleEnd;

	@Column(name="sale_start")
	private Integer saleStart;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_user")
	private Integer updateUser;

	//bi-directional many-to-one association to ModelGenerationRel
	@OneToMany(mappedBy="generationMst")
	@Where(clause="del_flg = false AND pause_flg = false")
	private List<ModelGenerationRel> modelGenerationRels;

	public GenerationMst() {
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

	public Integer getGeneration() {
		return this.generation;
	}

	public void setGeneration(Integer generation) {
		this.generation = generation;
	}

	public Boolean getPauseFlg() {
		return this.pauseFlg;
	}

	public void setPauseFlg(Boolean pauseFlg) {
		this.pauseFlg = pauseFlg;
	}

	public Integer getSaleEnd() {
		return this.saleEnd;
	}

	public void setSaleEnd(Integer saleEnd) {
		this.saleEnd = saleEnd;
	}

	public Integer getSaleStart() {
		return this.saleStart;
	}

	public Integer getSaleStartNotNull() {
		return this.saleStart != null? this.saleStart : 0;
	}
	
	public void setSaleStart(Integer saleStart) {
		this.saleStart = saleStart;
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

	public List<ModelGenerationRel> getModelGenerationRels() {
		return this.modelGenerationRels;
	}

	public void setModelGenerationRels(List<ModelGenerationRel> modelGenerationRels) {
		this.modelGenerationRels = modelGenerationRels;
	}

	public ModelGenerationRel addModelGenerationRel(ModelGenerationRel modelGenerationRel) {
		getModelGenerationRels().add(modelGenerationRel);
		modelGenerationRel.setGenerationMst(this);

		return modelGenerationRel;
	}

	public ModelGenerationRel removeModelGenerationRel(ModelGenerationRel modelGenerationRel) {
		getModelGenerationRels().remove(modelGenerationRel);
		modelGenerationRel.setGenerationMst(null);

		return modelGenerationRel;
	}

}