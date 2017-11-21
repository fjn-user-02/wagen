package focus.wagen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import focus.wagen.dao.ITaxMstDao;
import focus.wagen.entity.TaxMst;

@Service
public class TaxMstService implements ITaxMstService {
	@Autowired
	private ITaxMstDao taxMstDao;
	
	@Override
	public TaxMst getOneTax() {
		return taxMstDao.getOneTax();
	}
}
