package focus.wagen.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import focus.wagen.entity.TaxMst;

@Transactional
@Repository
public class TaxMstDao implements ITaxMstDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public TaxMst getOneTax() {
		TaxMst objTax = null;
		try {
			String hql = "FROM TaxMst WHERE delFlg = false AND pauseFlg = false ORDER BY id DESC";
			objTax = (TaxMst) entityManager.createQuery(hql).getSingleResult();
		} catch (Exception e) {
			objTax = null;
		}
		return objTax;
	}
}
