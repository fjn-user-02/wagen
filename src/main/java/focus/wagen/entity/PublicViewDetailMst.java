package focus.wagen.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the public_view_detail_mst database table.
 * 
 */
@Entity
@Table(name="public_view_detail_mst")
@NamedQuery(name="PublicViewDetailMst.findAll", query="SELECT p FROM PublicViewDetailMst p")
public class PublicViewDetailMst implements Serializable {
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

	@Column(name="img_path")
	private String imgPath;

	@Column(name="movie_path")
	private String moviePath;

	@Column(name="pause_flg")
	private Boolean pauseFlg;

	@Column(name="pdf_path")
	private String pdfPath;

	private Integer priority;

	@Column(name="public_name")
	private String publicName;

	@Column(name="public_type")
	private String publicType;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_user")
	private Integer updateUser;

	//bi-directional many-to-one association to PublicViewMst
	@ManyToOne
	@JoinColumn(name="public_view_id")
	private PublicViewMst publicViewMst;

	public PublicViewDetailMst() {
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

	public String getImgPath() {
		return this.imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getMoviePath() {
		return this.moviePath;
	}

	public void setMoviePath(String moviePath) {
		this.moviePath = moviePath;
	}

	public Boolean getPauseFlg() {
		return this.pauseFlg;
	}

	public void setPauseFlg(Boolean pauseFlg) {
		this.pauseFlg = pauseFlg;
	}

	public String getPdfPath() {
		return this.pdfPath;
	}

	public void setPdfPath(String pdfPath) {
		this.pdfPath = pdfPath;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public Integer getPriorityNotNull() {
		return this.priority != null ? this.priority : 0;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getPublicName() {
		return this.publicName;
	}

	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}

	public String getPublicType() {
		return this.publicType;
	}

	public void setPublicType(String publicType) {
		this.publicType = publicType;
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