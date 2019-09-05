// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricConstraintResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ca6001c7-db80-4168-bd0d-32259a34d423")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLocalPlacement extends IfcObjectPlacement
{
	@JacksonXmlProperty(isAttribute=false, localName = "PlacementRelTo")
	@Description("Reference to Object that provides the relative placement by its local coordinate system. If it is omitted, then the local placement is given to the WCS, established by the geometric representation context.")
	@Guid("95a6cbc5-4fea-41ff-9339-39146977d569")
	private com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcObjectPlacement placementRelTo;

	@Description("Geometric placement that defines the transformation from the related coordinate system into the relating. The placement can be either 2D or 3D, depending on the dimension count of the coordinate system.")
	@Required()
	@Guid("519d256d-2c79-4cf3-b785-70dbe9291d0d")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement relativePlacement;


	public IfcLocalPlacement()
	{
	}

	public IfcLocalPlacement(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement relativePlacement)
	{
		this.relativePlacement = relativePlacement;
	}

	public com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcObjectPlacement getPlacementRelTo() {
		return this.placementRelTo;
	}

	public void setPlacementRelTo(com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcObjectPlacement placementRelTo) {
		this.placementRelTo = placementRelTo;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement getRelativePlacement() {
		return this.relativePlacement;
	}

	public void setRelativePlacement(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement relativePlacement) {
		this.relativePlacement = relativePlacement;
	}


}

