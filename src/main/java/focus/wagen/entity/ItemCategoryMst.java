package focus.wagen.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the item_category_mst database table.
 * 
 */
@Entity
@Table(name="item_category_mst")
@NamedQuery(name="ItemCategoryMst.findAll", query="SELECT i FROM ItemCategoryMst i")
public class ItemCategoryMst implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="category_code")
	private String categoryCode;

	@Column(name="category_name")
	private String categoryName;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="create_user")
	private Integer createUser;

	@Column(name="del_flg")
	private Boolean delFlg;

	@Column(name="pause_flg")
	private Boolean pauseFlg;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_user")
	private Integer updateUser;

	//bi-directional many-to-one association to ItemCategoryRel
	@OneToMany(mappedBy="itemCategoryMst")
	private List<ItemCategoryRel> itemCategoryRels;

	public ItemCategoryMst() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	public List<ItemCategoryRel> getItemCategoryRels() {
		return this.itemCategoryRels;
	}

	public void setItemCategoryRels(List<ItemCategoryRel> itemCategoryRels) {
		this.itemCategoryRels = itemCategoryRels;
	}

	public ItemCategoryRel addItemCategoryRel(ItemCategoryRel itemCategoryRel) {
		getItemCategoryRels().add(itemCategoryRel);
		itemCategoryRel.setItemCategoryMst(this);

		return itemCategoryRel;
	}

	public ItemCategoryRel removeItemCategoryRel(ItemCategoryRel itemCategoryRel) {
		getItemCategoryRels().remove(itemCategoryRel);
		itemCategoryRel.setItemCategoryMst(null);

		return itemCategoryRel;
	}

}