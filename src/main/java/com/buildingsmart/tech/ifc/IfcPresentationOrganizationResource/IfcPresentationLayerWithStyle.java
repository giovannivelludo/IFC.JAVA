// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d58d8ae7-e309-454d-b3f1-2b58ce4d583d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPresentationLayerWithStyle extends IfcPresentationLayerAssignment
{
	@JacksonXmlProperty(isAttribute=true, localName = "LayerOn")
	@Description("A logical setting, TRUE indicates that the layer is set to 'On', FALSE that the layer is set to 'Off', UNKNOWN that such information is not available.")
	@Required()
	@Guid("c35508db-bb0f-4b65-8ebe-1263d8d30880")
	private Boolean layerOn;

	@JacksonXmlProperty(isAttribute=true, localName = "LayerFrozen")
	@Description("A logical setting, TRUE indicates that the layer is set to 'Frozen', FALSE that the layer is set to 'Not frozen', UNKNOWN that such information is not available.")
	@Required()
	@Guid("cd1d47f4-0d9b-443b-99a8-e11337ce2807")
	private Boolean layerFrozen;

	@JacksonXmlProperty(isAttribute=true, localName = "LayerBlocked")
	@Description("A logical setting, TRUE indicates that the layer is set to 'Blocked', FALSE that the layer is set to 'Not blocked', UNKNOWN that such information is not available.")
	@Required()
	@Guid("30057b28-65bc-49de-8333-f563a5910322")
	private Boolean layerBlocked;

	@Description("Assignment of presentation styles to the layer to provide a default style for representation items.  <blockquote class=\"note\">NOTE&nbsp; In most cases the assignment of styles to a layer is restricted to an <em>IfcCurveStyle</em> representing the layer curve colour, layer curve thickness, and layer curve type.    </blockquote>    <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; The data type has been changed from <em>IfcPresentationStyleSelect</em> (now deprecated) to <em>IfcPresentationStyle</em>.  </blockquote>")
	@Required()
	@Guid("e8b3dbe7-1765-4f94-95ef-729981109562")
	private Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcPresentationStyle> layerStyles = new HashSet<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcPresentationStyle>();


	public IfcPresentationLayerWithStyle()
	{
	}

	public IfcPresentationLayerWithStyle(String name, com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLayeredItem[] assignedItems, Boolean layerOn, Boolean layerFrozen, Boolean layerBlocked, com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcPresentationStyle[] layerStyles)
	{
		super(name, assignedItems);
		this.layerOn = layerOn;
		this.layerFrozen = layerFrozen;
		this.layerBlocked = layerBlocked;
		this.layerStyles = new HashSet<>(Arrays.asList(layerStyles));
	}

	public Boolean getLayerOn() {
		return this.layerOn;
	}

	public void setLayerOn(Boolean layerOn) {
		this.layerOn = layerOn;
	}

	public Boolean getLayerFrozen() {
		return this.layerFrozen;
	}

	public void setLayerFrozen(Boolean layerFrozen) {
		this.layerFrozen = layerFrozen;
	}

	public Boolean getLayerBlocked() {
		return this.layerBlocked;
	}

	public void setLayerBlocked(Boolean layerBlocked) {
		this.layerBlocked = layerBlocked;
	}

	public Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcPresentationStyle> getLayerStyles() {
		return this.layerStyles;
	}


}

