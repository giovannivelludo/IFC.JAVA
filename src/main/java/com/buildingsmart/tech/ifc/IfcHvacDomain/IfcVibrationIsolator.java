// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("422d8476-9b6c-4321-9f99-2f6340f87108")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcVibrationIsolator extends com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcElementComponent
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Guid("c48ed4dc-cc29-4b6b-ad43-262290a082ae")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcVibrationIsolatorTypeEnum predefinedType;


	public IfcVibrationIsolator()
	{
	}

	public IfcVibrationIsolator(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcVibrationIsolatorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcVibrationIsolatorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

