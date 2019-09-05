// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0f9043b3-19f5-4f1b-b221-76018647d933")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWindow extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@JacksonXmlProperty(isAttribute=true, localName = "OverallHeight")
	@Description("Overall measure of the height, it reflects the Z Dimension of a bounding box, enclosing the window opening. If omitted, the <em>OverallHeight</em> should be taken from the geometric representation of the <em>IfcOpening</em> in which the window is inserted.     <blockquote class=\"note\">NOTE&nbsp; The body of the window might be taller then the window opening (for example in cases where the window lining includes a casing). In these cases the <em>OverallHeight</em> shall still be given as the window opening height, and not as the total height of the window lining.</blockquote>")
	@Guid("4eab6bd3-dcea-4c3d-bb3c-069664b3bb8e")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure overallHeight;

	@JacksonXmlProperty(isAttribute=true, localName = "OverallWidth")
	@Description("Overall measure of the width, it reflects the X Dimension of a bounding box, enclosing the window opening. If omitted, the <em>OverallWidth</em> should be taken from the geometric representation of the <em>IfcOpening</em> in which the window is inserted.     <blockquote class=\"note\">NOTE&nbsp; The body of the window might be wider then the window opening (for example in cases where the window lining includes a casing). In these cases the <em>OverallWidth</em> shall still be given as the window opening width, and not as the total width of the window lining.</blockquote>")
	@Guid("0fe5fb49-9b5f-4384-ba1c-6afa2219013c")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure overallWidth;

	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Predefined generic type for a window that is specified in an enumeration. There may be a property set given specificly for the predefined types.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcWindowType</em> is assigned, providing its own <em>IfcWindowType.PredefinedType</em>.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added at the end of the entity definition.</blockquote>")
	@Guid("42be76e4-d473-45aa-bb93-7e6f581f5e07")
	private com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcWindowTypeEnum predefinedType;

	@JacksonXmlProperty(isAttribute=true, localName = "PartitioningType")
	@Description("Type defining the general layout of the window in terms of the partitioning of panels.   <blockquote class=\"note\">NOTE&nbsp; The <em>PartitioningType</em> shall only be used, if no type object <em>IfcWindowType</em> is assigned, providing its own <em>IfcWindowType.PartitioningType</em>.    </blockquote>    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added at the end of the entity definition.</blockquote>")
	@Guid("3d62e476-3cc2-4402-b026-b1a0b07db425")
	private com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcWindowTypePartitioningEnum partitioningType;

	@JacksonXmlProperty(isAttribute=true, localName = "UserDefinedPartitioningType")
	@Description("Designator for the user defined partitioning type, shall only be provided, if the value of <em>PartitioningType</em> is set to USERDEFINED.")
	@Guid("39c8c84f-d708-4cd3-bba2-6ae6d2e950d6")
	private String userDefinedPartitioningType;


	public IfcWindow()
	{
	}

	public IfcWindow(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getOverallHeight() {
		return this.overallHeight;
	}

	public void setOverallHeight(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure overallHeight) {
		this.overallHeight = overallHeight;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure getOverallWidth() {
		return this.overallWidth;
	}

	public void setOverallWidth(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure overallWidth) {
		this.overallWidth = overallWidth;
	}

	public com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcWindowTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcWindowTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcWindowTypePartitioningEnum getPartitioningType() {
		return this.partitioningType;
	}

	public void setPartitioningType(com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcWindowTypePartitioningEnum partitioningType) {
		this.partitioningType = partitioningType;
	}

	public String getUserDefinedPartitioningType() {
		return this.userDefinedPartitioningType;
	}

	public void setUserDefinedPartitioningType(String userDefinedPartitioningType) {
		this.userDefinedPartitioningType = userDefinedPartitioningType;
	}


}

