// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("c43b29f0-fa72-4a7c-a838-670ae11ec004")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSurfaceStyleRefraction extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem implements IfcSurfaceStyleElementSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "RefractionIndex")
	@Description("The index of refraction for all wave lengths of light. The refraction index is the ratio between the speed of light in a vacuum and the speed of light in the medium. E.g. glass has a refraction index of 1.5, whereas water has an index of 1.33")
	@Guid("035b433b-0466-46cf-83b3-4e3de00b6b6e")
	private double refractionIndex;

	@JacksonXmlProperty(isAttribute=true, localName = "DispersionFactor")
	@Description("The Abbe constant given as a fixed ratio between the refractive indices of the material at different wavelengths. A low Abbe number means a high dispersive power. In general this translates to a greater angular spread of the emergent spectrum.")
	@Guid("585e3a86-97ad-43a4-8af6-abf2bb251fc7")
	private double dispersionFactor;


	public IfcSurfaceStyleRefraction()
	{
	}

	public double getRefractionIndex() {
		return this.refractionIndex;
	}

	public void setRefractionIndex(double refractionIndex) {
		this.refractionIndex = refractionIndex;
	}

	public double getDispersionFactor() {
		return this.dispersionFactor;
	}

	public void setDispersionFactor(double dispersionFactor) {
		this.dispersionFactor = dispersionFactor;
	}


}

