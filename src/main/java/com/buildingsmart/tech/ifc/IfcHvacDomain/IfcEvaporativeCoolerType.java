// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1b538bfd-de8a-4443-a6f0-4c1aade608e4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcEvaporativeCoolerType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Defines the type of evaporative cooler.")
	@Required()
	@Guid("0c69e1a9-5536-4c40-97e6-9df634ea2fb9")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcEvaporativeCoolerTypeEnum predefinedType;


	public IfcEvaporativeCoolerType()
	{
	}

	public IfcEvaporativeCoolerType(String globalId, com.buildingsmart.tech.ifc.IfcHvacDomain.IfcEvaporativeCoolerTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcEvaporativeCoolerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcEvaporativeCoolerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

