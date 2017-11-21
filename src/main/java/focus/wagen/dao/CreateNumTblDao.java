package focus.wagen.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import focus.wagen.entity.CreateNumTbl;

@Transactional
@Repository

public class CreateNumTblDao implements ICreateNumTblDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public CreateNumTbl getCreateNumTbl(Integer dealerId) {
		CreateNumTbl objCreateNumTbl = null;
		if (dealerId != null) {
			try {
				String hql = "FROM CreateNumTbl WHERE delFlg = false AND pauseFlg = false AND dealerMst.id = " + dealerId;
				objCreateNumTbl = (CreateNumTbl) entityManager.createQuery(hql).getSingleResult();
			} catch (NoResultException e) {
				objCreateNumTbl = null;
			}
		}
		return objCreateNumTbl;
	}
	@Override
	public void saveObject(CreateNumTbl objCreateNumTbl) {
		entityManager.persist(objCreateNumTbl);
	}
}
