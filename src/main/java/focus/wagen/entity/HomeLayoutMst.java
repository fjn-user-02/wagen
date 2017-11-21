package focus.wagen.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the home_layout_mst database table.
 * 
 */
@Entity
@Table(name="home_layout_mst")
@NamedQuery(name="HomeLayoutMst.findAll", query="SELECT h FROM HomeLayoutMst h")
public class HomeLayoutMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="create_user")
	private Integer createUser;

	@Column(name="dealer_id")
	private Integer dealerId;

	@Column(name="del_flg")
	private Boolean delFlg;

	@Column(name="pause_flg")
	private Boolean pauseFlg;

	private Integer priority;

	@Column(name="public_view_type")
	private String publicViewType;

	@Column(name="shop_id")
	private Integer shopId;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_user")
	private Integer updateUser;

	//bi-directional many-to-one association to PublicViewMst
	@ManyToOne
	@JoinColumn(name="public_view_id")
	private PublicViewMst publicViewMst;

	public HomeLayoutMst() {
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

	public Integer getDealerId() {
		return this.dealerId;
	}

	public void setDealerId(Integer dealerId) {
		this.dealerId = dealerId;
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

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getPublicViewType() {
		return this.publicViewType;
	}

	public void setPublicViewType(String publicViewType) {
		this.publicViewType = publicViewType;
	}

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
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

	public PublicViewMst getPublicViewMst() {
		return this.publicViewMst;
	}

	public void setPublicViewMst(PublicViewMst publicViewMst) {
		this.publicViewMst = publicViewMst;
	}

}