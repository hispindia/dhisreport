package org.openmrs.module.dhisreport.api.dfx2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "metadata")
@XmlAccessorType(XmlAccessType.FIELD)
public class Metadata {

	@XmlElement(name = "organisationUnits", type = OrganisationUnits.class)
	private OrganisationUnits organisationUnits;

	public OrganisationUnits getOrganisationUnits() {
		return organisationUnits;
	}

	public void setOrganisationUnits(OrganisationUnits organisationUnits) {
		this.organisationUnits = organisationUnits;
	}

}
