package focus.wagen.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the item_category_rel database table.
 * 
 */
@Entity
@Table(name="item_category_rel")
@NamedQuery(name="ItemCategoryRel.findAll", query="SELECT i FROM ItemCategoryRel i")
public class ItemCategoryRel implements Serializable {
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

	//bi-directional many-to-one association to ItemCategoryMst
	@ManyToOne
	@JoinColumn(name="category_id")
	private ItemCategoryMst itemCategoryMst;

	//bi-directional many-to-one association to ItemMst
	@ManyToOne
	@JoinColumn(name="item_id")
	private ItemMst itemMst;

	public ItemCategoryRel() {
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

	public ItemCategoryMst getItemCategoryMst() {
		return this.itemCategoryMst;
	}

	public void setItemCategoryMst(ItemCategoryMst itemCategoryMst) {
		this.itemCategoryMst = itemCategoryMst;
	}

	public ItemMst getItemMst() {
		return this.itemMst;
	}

	public void setItemMst(ItemMst itemMst) {
		this.itemMst = itemMst;
	}

}