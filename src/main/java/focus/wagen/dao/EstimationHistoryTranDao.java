package focus.wagen.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import focus.wagen.entity.EstimationHistoryTran;

@Transactional
@Repository
public class EstimationHistoryTranDao implements IEstimationHistoryTranDao {
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<EstimationHistoryTran> getAllEstimationHistories(Integer shopId, Integer dealerId) {
		List<EstimationHistoryTran> lstEstimationHistoryTran = null;
		try {
			String hql = "FROM EstimationHistoryTran"
					+ " WHERE delFlg = false"
					+ " AND shopMst.id = " + shopId
					+ " AND dealerMst.id = " + dealerId
					+ " ORDER BY estimatedNumber desc";
			lstEstimationHistoryTran =  entityManager.createQuery(hql).getResultList();
		} catch (Exception e) {
			lstEstimationHistoryTran = null;
		}
		return lstEstimationHistoryTran;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<EstimationHistoryTran> getEstimationHistoryTran(Integer shopId, Integer dealerId, String estimatedNumber) {
		List<EstimationHistoryTran> lstEstimationHistoryTran = null;
		try {
			if (dealerId != null && shopId != null && estimatedNumber != null) {
				String hql = "FROM EstimationHistoryTran"
						+ " WHERE delFlg = false"
						+ " AND estimatedNumber = '" + estimatedNumber + "'"
						+ " AND shopMst.id = " + shopId
						+ " AND dealerMst.id = " + dealerId;
				lstEstimationHistoryTran =  entityManager.createQuery(hql).getResultList();
			}
		} catch (Exception e) {
			lstEstimationHistoryTran = null;
		}
		return lstEstimationHistoryTran;
	}
	@Override
	public void saveObject(EstimationHistoryTran objEstimationHistoryTran) {
		entityManager.merge(objEstimationHistoryTran);
	}
}