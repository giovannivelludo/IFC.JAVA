// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("2b00b91e-76da-42f7-9746-994039edb1c4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDamper extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowController
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("a66e6586-fecb-44b3-b66d-1455e7cf9842")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDamperTypeEnum predefinedType;


	public IfcDamper()
	{
	}

	public IfcDamper(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDamperTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDamperTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

