// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("7116fa64-a466-426e-84ce-c82bc9a1a8c4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStairFlightType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Identifies the predefined types of a stair flight element from which the type required may be set.")
	@Required()
	@Guid("98a534c4-1869-4ab9-bce9-09a9d58b35de")
	private com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcStairFlightTypeEnum predefinedType;


	public IfcStairFlightType()
	{
	}

	public IfcStairFlightType(String globalId, com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcStairFlightTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcStairFlightTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcStairFlightTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

