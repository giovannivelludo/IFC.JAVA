// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("3770d6cc-7b84-41f9-b413-dd23f8cab584")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCrewResource extends IfcConstructionResource
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Defines types of crew resources.  <blockquote class=\"change-ifc2x4\">IFC4 New attribute.</blockquote>")
	@Guid("fd0a2ad8-3efa-46e5-a534-fefe0d6f9bce")
	private com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcCrewResourceTypeEnum predefinedType;


	public IfcCrewResource()
	{
	}

	public IfcCrewResource(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcCrewResourceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain.IfcCrewResourceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

