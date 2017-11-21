package focus.wagen.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import focus.wagen.entity.ModelMst;

@Transactional
@Repository
public class ModelMstDao implements IModelMstDao {
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<ModelMst> getAllModels() {
		String hql = "FROM ModelMst WHERE delFlg = false AND pauseFlg = false ORDER BY modelName";
		return (List<ModelMst>) entityManager.createQuery(hql).getResultList();
	}
	@Override
	public ModelMst getModelById(Integer id) {
		ModelMst objModel = null;
		try {
			if (id != null) {
				String hql = "FROM ModelMst WHERE delFlg = false AND pauseFlg = false AND id = " + id;
				objModel = (ModelMst) entityManager.createQuery(hql).getSingleResult();
			}
		} catch (Exception e) {
			objModel = null;
		}
		return objModel;
	}
	@Override
	public ModelMst getModelByCode(String modelCode) {
		ModelMst objModel = null;
		try {
			if (modelCode != null) {
				String hql = "FROM ModelMst WHERE delFlg = false AND pauseFlg = false AND modelCode = " + modelCode;
				objModel = (ModelMst) entityManager.createQuery(hql).getSingleResult();
			}
		} catch (Exception e) {
			objModel = null;
		}
		return objModel;
	}
}
