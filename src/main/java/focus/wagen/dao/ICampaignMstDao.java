package focus.wagen.dao;

import focus.wagen.entity.CampaignMst;

public interface ICampaignMstDao {
	CampaignMst getCampaignByCode(String campaignCode);
}
