package focus.wagen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import focus.wagen.dao.ICampaignMstDao;
import focus.wagen.entity.CampaignMst;

@Service
public class CampaignMstService implements ICampaignMstService {
	@Autowired
	private ICampaignMstDao campaignMstDao;
	
	@Override
	public CampaignMst getCampaignByCode(String campaignCode) {
		return campaignMstDao.getCampaignByCode(campaignCode);
	}
}