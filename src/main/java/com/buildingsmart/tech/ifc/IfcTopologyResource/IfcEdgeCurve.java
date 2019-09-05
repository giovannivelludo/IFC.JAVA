// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("86ef7edf-f099-47aa-977b-0bc982b8db88")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcEdgeCurve extends IfcEdge implements com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcCurveOrEdgeCurve
{
	@JacksonXmlProperty(isAttribute=false, localName = "EdgeGeometry")
	@Description("The curve which defines the shape and spatial location of the edge. This curve may be unbounded and is implicitly trimmed by the vertices of the edge; this defines the edge domain. Multiple edges can reference the same curve.")
	@Required()
	@Guid("5cdae291-5fb5-4980-bb06-4373b159e076")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve edgeGeometry;

	@JacksonXmlProperty(isAttribute=true, localName = "SameSense")
	@Description("This logical flag indicates whether (TRUE), or not (FALSE) the senses of the edge and the curve defining the edge geometry are the same. The sense of an edge is from the edge start vertex to the edge end vertex; the sense of a curve is in the direction of increasing parameter.")
	@Required()
	@Guid("12a92453-5480-4793-989a-273e604a2079")
	private Boolean sameSense;


	public IfcEdgeCurve()
	{
	}

	public IfcEdgeCurve(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex edgeStart, com.buildingsmart.tech.ifc.IfcTopologyResource.IfcVertex edgeEnd, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve edgeGeometry, Boolean sameSense)
	{
		super(edgeStart, edgeEnd);
		this.edgeGeometry = edgeGeometry;
		this.sameSense = sameSense;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve getEdgeGeometry() {
		return this.edgeGeometry;
	}

	public void setEdgeGeometry(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve edgeGeometry) {
		this.edgeGeometry = edgeGeometry;
	}

	public Boolean getSameSense() {
		return this.sameSense;
	}

	public void setSameSense(Boolean sameSense) {
		this.sameSense = sameSense;
	}


}

