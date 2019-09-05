// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1550d694-6c4a-46c4-9661-12b1956f035d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialLayer extends IfcMaterialDefinition
{
	@JacksonXmlProperty(isAttribute=false, localName = "Material")
	@Description("Optional reference to the material from which the layer is constructed. Note that if this value is not given, it does not denote a layer with no material (an air gap), it only means that the material is not specified at that point.")
	@Guid("5e1b64ef-4e51-4312-8c39-0c01567e2571")
	private com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial material;

	@JacksonXmlProperty(isAttribute=true, localName = "LayerThickness")
	@Description("The thickness of the material layer. The meaning of \"thickness\" depends on its usage. In case of building elements elements utilizing <em>IfcMaterialLayerSetUsage</em>, the dimension is measured along the positive <em>LayerSetDirection</em> as specified in <em>IfcMaterialLayerSetUsage</em>.    <blockquote class=\"note\">NOTE&nbsp; The attribute value can be 0. for material thicknesses very close to zero, such as for a membrane. Material layers with thickess 0. may not be rendered in the geometric representation.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute datatype has been changed to <em>IfcNonNegativeLengthMeasure</em> allowing for 0. as thickness.</blockquote>")
	@Required()
	@Guid("37ff71f7-f0fc-487e-b121-8627e1c4e98a")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure layerThickness;

	@JacksonXmlProperty(isAttribute=true, localName = "IsVentilated")
	@Description("Indication of whether the material layer represents an air layer (or cavity).   <ul>    <li class=\"small\">set to TRUE if the material layer is an air gap and provides air exchange from the layer to the outside air.</li>    <li class=\"small\">set to UNKNOWN if the material layer is an air gap and does not provide air exchange (or when this information about air exchange of the air gap is not available).</li>    <li class=\"small\">set to FALSE if the material layer is a solid material layer (the default).</li>   </ul>")
	@Guid("e6dcc683-da58-48b5-959e-f29b34e3b2e2")
	private Boolean isVentilated;

	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("The name by which the material layer is known.")
	@Guid("7d73652c-4300-4f34-8cf4-e54ea78193cd")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("Definition of the material layer in more descriptive terms than given by attributes Name or Category.")
	@Guid("0bc92180-96da-475d-b6d4-3cdef5c86dc3")
	private String description;

	@JacksonXmlProperty(isAttribute=true, localName = "Category")
	@Description("Category of the material layer, e.g. the role it has in the layer set it belongs to (such as 'load bearing', 'thermal insulation' etc.). The list of keywords might be extended by model view definitions, however the following keywords shall apply in general:  <ul>   <li class=\"small\">'LoadBearing' &mdash; for all material layers having a load bearing function.</li>   <li class=\"small\">'Insulation' &mdash; for all material layers having an insolating function. </li>   <li class=\"small\">'Inner finish' &mdash; for the material layer being the inner finish.</li>   <li class=\"small\">'Outer finish' &mdash; for the material layer being the outer finish.</li>  </ul>")
	@Guid("9675de3e-375b-4012-ad71-905a53587020")
	private String category;

	@JacksonXmlProperty(isAttribute=true, localName = "Priority")
	@Description("The relative priority of the layer, expressed as normalised integer range [0..100]. Controls how layers intersect in connections and corners of building elements: a layer from one element protrudes into (i.e. displaces) a layer from another element in a joint of these elements if the former element's layer has higher priority than the latter. The priority value for a material layer in an element has to be set and maintained by software applications in relation to the material layers in connected elements.    <blockquote class=\"note\">NOTE&nbsp; The layer priority at a connection may be overridden by the priority attributes of <em>IfcRelConnectsPathElements</em> if that relationship is used to establish a logical connection between two building elements having a layer structure.</blockquote>")
	@Guid("4c9dfd48-454b-4406-93cb-179480e17654")
	private int priority;

	@Description("Reference to the <em>IfcMaterialLayerSet</em> in which the material layer is included.")
	@Guid("f2c9c962-d35f-4ea5-b566-2dba24893f5a")
	private com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialLayerSet toMaterialLayerSet;


	public IfcMaterialLayer()
	{
	}

	public IfcMaterialLayer(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure layerThickness)
	{
		this.layerThickness = layerThickness;
	}

	public com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial getMaterial() {
		return this.material;
	}

	public void setMaterial(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial material) {
		this.material = material;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure getLayerThickness() {
		return this.layerThickness;
	}

	public void setLayerThickness(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNonNegativeLengthMeasure layerThickness) {
		this.layerThickness = layerThickness;
	}

	public Boolean getIsVentilated() {
		return this.isVentilated;
	}

	public void setIsVentilated(Boolean isVentilated) {
		this.isVentilated = isVentilated;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialLayerSet getToMaterialLayerSet() {
		return this.toMaterialLayerSet;
	}

	public void setToMaterialLayerSet(com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialLayerSet toMaterialLayerSet) {
		this.toMaterialLayerSet = toMaterialLayerSet;
	}


}

