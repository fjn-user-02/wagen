package focus.wagen.service;

import java.util.HashMap;

public interface IPublicViewMstService {
	HashMap<String, Object> getAllPublicViews(String shopCode, String dealerCode);
}
