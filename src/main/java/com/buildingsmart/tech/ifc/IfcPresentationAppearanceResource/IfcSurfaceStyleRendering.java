// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("703b6da9-4562-41aa-a762-51f6dad09052")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSurfaceStyleRendering extends IfcSurfaceStyleShading
{
	@Description("The diffuse part of the reflectance equation can be given as either a colour or a scalar factor.  The diffuse colour field reflects all light sources depending on the angle of the surface with respect to the light source. The more directly the surface faces the light, the more diffuse light reflects.  The diffuse factor field specifies how much diffuse light from light sources this surface shall reflect. Diffuse light depends on the angle of the surface with respect to the light source. The more directly the surface faces the light, the more diffuse light reflects. The diffuse colour is then defined by surface colour * diffuse factor.")
	@Guid("4e708a5a-96ad-46f8-866d-2ebe5b9fd8bc")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourOrFactor diffuseColour;

	@Description("The transmissive part of the reflectance equation can be given as either a colour or a scalar factor. It only applies to materials which Transparency field is greater than zero.  The transmissive colour field specifies the colour that passes through a transparant material (like the colour that shines through a glass).  The transmissive factor defines the transmissive part, the transmissive colour is then defined by surface colour * transmissive factor.")
	@Guid("d5148981-8280-4233-9da8-8fcdbcc4d44f")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourOrFactor transmissionColour;

	@Description("The diffuse transmission part of the reflectance equation can be given as either a colour or a scalar factor. It only applies to materials whose Transparency field is greater than zero.  The diffuse transmission colour specifies how much diffuse light is reflected at the opposite side of the material surface.  The diffuse transmission factor field specifies how much diffuse light from light sources this surface shall reflect on the opposite side of the material surface. The diffuse transmissive colour is then defined by surface colour * diffuse transmissive factor.")
	@Guid("9ad06ca2-f147-423a-9eb2-b94eb9e5f2fc")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourOrFactor diffuseTransmissionColour;

	@Description("The reflection (or mirror) part of the reflectance equation can be given as either a colour or a scalar factor. Applies to \"glass\" and \"mirror\" reflection models.  The reflection colour specifies the contribution made by light from the mirror direction, i.e. light being reflected from the surface.  The reflection factor specifies the amount of contribution made by light from the mirror direction. The reflection colour is then defined by surface colour * reflection factor.")
	@Guid("87b370d9-9b2d-4bba-b774-16ba8e45a107")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourOrFactor reflectionColour;

	@Description("The specular part of the reflectance equation can be given as either a colour or a scalar factor.  The specular colour determine the specular highlights (e.g., the shiny spots on an apple). When the angle from the light to the surface is close to the angle from the surface to the viewer, the specular colour is added to the diffuse and ambient colour calculations.  The specular factor defines the specular part, the specular colour is then defined by surface colour * specular factor.")
	@Guid("afa3c350-7f49-426b-909b-0e7082f40d8f")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourOrFactor specularColour;

	@Description("The exponent or roughness part of the specular reflectance.")
	@Guid("c77e978f-d78a-450c-8ecb-9ab2c560fdc4")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSpecularHighlightSelect specularHighlight;

	@JacksonXmlProperty(isAttribute=true, localName = "ReflectanceMethod")
	@Description("Identifies the predefined types of reflectance method from which the method required may be set.")
	@Required()
	@Guid("6ea496ef-3613-4bcd-96e6-ef7e02e2ab72")
	private com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcReflectanceMethodEnum reflectanceMethod;


	public IfcSurfaceStyleRendering()
	{
	}

	public IfcSurfaceStyleRendering(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb surfaceColour, com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcReflectanceMethodEnum reflectanceMethod)
	{
		super(surfaceColour);
		this.reflectanceMethod = reflectanceMethod;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourOrFactor getDiffuseColour() {
		return this.diffuseColour;
	}

	public void setDiffuseColour(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourOrFactor diffuseColour) {
		this.diffuseColour = diffuseColour;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourOrFactor getTransmissionColour() {
		return this.transmissionColour;
	}

	public void setTransmissionColour(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourOrFactor transmissionColour) {
		this.transmissionColour = transmissionColour;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourOrFactor getDiffuseTransmissionColour() {
		return this.diffuseTransmissionColour;
	}

	public void setDiffuseTransmissionColour(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourOrFactor diffuseTransmissionColour) {
		this.diffuseTransmissionColour = diffuseTransmissionColour;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourOrFactor getReflectionColour() {
		return this.reflectionColour;
	}

	public void setReflectionColour(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourOrFactor reflectionColour) {
		this.reflectionColour = reflectionColour;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourOrFactor getSpecularColour() {
		return this.specularColour;
	}

	public void setSpecularColour(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourOrFactor specularColour) {
		this.specularColour = specularColour;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSpecularHighlightSelect getSpecularHighlight() {
		return this.specularHighlight;
	}

	public void setSpecularHighlight(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSpecularHighlightSelect specularHighlight) {
		this.specularHighlight = specularHighlight;
	}

	public com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcReflectanceMethodEnum getReflectanceMethod() {
		return this.reflectanceMethod;
	}

	public void setReflectanceMethod(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcReflectanceMethodEnum reflectanceMethod) {
		this.reflectanceMethod = reflectanceMethod;
	}


}

