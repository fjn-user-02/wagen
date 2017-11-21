package focus.wagen.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import focus.wagen.entity.PublicViewMst;

@Transactional
@Repository
public class PublicViewMstDao implements IPublicViewMstDao {
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<PublicViewMst> getAllHomeLayouts() {
		String hql = " FROM PublicViewMst  WHERE delFlg = false AND pauseFlg = false";
		return (List<PublicViewMst>) entityManager.createQuery(hql).getResultList();
	}
}