// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("4eee487b-9f5a-4135-9327-1e972cc6124f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTaskTime extends IfcSchedulingTime
{
	@JacksonXmlProperty(isAttribute=true, localName = "DurationType")
	@Description("Enables to specify the type of duration values for <em>ScheduleDuration</em>, <em>ActualDuration</em> and <em>RemainingTime</em>. The duration type is either work time or elapsed time.")
	@Guid("397b58b9-0e87-4f6e-aa6e-b91fae6c6a4e")
	private com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTaskDurationEnum durationType;

	@JacksonXmlProperty(isAttribute=true, localName = "ScheduleDuration")
	@Description("The amount of time which is scheduled for completion of a task. The value might be measured or somehow calculated, which is defined by  <em>ScheduleDataOrigin</em>. The value is either given as elapsed time or work time, which is defined by <em>DurationType</em>.    <blockquote class=\"note\">NOTE&nbsp; Scheduled Duration may be calculated as the time from scheduled start date to scheduled finish date.</blockquote>")
	@Guid("17765db4-2af2-4877-9a1c-1a1aa17d61c0")
	private String scheduleDuration;

	@JacksonXmlProperty(isAttribute=true, localName = "ScheduleStart")
	@Description("The date on which a task is scheduled to be started. The value might be measured or somehow calculated, which is defined by  <em>ScheduleDataOrigin</em>.  <blockquote class=\"note\">NOTE&nbsp;  The scheduled start date must be greater than or equal to the earliest start date.</blockquote>")
	@Guid("d5661729-f85b-4be7-8632-15aa2e10ab22")
	private String scheduleStart;

	@JacksonXmlProperty(isAttribute=true, localName = "ScheduleFinish")
	@Description("The date on which a task is scheduled to be finished. The value might be measured or somehow calculated, which is defined by <em>ScheduleDataOrigin</em>.  <blockquote class=\"note\">NOTE&nbsp;  The scheduled finish date must be greater than or equal to the earliest finish date.</blockquote>")
	@Guid("285c04fa-d7c3-4263-a1cf-02c2ee0040a0")
	private String scheduleFinish;

	@JacksonXmlProperty(isAttribute=true, localName = "EarlyStart")
	@Description("The earliest date on which a task can be started. It is a calculated value.")
	@Guid("70dfb411-90a1-4a66-a1d7-9320fd245548")
	private String earlyStart;

	@JacksonXmlProperty(isAttribute=true, localName = "EarlyFinish")
	@Description("The earliest date on which a task can be finished. It is a calculated value.")
	@Guid("29d02d47-1a92-4c99-a3b6-45fc125dcad7")
	private String earlyFinish;

	@JacksonXmlProperty(isAttribute=true, localName = "LateStart")
	@Description("The latest date on which a task can be started. It is a calculated value.")
	@Guid("98829ecd-dbb3-496b-9330-910738614175")
	private String lateStart;

	@JacksonXmlProperty(isAttribute=true, localName = "LateFinish")
	@Description("The latest date on which a task can be finished. It is a calculated value.")
	@Guid("f0a8d060-3dc8-4626-89de-282d46fa2a9b")
	private String lateFinish;

	@JacksonXmlProperty(isAttribute=true, localName = "FreeFloat")
	@Description("The amount of time during which the start or finish of a task may be varied without any effect on the overall programme of work. It is a calculated elapsed time value.")
	@Guid("eecac739-ba4e-4309-a645-38b4740fa4de")
	private String freeFloat;

	@JacksonXmlProperty(isAttribute=true, localName = "TotalFloat")
	@Description("The difference between the duration available to carry out a task and the scheduled duration of the task. It is a calculated elapsed time value.  <blockquote class=\"note\">NOTE&nbsp;  Total Float time may be calculated as being the difference between the scheduled duration of a task and the available duration from earliest start to latest finish. Float time may be either positive, zero or negative. Where it is zero or negative, the task becomes critical.</blockquote>")
	@Guid("9bf4c43a-4c27-4d6b-b101-6ba64ce6f120")
	private String totalFloat;

	@JacksonXmlProperty(isAttribute=true, localName = "IsCritical")
	@Description("A flag which identifies whether a scheduled task is a critical item within the programme.  <blockquote class=\"note\">NOTE&nbsp;  A task becomes critical when the float time becomes zero or negative.</blockquote>")
	@Guid("8aa0889f-6698-437a-b5da-35b0c4813464")
	private Boolean isCritical;

	@JacksonXmlProperty(isAttribute=true, localName = "StatusTime")
	@Description("The date or time at which the status of the tasks within the schedule is analyzed.")
	@Guid("88662ea5-953b-499b-b149-73854134e848")
	private String statusTime;

	@JacksonXmlProperty(isAttribute=true, localName = "ActualDuration")
	@Description("The actual duration of the task. It is a measured value. The value is either given as elapsed time or work time, which is defined by <em>DurationType</em>.")
	@Guid("1646c30c-9b12-48d2-9c66-ef85c4f2a043")
	private String actualDuration;

	@JacksonXmlProperty(isAttribute=true, localName = "ActualStart")
	@Description("The date on which a task is actually started. It is a measured value.  <blockquote class=\"note\">NOTE&nbsp;  The scheduled start date must be greater than or equal to the earliest start date. No constraint is applied to the actual start date with respect to the scheduled start date since a task may be started earlier than had originally been scheduled if circumstances allow.</blockquote>")
	@Guid("5e97a697-7082-4bdb-8990-ea90fdf6f15a")
	private String actualStart;

	@JacksonXmlProperty(isAttribute=true, localName = "ActualFinish")
	@Description("The date on which a task is actually finished.")
	@Guid("79cfac6b-f665-401b-be2c-918d52b11c49")
	private String actualFinish;

	@JacksonXmlProperty(isAttribute=true, localName = "RemainingTime")
	@Description("The amount of time remaining to complete a task. It is a predicted value. The value is either given as elapsed time or work time, which is defined by <em>DurationType</em>.  <blockquote class=\"note\">NOTE&nbsp; The time remaining in which to complete a task may be determined both for tasks which have not yet started and those which have. Remaining time for a task not yet started has the same value as the scheduled duration. For a task already started, remaining time is calculated as the difference between the scheduled finish and the point of analysis.</blockquote>")
	@Guid("971ed03f-d8a5-4734-bac5-e8314d432e59")
	private String remainingTime;

	@JacksonXmlProperty(isAttribute=true, localName = "Completion")
	@Description("The extent of completion expressed as a ratio or percentage. It is a measured value.")
	@Guid("84fca29b-286d-4a6b-a358-c543c94ff5f0")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure completion;


	public IfcTaskTime()
	{
	}

	public com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTaskDurationEnum getDurationType() {
		return this.durationType;
	}

	public void setDurationType(com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTaskDurationEnum durationType) {
		this.durationType = durationType;
	}

	public String getScheduleDuration() {
		return this.scheduleDuration;
	}

	public void setScheduleDuration(String scheduleDuration) {
		this.scheduleDuration = scheduleDuration;
	}

	public String getScheduleStart() {
		return this.scheduleStart;
	}

	public void setScheduleStart(String scheduleStart) {
		this.scheduleStart = scheduleStart;
	}

	public String getScheduleFinish() {
		return this.scheduleFinish;
	}

	public void setScheduleFinish(String scheduleFinish) {
		this.scheduleFinish = scheduleFinish;
	}

	public String getEarlyStart() {
		return this.earlyStart;
	}

	public void setEarlyStart(String earlyStart) {
		this.earlyStart = earlyStart;
	}

	public String getEarlyFinish() {
		return this.earlyFinish;
	}

	public void setEarlyFinish(String earlyFinish) {
		this.earlyFinish = earlyFinish;
	}

	public String getLateStart() {
		return this.lateStart;
	}

	public void setLateStart(String lateStart) {
		this.lateStart = lateStart;
	}

	public String getLateFinish() {
		return this.lateFinish;
	}

	public void setLateFinish(String lateFinish) {
		this.lateFinish = lateFinish;
	}

	public String getFreeFloat() {
		return this.freeFloat;
	}

	public void setFreeFloat(String freeFloat) {
		this.freeFloat = freeFloat;
	}

	public String getTotalFloat() {
		return this.totalFloat;
	}

	public void setTotalFloat(String totalFloat) {
		this.totalFloat = totalFloat;
	}

	public Boolean getIsCritical() {
		return this.isCritical;
	}

	public void setIsCritical(Boolean isCritical) {
		this.isCritical = isCritical;
	}

	public String getStatusTime() {
		return this.statusTime;
	}

	public void setStatusTime(String statusTime) {
		this.statusTime = statusTime;
	}

	public String getActualDuration() {
		return this.actualDuration;
	}

	public void setActualDuration(String actualDuration) {
		this.actualDuration = actualDuration;
	}

	public String getActualStart() {
		return this.actualStart;
	}

	public void setActualStart(String actualStart) {
		this.actualStart = actualStart;
	}

	public String getActualFinish() {
		return this.actualFinish;
	}

	public void setActualFinish(String actualFinish) {
		this.actualFinish = actualFinish;
	}

	public String getRemainingTime() {
		return this.remainingTime;
	}

	public void setRemainingTime(String remainingTime) {
		this.remainingTime = remainingTime;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure getCompletion() {
		return this.completion;
	}

	public void setCompletion(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure completion) {
		this.completion = completion;
	}


}

