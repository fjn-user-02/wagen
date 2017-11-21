package focus.wagen.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import focus.wagen.entity.ItemMst;

@Transactional
@Repository

public class ItemMstDao implements IItemMstDao {
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public ItemMst getItemByCode(String itemCode) {
		ItemMst objItemMst = null;
		try {
			if (itemCode != null) {
				String hql = "FROM ItemMst WHERE delFlg = false AND itemCode = '" + itemCode +"'";
				objItemMst = (ItemMst) entityManager.createQuery(hql).getSingleResult();
			}
		} catch (Exception e) {
			objItemMst = null;
		}
		return objItemMst;
	}
}
