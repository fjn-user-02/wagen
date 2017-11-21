package focus.wagen.dao;

import java.util.List;

import focus.wagen.entity.EstimationHistoryTran;

public interface IEstimationHistoryTranDao {
	List<EstimationHistoryTran> getAllEstimationHistories(Integer shopId, Integer dealerId);
	List<EstimationHistoryTran> getEstimationHistoryTran(Integer shopId, Integer dealerId, String estimatedNumber);
	void saveObject(EstimationHistoryTran objEstimationHistoryTran);
}
