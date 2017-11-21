package focus.wagen.entity;
import java.util.List;

/**
 * The persistent class for the dealer_mst database table.
 * 
 */

public class QuotationWrapper {
	
	private Integer taxId;
	private String quotationNumber;
	private String urlPrint;
	private Integer isSendMail;
	private List<EstimationTran> estimationTrans;
	private List<EstimationHistoryTran> estimationHistoryTrans;
	
	public Integer getTaxId() {
		return taxId;
	}
	public String getQuotationNumber() {
		return quotationNumber;
	}
	public String getUrlPrint() {
		return urlPrint;
	}
	public Integer getIsSendMail() {
		return isSendMail;
	}
	public List<EstimationTran> getEstimationTrans() {
		return estimationTrans;
	}
	public List<EstimationHistoryTran> getEstimationHistoryTrans() {
		return estimationHistoryTrans;
	}
	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
	}
	public void setIsSendMail(Integer isSendMail) {
		this.isSendMail = isSendMail;
	}
	public void setQuotationNumber(String quotationNumber) {
		this.quotationNumber = quotationNumber;
	}
	public void setUrlPrint(String urlPrint) {
		this.urlPrint = urlPrint;
	}
	public void setEstimationTrans(List<EstimationTran> estimationTrans) {
		this.estimationTrans = estimationTrans;
	}
	public void setEstimationHistoryTrans(List<EstimationHistoryTran> estimationHistoryTrans) {
		this.estimationHistoryTrans = estimationHistoryTrans;
	}
	public void removetEstimationTran(EstimationTran esTran) {
		this.estimationTrans.remove(esTran);
	}
	public void removetEstimationHistoryTran(EstimationHistoryTran esHisTran) {
		this.estimationHistoryTrans.remove(esHisTran);
	}
	public EstimationTran getEstimationTransByCondition(Integer modelId, Integer itemId, Integer campaignId) {
		if (modelId != null && (itemId != null || campaignId != null)) {
			for(EstimationTran  estimationTran: estimationTrans) {
				if(estimationTran != null
					&& estimationTran.getModelMst() != null
					&& estimationTran.getModelMst().getId().equals(modelId)
					&& (
							(
								itemId != null
								&& estimationTran.getItemMst() != null
								&& estimationTran.getItemMst().getId().equals(itemId)
							)
							||
							(
								campaignId != null
								&& estimationTran.getCampaignMst() != null
								&& estimationTran.getCampaignMst().getId().equals(campaignId)
							)
						)
				) {
					return estimationTran;
				}
			}
		}
		return null;
	}
	public EstimationHistoryTran getEstimationHistoryTransByCondition(Integer modelId, Integer itemId, Integer campaignId) {
		if (modelId != null && (itemId != null || campaignId != null)) {
			for(EstimationHistoryTran  estimationHistoryTran: estimationHistoryTrans) {
				if(estimationHistoryTran != null
					&& estimationHistoryTran.getModelMst() != null
					&& estimationHistoryTran.getModelMst().getId().equals(modelId)
					&& (
							(
								itemId != null
								&& estimationHistoryTran.getItemMst() != null
								&& estimationHistoryTran.getItemMst().getId().equals(itemId)
							)
							||
							(
								campaignId != null
								&& estimationHistoryTran.getCampaignMst() != null
								&& estimationHistoryTran.getCampaignMst().getId().equals(campaignId)
							)
						)
				) {
					return estimationHistoryTran;
				}
			}
		}
		return null;
	}
}