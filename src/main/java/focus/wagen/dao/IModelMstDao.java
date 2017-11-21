package focus.wagen.dao;

import java.util.List;

import focus.wagen.entity.ModelMst;

public interface IModelMstDao {
	List<ModelMst> getAllModels();
	ModelMst getModelById(Integer id);
	ModelMst getModelByCode(String modelCode);
}
