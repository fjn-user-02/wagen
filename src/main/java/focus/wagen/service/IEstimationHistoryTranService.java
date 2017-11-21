package focus.wagen.service;

import java.util.List;

import focus.wagen.entity.EstimationHistoryTran;
import focus.wagen.entity.QuotationWrapper;
import focus.wagen.entity.StaffMst;

public interface IEstimationHistoryTranService {
	List<EstimationHistoryTran> getAllEstimationHistories(Integer shopId, Integer dealerId);
	void saveAll(StaffMst objStaffMst, QuotationWrapper quotationList) throws Exception;
	List<EstimationHistoryTran> getEstimationHistoryTran(Integer shopId, Integer dealerId, String estimatedNumber);
}
