package focus.wagen.service;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import focus.wagen.dao.CreateNumTblDao;
import focus.wagen.entity.CreateNumTbl;
import focus.wagen.entity.DealerMst;

@Service
public class CreateNumTblService implements ICreateNumTblService {
	@Autowired
	private CreateNumTblDao createNumtblDao;
	
	public String getEstimateNumber(DealerMst dealerMst, Integer staffId) throws Exception {
		// Get objCreateNumTbl
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String strDate= dateFormat.format(new Date());
		Date dateNow = dateFormat.parse(strDate);
		CreateNumTbl objCreateNumTbl = createNumtblDao.getCreateNumTbl(dealerMst.getId());
		// Insert new record if objCreateNumTbl = null
		if (objCreateNumTbl == null) {
			objCreateNumTbl = new CreateNumTbl();
			objCreateNumTbl.setMaxNum(0);
			objCreateNumTbl.setPauseFlg(false);
			objCreateNumTbl.setDelFlg(false);
			objCreateNumTbl.setCreateUser(staffId);
			objCreateNumTbl.setCreateDate(dateNow);
			objCreateNumTbl.setUpdateDate(dateNow);
			objCreateNumTbl.setDealerMst(dealerMst);
		}
		// Check update date and update data
		Date dateUpdate = dateFormat.parse(dateFormat.format(objCreateNumTbl.getUpdateDate()));
		if(!dateUpdate.after(dateNow) && !dateUpdate.before(dateNow)) {
			objCreateNumTbl.setMaxNum(objCreateNumTbl.getMaxNum() + 1);
		} else {
			objCreateNumTbl.setMaxNum(1);
		}
		// Update data
		objCreateNumTbl.setUpdateDate(dateNow);
		objCreateNumTbl.setUpdateUser(staffId);
		createNumtblDao.saveObject(objCreateNumTbl);
		// Get estimate number
		String estimateNumner = new SimpleDateFormat("yyyyMMdd").format(dateNow) + String.format("%03d", objCreateNumTbl.getMaxNum());
		return estimateNumner;
	}
}
