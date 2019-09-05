// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0a9c68ca-5836-4bfb-918b-1ac3287c9e8d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcEngine extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("058eca30-4bce-432c-8765-8aecc95e6e30")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcEngineTypeEnum predefinedType;


	public IfcEngine()
	{
	}

	public IfcEngine(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcEngineTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcEngineTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

