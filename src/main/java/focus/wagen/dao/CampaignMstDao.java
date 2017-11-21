package focus.wagen.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import focus.wagen.entity.CampaignMst;

@Transactional
@Repository

public class CampaignMstDao implements ICampaignMstDao {
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public CampaignMst getCampaignByCode(String campaignCode) {
		CampaignMst objCampaignMst = null;
		try {
			if (campaignCode != null) {
				String hql = "FROM CampaignMst WHERE delFlg = false AND itemCode = '" + campaignCode +"'";
				objCampaignMst = (CampaignMst) entityManager.createQuery(hql).getSingleResult();
			}
		} catch (Exception e) {
			objCampaignMst = null;
		}
		return objCampaignMst;
	}
}
