package focus.wagen.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the pay_mst database table.
 * 
 */
@Entity
@Table(name="pay_mst")
@NamedQuery(name="PayMst.findAll", query="SELECT p FROM PayMst p")
public class PayMst implements Serializable {
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

	@Column(name="pause_flg")
	private Boolean pauseFlg;

	private BigDecimal price;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_user")
	private Integer updateUser;

	@Column(name="view_priority")
	private Integer viewPriority;

	//bi-directional many-to-one association to DealerMst
	@ManyToOne
	@JoinColumn(name="dealer_id")
	private DealerMst dealerMst;

	//bi-directional many-to-one association to ModelMst
	@ManyToOne
	@JoinColumn(name="model_id")
	private ModelMst modelMst;

	//bi-directional many-to-one association to ShopMst
	@ManyToOne
	@JoinColumn(name="shop_id")
	private ShopMst shopMst;

	public PayMst() {
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

	public void setViewPriority(Integer viewPriority) {
		this.viewPriority = viewPriority;
	}

	public DealerMst getDealerMst() {
		return this.dealerMst;
	}

	public void setDealerMst(DealerMst dealerMst) {
		this.dealerMst = dealerMst;
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

}