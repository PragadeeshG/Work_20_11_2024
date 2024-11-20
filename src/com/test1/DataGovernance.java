package com.test1;

public class DataGovernance {
	private String governanceIdentifier;
	private String personallyIdentifiableInformation;
	private String IntellectualProperty;
	private String dataVisibility;
	private String secureMobileForce;
	private boolean securityEnforcementFlag;
	private String bringYourOwnDevice;
	private String bringYourOwnDeviceEnvironment;
	private String remoteSystem;
	private String scalability;
	private String cloudSystemSecurity;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataGovernance() {

	}

	public DataGovernance(String governanceIdentifier, String personallyIdentifiableInformation,
			String intellectualProperty, String dataVisibility, String secureMobileForce,
			boolean securityEnforcementFlag, String bringYourOwnDevice, String bringYourOwnDeviceEnvironment,
			String remoteSystem, String scalability, String cloudSystemSecurity, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.governanceIdentifier = governanceIdentifier;
		this.personallyIdentifiableInformation = personallyIdentifiableInformation;
		IntellectualProperty = intellectualProperty;
		this.dataVisibility = dataVisibility;
		this.secureMobileForce = secureMobileForce;
		this.securityEnforcementFlag = securityEnforcementFlag;
		this.bringYourOwnDevice = bringYourOwnDevice;
		this.bringYourOwnDeviceEnvironment = bringYourOwnDeviceEnvironment;
		this.remoteSystem = remoteSystem;
		this.scalability = scalability;
		this.cloudSystemSecurity = cloudSystemSecurity;
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

	public String getPersonallyIdentifiableInformation() {
		return personallyIdentifiableInformation;
	}

	public void setPersonallyIdentifiableInformation(String personallyIdentifiableInformation) {
		this.personallyIdentifiableInformation = personallyIdentifiableInformation;
	}

	public String getIntellectualProperty() {
		return IntellectualProperty;
	}

	public void setIntellectualProperty(String intellectualProperty) {
		IntellectualProperty = intellectualProperty;
	}

	public String getDataVisibility() {
		return dataVisibility;
	}

	public void setDataVisibility(String dataVisibility) {
		this.dataVisibility = dataVisibility;
	}

	public String getSecureMobileForce() {
		return secureMobileForce;
	}

	public void setSecureMobileForce(String secureMobileForce) {
		this.secureMobileForce = secureMobileForce;
	}

	public boolean isSecurityEnforcementFlag() {
		return securityEnforcementFlag;
	}

	public void setSecurityEnforcementFlag(boolean securityEnforcementFlag) {
		this.securityEnforcementFlag = securityEnforcementFlag;
	}

	public String getBringYourOwnDevice() {
		return bringYourOwnDevice;
	}

	public void setBringYourOwnDevice(String bringYourOwnDevice) {
		this.bringYourOwnDevice = bringYourOwnDevice;
	}

	public String getBringYourOwnDeviceEnvironment() {
		return bringYourOwnDeviceEnvironment;
	}

	public void setBringYourOwnDeviceEnvironment(String bringYourOwnDeviceEnvironment) {
		this.bringYourOwnDeviceEnvironment = bringYourOwnDeviceEnvironment;
	}

	public String getRemoteSystem() {
		return remoteSystem;
	}

	public void setRemoteSystem(String remoteSystem) {
		this.remoteSystem = remoteSystem;
	}

	public String getScalability() {
		return scalability;
	}

	public void setScalability(String scalability) {
		this.scalability = scalability;
	}

	public String getCloudSystemSecurity() {
		return cloudSystemSecurity;
	}

	public void setCloudSystemSecurity(String cloudSystemSecurity) {
		this.cloudSystemSecurity = cloudSystemSecurity;
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