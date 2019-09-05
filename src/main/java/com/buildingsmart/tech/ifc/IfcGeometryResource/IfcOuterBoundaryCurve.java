// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("60960f2c-b80f-43e7-8eeb-90df0e0349cf")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcOuterBoundaryCurve extends IfcBoundaryCurve
{

	public IfcOuterBoundaryCurve()
	{
	}

	public IfcOuterBoundaryCurve(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurveSegment[] segments, Boolean selfIntersect)
	{
		super(segments, selfIntersect);
	}


}

