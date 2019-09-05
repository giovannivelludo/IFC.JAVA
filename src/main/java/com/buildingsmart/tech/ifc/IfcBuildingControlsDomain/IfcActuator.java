// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcBuildingControlsDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("88e31a97-fc93-413c-9a8f-f55d4f201c19")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcActuator extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElement
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("f9dfdf92-2352-4175-9f0b-a2490720e992")
	private com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcActuatorTypeEnum predefinedType;


	public IfcActuator()
	{
	}

	public IfcActuator(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcActuatorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcActuatorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

