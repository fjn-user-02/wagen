package focus.wagen.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import focus.wagen.entity.CampaignMst;
import focus.wagen.entity.CampaignViewRel;
import focus.wagen.entity.DealerMst;

@Transactional
public interface CampaignViewRelDao extends CrudRepository<CampaignViewRel, Long> {
	CampaignViewRel findByCampaignMstAndDealerMst(CampaignMst objCampaign, DealerMst objDealer);
	
}