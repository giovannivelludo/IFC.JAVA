// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("03ad1d5a-0288-44a7-b612-096bd45ae66b")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcObject extends IfcObjectDefinition
{
	@JacksonXmlProperty(isAttribute=true, localName = "ObjectType")
	@Description("The type denotes a particular type that indicates the object further. The use has to be established at the level of instantiable subtypes. In particular it holds the user defined type, if the enumeration of the attribute <em>PredefinedType</em> is set to USERDEFINED.   <br>")
	@Guid("a2a49b49-46e4-4a0d-a311-916cc1dd4a25")
	private String objectType;

	@JacksonXmlProperty(isAttribute=false, localName = "IsDeclaredBy")
	@Description("Link to the relationship object pointing to the declaring object that provides the object definitions for this object occurrence. The declaring object has to be part of an object type decomposition. The associated <em>IfcObject</em>, or its subtypes, contains the specific information (as part of a type, or style, definition), that is common to all reflected instances of the declaring <em>IfcObject</em>, or its subtypes.   <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New inverse relationship, change made with upward compatibility for file based exchange.</blockquote>")
	@MaxLength(1)
	@Guid("61731909-a38e-45fe-98b9-b403ef1e803d")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByObject> isDeclaredBy = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByObject>();

	@Description("Link to the relationship object pointing to the reflected object(s) that receives the object definitions. The reflected object has to be part of an object occurrence decomposition. The associated <em>IfcObject</em>, or its subtypes, provides the specific information (as part of a type, or style, definition), that is common to all reflected instances of the declaring <em>IfcObject</em>, or its subtypes.   <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New inverse relationship, change made with upward compatibility for file based exchange.</blockquote>")
	@Guid("8a2b55d8-3bca-45a0-9309-e7c6e2770821")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByObject> declares = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByObject>();

	@JacksonXmlProperty(isAttribute=false, localName = "IsTypedBy")
	@Description("Set of relationships to the object type that provides the type definitions for this object occurrence. The then associated <em>IfcTypeObject</em>, or its subtypes, contains the specific information (or type, or style), that is common to all instances of <em>IfcObject</em>, or its subtypes, referring to the same type.   <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New inverse relationship, the link to <em>IfcRelDefinesByType</em> had previously be included in the inverse relationship <em>IfcRelDefines</em>. Change made with upward compatibility for file based exchange.</blockquote>")
	@MaxLength(1)
	@Guid("4016c47e-1d15-481e-8a59-b6fb531ad43c")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByType> isTypedBy = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByType>();

	@JacksonXmlProperty(isAttribute=false, localName = "IsDefinedBy")
	@Description("Set of relationships to property set definitions attached to this object. Those statically or dynamically defined properties contain alphanumeric information content that further defines the object.   <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The data type has been changed from <em>IfcRelDefines</em> to <em>IfcRelDefinesByProperties</em> with upward compatibility for file based exchange.</blockquote>")
	@Guid("e2315ec5-85ce-457d-b508-07be258c2138")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByProperties> isDefinedBy = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByProperties>();


	public IfcObject()
	{
	}

	public IfcObject(String globalId)
	{
		super(globalId);
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByObject> getIsDeclaredBy() {
		return this.isDeclaredBy;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByObject> getDeclares() {
		return this.declares;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByType> getIsTypedBy() {
		return this.isTypedBy;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefinesByProperties> getIsDefinedBy() {
		return this.isDefinedBy;
	}


}

