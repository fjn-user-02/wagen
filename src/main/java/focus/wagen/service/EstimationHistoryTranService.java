package focus.wagen.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import focus.wagen.dao.IEstimationHistoryTranDao;
import focus.wagen.entity.EstimationHistoryTran;
import focus.wagen.entity.QuotationWrapper;
import focus.wagen.entity.StaffMst;

@Service
public class EstimationHistoryTranService implements IEstimationHistoryTranService {
	@Autowired
	private IEstimationHistoryTranDao estimationHistoryTranDao;
	@Override
	public List<EstimationHistoryTran> getAllEstimationHistories(Integer shopId, Integer dealerId) {
		// Get all data EstimationHistoryTran
		List<EstimationHistoryTran> estimationHistoryTran = estimationHistoryTranDao.getAllEstimationHistories(shopId, dealerId);

		// Get distinct data by estimatedNumber
		List<EstimationHistoryTran> histories = new ArrayList<EstimationHistoryTran>();
		String estimatedNumber = "";
		for (EstimationHistoryTran history : estimationHistoryTran ) {
			if (history.getEstimatedNumber() != null && !history.getEstimatedNumber().equals(estimatedNumber)) {
				histories.add(history);
			}
			estimatedNumber = history.getEstimatedNumber();
		}
		return histories;
	}

	@Override
	public List<EstimationHistoryTran> getEstimationHistoryTran(Integer shopId, Integer dealerId, String estimatedNumber) {
		return estimationHistoryTranDao.getEstimationHistoryTran(shopId, dealerId, estimatedNumber);
	}

	@Override
	public void saveAll(StaffMst objStaffMst, QuotationWrapper quotationList) throws Exception {
		// Get dealer id
		Integer dealerId = objStaffMst.getDealerMst().getId();
		
		// Get shop id
		Integer shopId = objStaffMst.getShopMst().getId();
		
		// Get quotation number
		String quotationNumber = quotationList.getQuotationNumber();
		
		// Get date now
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String strDate= dateFormat.format(new Date());
		Date dateNow = dateFormat.parse(strDate);
		
		// Get EstimationHistoryTran
		List<EstimationHistoryTran> lstEstimationHistoryTranFromDatabase = estimationHistoryTranDao.getEstimationHistoryTran(shopId, dealerId, quotationNumber);
		
		// List EstimationHistoryTran for update
		List<EstimationHistoryTran> lstEstimationHistoryTranUpdate = new ArrayList<EstimationHistoryTran>();
		
		// Loop estimation history tran from database
		for (EstimationHistoryTran objEstimationHistoryTranTemp : lstEstimationHistoryTranFromDatabase) {
			// Get data for condition
			Integer modelId = objEstimationHistoryTranTemp.getModelMst().getId();
			Integer itemId = objEstimationHistoryTranTemp.getItemMst() != null? objEstimationHistoryTranTemp.getItemMst().getId() : null;
			Integer campaignId = objEstimationHistoryTranTemp.getCampaignMst() != null? objEstimationHistoryTranTemp.getCampaignMst().getId() : null;
			
			// Get objEstimationHistoryTranTemp from data submit
			EstimationHistoryTran EstimationHistoryTran = quotationList.getEstimationHistoryTransByCondition(modelId, itemId, campaignId);
			
			// Update data submit
			if (EstimationHistoryTran != null) {
				// Set old info
				EstimationHistoryTran.setId(objEstimationHistoryTranTemp.getId());
				EstimationHistoryTran.setShopMst(objEstimationHistoryTranTemp.getShopMst());
				EstimationHistoryTran.setDealerMst(objEstimationHistoryTranTemp.getDealerMst());
				EstimationHistoryTran.setCreateAccount(objEstimationHistoryTranTemp.getCreateAccount());
				EstimationHistoryTran.setCreateUser(objEstimationHistoryTranTemp.getCreateUser());
				EstimationHistoryTran.setCreateDate(objEstimationHistoryTranTemp.getCreateDate());
				EstimationHistoryTran.setDelFlg(objEstimationHistoryTranTemp.getDelFlg());
				// Add to update list
				lstEstimationHistoryTranUpdate.add(EstimationHistoryTran);
				// Remove estimation history tran from list submit data
				quotationList.removetEstimationHistoryTran(EstimationHistoryTran);
			} else {
				// Delete estimation history tran from database
				objEstimationHistoryTranTemp.setDelFlg(true);
				// Add to update list
				lstEstimationHistoryTranUpdate.add(objEstimationHistoryTranTemp);
			}
		}
		
		// Loop estimation history tran from data submit
		for (EstimationHistoryTran EstimationHistoryTran : quotationList.getEstimationHistoryTrans()) {
			// Set new info
			EstimationHistoryTran.setShopMst(objStaffMst.getShopMst());
			EstimationHistoryTran.setDealerMst(objStaffMst.getDealerMst());
			EstimationHistoryTran.setCreateUser(objStaffMst.getId());
			EstimationHistoryTran.setCreateAccount(objStaffMst.getAccount());
			EstimationHistoryTran.setCreateDate(dateNow);
			EstimationHistoryTran.setDelFlg(false);
			// Add to update list
			lstEstimationHistoryTranUpdate.add(EstimationHistoryTran);
		}
		
		// Save all object
		for (EstimationHistoryTran EstimationHistoryTran : lstEstimationHistoryTranUpdate) {
			EstimationHistoryTran.setUpdateAccount(objStaffMst.getAccount());
			EstimationHistoryTran.setUpdateUser(objStaffMst.getId());
			EstimationHistoryTran.setUpdateDate(dateNow);
			// Save object
			estimationHistoryTranDao.saveObject(EstimationHistoryTran);
		}
	}
}
