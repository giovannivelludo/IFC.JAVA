// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcBuildingControlsDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("90995dc8-ff72-4331-bff5-af4591a13d27")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAlarm extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElement
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("48e60449-60db-442b-9dda-c0a083a70b41")
	private com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcAlarmTypeEnum predefinedType;


	public IfcAlarm()
	{
	}

	public IfcAlarm(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcAlarmTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcAlarmTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

