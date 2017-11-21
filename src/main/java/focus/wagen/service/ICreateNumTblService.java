package focus.wagen.service;

import focus.wagen.entity.DealerMst;

public interface ICreateNumTblService {
	String getEstimateNumber(DealerMst dealerMst, Integer staffId) throws Exception;
}
