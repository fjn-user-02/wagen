package focus.wagen.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import focus.wagen.entity.PublicViewDetailMst;

@Transactional
public interface PublicViewDetailMstDao extends CrudRepository<PublicViewDetailMst, Long> {
	List<PublicViewDetailMst> findAll();
}