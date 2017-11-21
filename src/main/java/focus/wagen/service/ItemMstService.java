package focus.wagen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import focus.wagen.dao.IItemMstDao;
import focus.wagen.entity.ItemMst;

@Service
public class ItemMstService implements IItemMstService {
	@Autowired
	private IItemMstDao itemMstDao;
	
	@Override
	public ItemMst getItemByCode(String itemCode) {
		return itemMstDao.getItemByCode(itemCode);
	}
}