package focus.wagen.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import focus.wagen.dao.CampaignViewRelDao;
import focus.wagen.dao.IModelMstDao;
import focus.wagen.entity.CampaignMst;
import focus.wagen.entity.CampaignViewRel;
import focus.wagen.entity.DealerMst;
import focus.wagen.entity.ItemCategoryMst;
import focus.wagen.entity.ItemMst;
import focus.wagen.entity.ModelCampaignRel;
import focus.wagen.entity.ModelItemRel;
import focus.wagen.entity.ModelMst;

@Service
public class ModelMstService implements IModelMstService {
	@Autowired
	private IModelMstDao modelMstDao;
	@Autowired
	private CampaignViewRelDao campaignViewRelDao;

	/**
	 * すべての車種マスタを取得する
	 * 
	 * @return List<ModelMst>
	 */
	@Override
	public List<ModelMst> getAllModels() {
		return modelMstDao.getAllModels();
	}
	/**
	 * 車種マスタを取得する
	 * @param Integer modelId
	 *                車種マスタID
	 * 
	 * @return ModelMst
	 */
	@Override
	public ModelMst getModelById(Integer id) {
		return modelMstDao.getModelById(id);
	}
	
	/**
	 * 車種マスタを取得する
	 * @param String  modelCode
	 *                型式
	 * 
	 * @return ModelMst
	 */
	@Override
	public ModelMst getModelByCode(String modelCode) {
		return modelMstDao.getModelByCode(modelCode);
	}
	/**
	 * アイテム一覧のデータを取得する
	 * 
	 * @param Integer modelId
	 *                車種マスタID
	 * @param Integer generationId
	 *                車種世代マスタID
	 * @param Integer categoryId
	 *                アイテムカテゴリマスタID
	 * 
	 * @return HashMap<String, Object> itemsInfo
	 */
	@Override
	public HashMap<String, Object> getItemInfoByModelId(Integer modelId, Integer generationId, Integer categoryId) {
		// Init variables
		HashMap<String, Object> itemsInfo = new HashMap<String, Object>();
		String modelName = null;
		String modelType = null;
		List<ItemCategoryMst> categorys = new ArrayList<ItemCategoryMst>();
		List<ItemMst> items = new ArrayList<ItemMst>();
		List<ModelMst> models = null;
		// Get model
		if (modelId != null) {
			// Get model by id
			ModelMst model = getModelById(modelId);
			if (model != null) {
				// Add to list models
				models = new ArrayList<ModelMst>();
				models.add(model);
				// Get model name
				modelName = (model.getModelNameB() != null? model.getModelNameB() : "") + (model.getModelName() != null? " " + model.getModelName() : "");
				// Get model type
				modelType = model.getModelType();
			}
		} else {
			// Get all models
			models = getAllModels();
		}
		// Get items from model
		if (models != null) {
			for (ModelMst model : models) {
				if (model != null && model.getModelItemRels() != null) {
					for (ModelItemRel modelItemRel : model.getModelItemRels()) {
						ItemCategoryMst categoryTemp = modelItemRel.getItemMst().getItemCategoryRels().get(0).getItemCategoryMst();
						if (!categorys.contains(categoryTemp)) {
							categorys.add(categoryTemp);
						}
						if ((categoryId == null || categoryTemp.getId() == categoryId) && !items.contains(modelItemRel.getItemMst())) {
							items.add(modelItemRel.getItemMst());
						}
					}
				}
			}
		}
		// Sort categorys
		categorys.sort(Comparator.comparing(ItemCategoryMst::getCategoryCode));
		// Sort items
		items.sort(Comparator.comparing(ItemMst::getViewPriorityNotNull));
		// Set result
		itemsInfo.put("categorys", categorys);
		itemsInfo.put("items", items);
		itemsInfo.put("modelName", modelName);
		itemsInfo.put("modelType", modelType);
		// Return data
		return itemsInfo;
	}
	/**
	 * キャンペーン一覧のデータを取得する
	 * 
	 * @param Integer modelId
	 *                車種マスタID
	 * @param Integer generationId
	 *                車種世代マスタID
	 * 
	 * @return HashMap<String, Object> campaignsInfo
	 */
	@Override
	public HashMap<String, Object> getCampaignInfoByModelId(Integer modelId, Integer generationId, DealerMst objDealer) {
		// Init variables
		HashMap<String, Object> campaignsInfo = new HashMap<String, Object>();
		String modelName = null;
		String modelType = null;
		List<CampaignMst> campaigns = new ArrayList<CampaignMst>();
		List<ModelMst> models = null;
		// Get model
		if (modelId != null) {
			// Get model by id
			ModelMst model = getModelById(modelId);
			if (model != null) {
				// Add to list models
				models = new ArrayList<ModelMst>();
				models.add(model);
				// Get model name
				modelName = (model.getModelNameB() != null? model.getModelNameB() : "") + (model.getModelName() != null? " " + model.getModelName() : "");
				// Get model type
				modelType = model.getModelType();
			}
		} else {
			// Get all models
			models = getAllModels();
		}
		// Get campaigns from model
		if (models != null) {
			for (ModelMst model : models) {
				if (model != null && model.getModelCampaignRels() != null) {
					for (ModelCampaignRel modelCampaignRel : model.getModelCampaignRels()) {
						CampaignMst objCampaign = modelCampaignRel.getCampaignMst();
						// Divide the campaigns by dealer_id
						CampaignViewRel campaignViewRel = campaignViewRelDao.findByCampaignMstAndDealerMst(objCampaign, objDealer);
						if (campaignViewRel != null && !campaigns.contains(objCampaign)) {
							campaigns.add(modelCampaignRel.getCampaignMst());
						}
					}
				}
			}
		}
		// Sort campaigns
		campaigns.sort(Comparator.comparing(CampaignMst::getViewPriorityNotNull));
		// Set result
		campaignsInfo.put("campaigns", campaigns);
		campaignsInfo.put("modelName", modelName);
		campaignsInfo.put("modelType", modelType);
		// Return data
		return campaignsInfo;
	}
	/**
	 * 見積り詳細のデータを取得する
	 * 
	 * @param Integer modelId
	 *                車種マスタID
	 * @param Integer generationId
	 *                車種世代マスタID
	 * 
	 * @return HashMap<String, Object> quotationInfo
	 */
	@Override
	public HashMap<String, Object> getQuotationInfoByModelId(Integer modelId, Integer generationId) {
		// Init variables
		HashMap<String, Object> quotationInfo = new HashMap<String, Object>();
		String modelName = null;
		String modelType = null;
		// Get model
		ModelMst model = getModelById(modelId);
		if (model != null) {
			// Get model name
			modelName = (model.getModelNameB() != null? model.getModelNameB() : "") + (model.getModelName() != null? " " + model.getModelName() : "");
			// Get model type
			modelType = model.getModelType();
		}
		// Set result
		quotationInfo.put("modelName", modelName);
		quotationInfo.put("modelType", modelType);
		// Return data
		return quotationInfo;
	}
}
