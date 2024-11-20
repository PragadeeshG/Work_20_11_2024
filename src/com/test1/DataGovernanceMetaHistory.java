package com.test1;

public class DataGovernanceMetaHistory {
	private String historyDate;
	private String governanceIdentifier;
	private String successPolicies;
	private String dailurePolicies;
	private String autoComplete;
	private boolean requirementsMet;
	private String causeAnalysis;
	private String plugins;
	private String pluginSystems;
	private String governanceType;
	private String fixDoneForFuture;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataGovernanceMetaHistory() {

	}

	public DataGovernanceMetaHistory(String historyDate, String governanceIdentifier, String successPolicies,
			String dailurePolicies, String autoComplete, boolean requirementsMet, String causeAnalysis, String plugins,
			String pluginSystems, String governanceType, String fixDoneForFuture, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.historyDate = historyDate;
		this.governanceIdentifier = governanceIdentifier;
		this.successPolicies = successPolicies;
		this.dailurePolicies = dailurePolicies;
		this.autoComplete = autoComplete;
		this.requirementsMet = requirementsMet;
		this.causeAnalysis = causeAnalysis;
		this.plugins = plugins;
		this.pluginSystems = pluginSystems;
		this.governanceType = governanceType;
		this.fixDoneForFuture = fixDoneForFuture;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getHistoryDate() {
		return historyDate;
	}

	public void setHistoryDate(String historyDate) {
		this.historyDate = historyDate;
	}

	public String getGovernanceIdentifier() {
		return governanceIdentifier;
	}

	public void setGovernanceIdentifier(String governanceIdentifier) {
		this.governanceIdentifier = governanceIdentifier;
	}

	public String getSuccessPolicies() {
		return successPolicies;
	}

	public void setSuccessPolicies(String successPolicies) {
		this.successPolicies = successPolicies;
	}

	public String getDailurePolicies() {
		return dailurePolicies;
	}

	public void setDailurePolicies(String dailurePolicies) {
		this.dailurePolicies = dailurePolicies;
	}

	public String getAutoComplete() {
		return autoComplete;
	}

	public void setAutoComplete(String autoComplete) {
		this.autoComplete = autoComplete;
	}

	public boolean isRequirementsMet() {
		return requirementsMet;
	}

	public void setRequirementsMet(boolean requirementsMet) {
		this.requirementsMet = requirementsMet;
	}

	public String getCauseAnalysis() {
		return causeAnalysis;
	}

	public void setCauseAnalysis(String causeAnalysis) {
		this.causeAnalysis = causeAnalysis;
	}

	public String getPlugins() {
		return plugins;
	}

	public void setPlugins(String plugins) {
		this.plugins = plugins;
	}

	public String getPluginSystems() {
		return pluginSystems;
	}

	public void setPluginSystems(String pluginSystems) {
		this.pluginSystems = pluginSystems;
	}

	public String getGovernanceType() {
		return governanceType;
	}

	public void setGovernanceType(String governanceType) {
		this.governanceType = governanceType;
	}

	public String getFixDoneForFuture() {
		return fixDoneForFuture;
	}

	public void setFixDoneForFuture(String fixDoneForFuture) {
		this.fixDoneForFuture = fixDoneForFuture;
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
