package focus.wagen.dao;

import focus.wagen.entity.ItemMst;

public interface IItemMstDao {
	public ItemMst getItemByCode(String itemCode);
}
