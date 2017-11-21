package focus.wagen.service;

import java.util.HashMap;
import java.util.List;

import focus.wagen.entity.DealerMst;
import focus.wagen.entity.ModelMst;

public interface IModelMstService {
	List<ModelMst> getAllModels();
	ModelMst getModelById(Integer id);
	ModelMst getModelByCode(String modelCode);
	HashMap<String, Object> getItemInfoByModelId(Integer modelId, Integer generationId, Integer categoryId);
	HashMap<String, Object> getCampaignInfoByModelId(Integer modelId, Integer generationId, DealerMst objDealer);
	HashMap<String, Object> getQuotationInfoByModelId(Integer modelId, Integer generationId);
}
