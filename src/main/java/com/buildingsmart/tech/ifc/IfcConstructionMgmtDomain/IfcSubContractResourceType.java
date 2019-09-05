// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("352fd6e0-58e5-4a63-905c-991b1079ef81")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSubContractResourceType extends IfcConstructionResourceType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Defines types of subcontract resources.  <p></p>")
	@Required()
	@Guid("5a5ee4dc-db65-4bab-b553-4a7593fedbe1")
	private com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcSubContractResourceTypeEnum predefinedType;


	public IfcSubContractResourceType()
	{
	}

	public IfcSubContractResourceType(String globalId, com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcSubContractResourceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcSubContractResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcSubContractResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

