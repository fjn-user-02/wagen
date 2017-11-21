package focus.wagen.dao;

import java.util.List;

import focus.wagen.entity.EstimationTran;

public interface IEstimationTranDao {
	List<EstimationTran> getEstimationTran(Integer shopId, Integer dealerId, String estimatedNumber);
	void saveObject(EstimationTran objEstimationTran);
}
