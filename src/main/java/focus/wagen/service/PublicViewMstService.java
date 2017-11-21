package focus.wagen.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import focus.wagen.dao.IPublicViewMstDao;
import focus.wagen.entity.PublicViewDetailMst;
import focus.wagen.entity.PublicViewMst;

@Service
public class PublicViewMstService implements IPublicViewMstService {
	@Autowired
	private IPublicViewMstDao homeLayoutMstDao;

	/**
	 * データフッターを取得する
	 */
	@Override
	public HashMap<String, Object> getAllPublicViews(String shopCode, String dealerCode) {
		HashMap<String, Object> bannersInfo = new HashMap<String, Object>();

		// Create object
		List<PublicViewMst> banners = new ArrayList<PublicViewMst>();
		List<PublicViewDetailMst> movies = new ArrayList<PublicViewDetailMst>();
		List<PublicViewDetailMst> catalogs = new ArrayList<PublicViewDetailMst>();

		// Get data HomeLayoutMst
		List<PublicViewMst> publicViewInfo = homeLayoutMstDao.getAllHomeLayouts();

		if (!publicViewInfo.isEmpty()) {
			for (PublicViewMst publicView : publicViewInfo) {
				if (publicView.getHomeLayoutMsts().get(0).getShopId() != Integer.parseInt(shopCode)
						|| publicView.getHomeLayoutMsts().get(0).getDealerId() != Integer.parseInt(dealerCode)
						|| "0".equals(publicView.getPublicPattern())) {
					continue;
				}

				// Add banner data
				banners.add(publicView);

				// Add movie preview data
				if (publicView.getAreaName().equals("movie")) {
					movies.addAll(publicView.getPublicViewDetailMsts());
					movies.sort(Comparator.comparing(PublicViewDetailMst::getPriorityNotNull));
				// Add catalog preview data
				} else if (publicView.getAreaName().equals("catalog")) {
					catalogs.addAll(publicView.getPublicViewDetailMsts());
					catalogs.sort(Comparator.comparing(PublicViewDetailMst::getPriorityNotNull));
				}
			}
		}

		// Add data footer
		bannersInfo.put("banners", banners);
		bannersInfo.put("bannerSize", banners.size());
		bannersInfo.put("movies", movies);
		bannersInfo.put("catalogs", catalogs);

		return bannersInfo;
	}
}
