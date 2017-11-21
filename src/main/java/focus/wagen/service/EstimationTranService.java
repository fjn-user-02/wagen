package focus.wagen.service;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import focus.wagen.dao.EstimationTranDao;
import focus.wagen.entity.EstimationTran;
import focus.wagen.entity.QuotationWrapper;
import focus.wagen.entity.StaffMst;
@Service
public class EstimationTranService implements IEstimationTranService {

	@Autowired
	private EstimationTranDao estimationTranDao;
	
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
		
		// Get EstimationTran
		List<EstimationTran> lstEstimationTranFromDatabase = estimationTranDao.getEstimationTran(shopId, dealerId, quotationNumber);
		
		// List EstimationTran for update
		List<EstimationTran> lstEstimationTranUpdate = new ArrayList<EstimationTran>();
		
		// Loop estimation tran from database
		for (EstimationTran objEstimationTranTemp : lstEstimationTranFromDatabase) {
			// Get data for condition
			Integer modelId = objEstimationTranTemp.getModelMst().getId();
			Integer itemId = objEstimationTranTemp.getItemMst() != null? objEstimationTranTemp.getItemMst().getId() : null;
			Integer campaignId = objEstimationTranTemp.getCampaignMst() != null? objEstimationTranTemp.getCampaignMst().getId() : null;
			
			// Get objEstimationTranTemp from data submit
			EstimationTran estimationTran = quotationList.getEstimationTransByCondition(modelId, itemId, campaignId);
			
			// Update data submit
			if (estimationTran != null) {
				// Set old info
				estimationTran.setId(objEstimationTranTemp.getId());
				estimationTran.setShopMst(objEstimationTranTemp.getShopMst());
				estimationTran.setDealerMst(objEstimationTranTemp.getDealerMst());
				estimationTran.setCreateAccount(objEstimationTranTemp.getCreateAccount());
				estimationTran.setCreateUser(objEstimationTranTemp.getCreateUser());
				estimationTran.setCreateDate(objEstimationTranTemp.getCreateDate());
				estimationTran.setDelFlg(objEstimationTranTemp.getDelFlg());
				// Add to update list
				lstEstimationTranUpdate.add(estimationTran);
				// Remove estimation tran from list submit data
				quotationList.removetEstimationTran(estimationTran);
			} else {
				// Delete estimation tran from database
				objEstimationTranTemp.setDelFlg(true);
				// Add to update list
				lstEstimationTranUpdate.add(objEstimationTranTemp);
			}
		}
		
		// Loop estimation tran from data submit
		for (EstimationTran estimationTran : quotationList.getEstimationTrans()) {
			// Set new info
			estimationTran.setShopMst(objStaffMst.getShopMst());
			estimationTran.setDealerMst(objStaffMst.getDealerMst());
			estimationTran.setCreateUser(objStaffMst.getId());
			estimationTran.setCreateAccount(objStaffMst.getAccount());
			estimationTran.setCreateDate(dateNow);
			estimationTran.setDelFlg(false);
			// Add to update list
			lstEstimationTranUpdate.add(estimationTran);
		}
		
		// Save all object
		for (EstimationTran estimationTran : lstEstimationTranUpdate) {
			estimationTran.setUpdateAccount(objStaffMst.getAccount());
			estimationTran.setUpdateUser(objStaffMst.getId());
			estimationTran.setUpdateDate(dateNow);
			// Save object
			estimationTranDao.saveObject(estimationTran);
		}
	}
}
