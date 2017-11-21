package focus.wagen.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import focus.wagen.entity.EstimationTran;

@Transactional
@Repository
public class EstimationTranDao implements IEstimationTranDao {
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<EstimationTran> getEstimationTran(Integer shopId, Integer dealerId, String estimatedNumber) {
		List<EstimationTran> objEstimationTran = null;
		try {
			if (dealerId != null && shopId != null && estimatedNumber != null) {
				String hql = "FROM EstimationTran"
						+ " WHERE delFlg = false"
						+ " AND estimatedNumber = '" + estimatedNumber + "'"
						+ " AND shopMst.id = " + shopId
						+ " AND dealerMst.id = " + dealerId;
				objEstimationTran = (List<EstimationTran>) entityManager.createQuery(hql).getResultList();
			}
		} catch (Exception e) {
			objEstimationTran = null;
		}
		return objEstimationTran;
	}
	@Override
	public void saveObject(EstimationTran objEstimationTran) {
		entityManager.merge(objEstimationTran);
	}
}