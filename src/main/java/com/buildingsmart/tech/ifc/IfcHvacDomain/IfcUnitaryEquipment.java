// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("91a67370-1792-470c-855a-3bb193e960ea")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcUnitaryEquipment extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDevice
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("d539b3ab-a9b3-46f5-8d41-4a5a38a2bc2a")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcUnitaryEquipmentTypeEnum predefinedType;


	public IfcUnitaryEquipment()
	{
	}

	public IfcUnitaryEquipment(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcUnitaryEquipmentTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcUnitaryEquipmentTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

