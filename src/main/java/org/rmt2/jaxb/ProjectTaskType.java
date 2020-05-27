//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 05:36:28 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for project_task_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="project_task_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="project_task_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="timesheet" type="{}timesheet_type"/>
 *         &lt;element name="task" type="{}task_type"/>
 *         &lt;element name="project" type="{}project_type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "project_task_type", propOrder = {
    "projectTaskId",
    "timesheet",
    "task",
    "project"
})
public class ProjectTaskType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "project_task_id", required = true)
    protected BigInteger projectTaskId;
    @XmlElement(required = true)
    protected TimesheetType timesheet;
    @XmlElement(required = true)
    protected TaskType task;
    @XmlElement(required = true)
    protected ProjectType project;

    /**
     * Gets the value of the projectTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProjectTaskId() {
        return projectTaskId;
    }

    /**
     * Sets the value of the projectTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProjectTaskId(BigInteger value) {
        this.projectTaskId = value;
    }

    /**
     * Gets the value of the timesheet property.
     * 
     * @return
     *     possible object is
     *     {@link TimesheetType }
     *     
     */
    public TimesheetType getTimesheet() {
        return timesheet;
    }

    /**
     * Sets the value of the timesheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimesheetType }
     *     
     */
    public void setTimesheet(TimesheetType value) {
        this.timesheet = value;
    }

    /**
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link TaskType }
     *     
     */
    public TaskType getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskType }
     *     
     */
    public void setTask(TaskType value) {
        this.task = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectType }
     *     
     */
    public ProjectType getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectType }
     *     
     */
    public void setProject(ProjectType value) {
        this.project = value;
    }

}
