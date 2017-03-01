//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 11:52:49 AM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.RMT2Base;


/**
 * <p>Java class for employee_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employee_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employee_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="employee_type" type="{}employeetype_type"/>
 *         &lt;element name="is_manager" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="manager_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="employee_title" type="{}employee_title_type"/>
 *         &lt;element name="login_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="login_name" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="contact_details" type="{}person_type"/>
 *         &lt;element name="start_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="termination_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="tracking" type="{}record_tracking_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee_type", propOrder = {
    "employeeId",
    "employeeType",
    "isManager",
    "managerId",
    "employeeTitle",
    "loginId",
    "loginName",
    "contactDetails",
    "startDate",
    "terminationDate",
    "tracking"
})
public class EmployeeType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "employee_id", required = true)
    protected BigInteger employeeId;
    @XmlElement(name = "employee_type", required = true)
    protected EmployeetypeType employeeType;
    @XmlElement(name = "is_manager")
    protected boolean isManager;
    @XmlElement(name = "manager_id", required = true)
    protected BigInteger managerId;
    @XmlElement(name = "employee_title", required = true)
    protected EmployeeTitleType employeeTitle;
    @XmlElement(name = "login_id", required = true)
    protected BigInteger loginId;
    @XmlElement(name = "login_name", required = true)
    protected BigInteger loginName;
    @XmlElement(name = "contact_details", required = true)
    protected PersonType contactDetails;
    @XmlElement(name = "start_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "termination_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminationDate;
    protected RecordTrackingType tracking;

    /**
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmployeeId(BigInteger value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the employeeType property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeetypeType }
     *     
     */
    public EmployeetypeType getEmployeeType() {
        return employeeType;
    }

    /**
     * Sets the value of the employeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeetypeType }
     *     
     */
    public void setEmployeeType(EmployeetypeType value) {
        this.employeeType = value;
    }

    /**
     * Gets the value of the isManager property.
     * 
     */
    public boolean isIsManager() {
        return isManager;
    }

    /**
     * Sets the value of the isManager property.
     * 
     */
    public void setIsManager(boolean value) {
        this.isManager = value;
    }

    /**
     * Gets the value of the managerId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getManagerId() {
        return managerId;
    }

    /**
     * Sets the value of the managerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setManagerId(BigInteger value) {
        this.managerId = value;
    }

    /**
     * Gets the value of the employeeTitle property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeTitleType }
     *     
     */
    public EmployeeTitleType getEmployeeTitle() {
        return employeeTitle;
    }

    /**
     * Sets the value of the employeeTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeTitleType }
     *     
     */
    public void setEmployeeTitle(EmployeeTitleType value) {
        this.employeeTitle = value;
    }

    /**
     * Gets the value of the loginId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLoginId() {
        return loginId;
    }

    /**
     * Sets the value of the loginId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLoginId(BigInteger value) {
        this.loginId = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLoginName(BigInteger value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setContactDetails(PersonType value) {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the terminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminationDate(XMLGregorianCalendar value) {
        this.terminationDate = value;
    }

    /**
     * Gets the value of the tracking property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTrackingType }
     *     
     */
    public RecordTrackingType getTracking() {
        return tracking;
    }

    /**
     * Sets the value of the tracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTrackingType }
     *     
     */
    public void setTracking(RecordTrackingType value) {
        this.tracking = value;
    }

}
