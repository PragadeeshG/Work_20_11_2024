package com.test1;

public class DataGovernanceMeta {
	private String governanceIdentifier;
	private String source;
	private String components;
	private String metaDatas;
	private boolean lineageFlow;
	private Integer dataLossRiskIdentfier;
	private boolean reviewRequired;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataGovernanceMeta() {

	}

	public DataGovernanceMeta(String governanceIdentifier, String source, String components, String metaDatas,
			boolean lineageFlow, Integer dataLossRiskIdentfier, boolean reviewRequired, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.governanceIdentifier = governanceIdentifier;
		this.source = source;
		this.components = components;
		this.metaDatas = metaDatas;
		this.lineageFlow = lineageFlow;
		this.dataLossRiskIdentfier = dataLossRiskIdentfier;
		this.reviewRequired = reviewRequired;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getGovernanceIdentifier() {
		return governanceIdentifier;
	}

	public void setGovernanceIdentifier(String governanceIdentifier) {
		this.governanceIdentifier = governanceIdentifier;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getComponents() {
		return components;
	}

	public void setComponents(String components) {
		this.components = components;
	}

	public String getMetaDatas() {
		return metaDatas;
	}

	public void setMetaDatas(String metaDatas) {
		this.metaDatas = metaDatas;
	}

	public boolean isLineageFlow() {
		return lineageFlow;
	}

	public void setLineageFlow(boolean lineageFlow) {
		this.lineageFlow = lineageFlow;
	}

	public Integer getDataLossRiskIdentfier() {
		return dataLossRiskIdentfier;
	}

	public void setDataLossRiskIdentfier(Integer dataLossRiskIdentfier) {
		this.dataLossRiskIdentfier = dataLossRiskIdentfier;
	}

	public boolean isReviewRequired() {
		return reviewRequired;
	}

	public void setReviewRequired(boolean reviewRequired) {
		this.reviewRequired = reviewRequired;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
