// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1d1df6cf-3322-4902-b83b-0fa2865f7849")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcElectricMotorType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("<p>Identifies the predefined types of electric motor from which the type required may be set.</p>")
	@Required()
	@Guid("c8edf15c-9b31-4641-9aae-198327020ff2")
	private com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricMotorTypeEnum predefinedType;


	public IfcElectricMotorType()
	{
	}

	public IfcElectricMotorType(String globalId, com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricMotorTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricMotorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcElectricMotorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

