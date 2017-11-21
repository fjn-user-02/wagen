package focus.wagen.service;

import focus.wagen.entity.QuotationWrapper;
import focus.wagen.entity.StaffMst;

public interface IEstimationTranService {

	void saveAll(StaffMst objStaffMst, QuotationWrapper quotationList)
			throws Exception;
}
