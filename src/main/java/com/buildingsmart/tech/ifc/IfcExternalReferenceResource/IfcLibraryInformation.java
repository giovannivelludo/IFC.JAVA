// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("614b2347-4e01-42a4-a914-c29116ce216a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLibraryInformation extends IfcExternalInformation implements IfcLibrarySelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("The name which is used to identify the library.")
	@Required()
	@Guid("755c53a9-82cf-4c15-9e0d-73dd254c1ff6")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "Version")
	@Description("Identifier for the library version used for reference.")
	@Guid("924e1676-b198-4462-931d-0e25718622d5")
	private String version;

	@Description("Information of the organization that acts as the library publisher.  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; The data type has been changed to <em>IfcActorSelect</em>.  </blockquote>")
	@Guid("6055fe08-1ac2-4ea9-abd4-2946584d95fd")
	private com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect publisher;

	@JacksonXmlProperty(isAttribute=true, localName = "VersionDate")
	@Description("Date of the referenced version of the library.  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; The data type has been changed to <em>IfcDateTime</em>, the date and time string according to ISO8601.  </blockquote>")
	@Guid("67f4cb9a-7178-4c17-b962-16a18f0a0e40")
	private String versionDate;

	@JacksonXmlProperty(isAttribute=true, localName = "Location")
	@Description("Resource identifier or locator, provided as URI, URN or URL, of the library information for online references.  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.  </blockquote>")
	@Guid("ea4384e0-37e9-4245-af22-39f8db1948b7")
	private String location;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("Additional description provided for the library revision information.  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.  </blockquote>")
	@Guid("1e2e7012-ea11-4268-bd87-7c1c71e09e14")
	private String description;

	@Description("The library information with which objects are associated.  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; New inverse attribute.  </blockquote>")
	@Guid("d76b6ef8-3769-4e4c-bc12-0fd6bb9f2c63")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociatesLibrary> libraryInfoForObjects = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociatesLibrary>();

	@Description("The library references to which the library information applies.")
	@Guid("4ce4efbe-3cb1-47aa-9fdb-f566c62d4f8a")
	private Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLibraryReference> hasLibraryReferences = new HashSet<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLibraryReference>();


	public IfcLibraryInformation()
	{
	}

	public IfcLibraryInformation(String name)
	{
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect getPublisher() {
		return this.publisher;
	}

	public void setPublisher(com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect publisher) {
		this.publisher = publisher;
	}

	public String getVersionDate() {
		return this.versionDate;
	}

	public void setVersionDate(String versionDate) {
		this.versionDate = versionDate;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociatesLibrary> getLibraryInfoForObjects() {
		return this.libraryInfoForObjects;
	}

	public Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLibraryReference> getHasLibraryReferences() {
		return this.hasLibraryReferences;
	}


}

