//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.17 at 01:10:13 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * This is the document that manages user resource, resource type and resource sub type elements.
 * 
 * <p>Java class for resource_criteria_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resource_criteria_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rsrc_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rsrc_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rsrc_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rsrc_type_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rsrc_type_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rsrc_subtype_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rsrc_subtype_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rsrc_subtype_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secured" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rsrc_access_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="login_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="group_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resource_criteria_type", propOrder = {
    "rsrcId",
    "rsrcName",
    "rsrcDescription",
    "rsrcTypeId",
    "rsrcTypeName",
    "rsrcSubtypeId",
    "rsrcSubtypeName",
    "rsrcSubtypeDescription",
    "secured",
    "rsrcAccessId",
    "loginId",
    "groupId"
})
public class ResourceCriteriaType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "rsrc_id")
    protected Integer rsrcId;
    @XmlElement(name = "rsrc_name")
    protected String rsrcName;
    @XmlElement(name = "rsrc_description")
    protected String rsrcDescription;
    @XmlElement(name = "rsrc_type_id")
    protected Integer rsrcTypeId;
    @XmlElement(name = "rsrc_type_name")
    protected String rsrcTypeName;
    @XmlElement(name = "rsrc_subtype_id")
    protected Integer rsrcSubtypeId;
    @XmlElement(name = "rsrc_subtype_name")
    protected String rsrcSubtypeName;
    @XmlElement(name = "rsrc_subtype_description")
    protected String rsrcSubtypeDescription;
    @XmlElement(defaultValue = "0")
    protected Integer secured;
    @XmlElement(name = "rsrc_access_id", defaultValue = "0")
    protected Integer rsrcAccessId;
    @XmlElement(name = "login_id")
    protected int loginId;
    @XmlElement(name = "group_id")
    protected Integer groupId;

    /**
     * Gets the value of the rsrcId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRsrcId() {
        return rsrcId;
    }

    /**
     * Sets the value of the rsrcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRsrcId(Integer value) {
        this.rsrcId = value;
    }

    /**
     * Gets the value of the rsrcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsrcName() {
        return rsrcName;
    }

    /**
     * Sets the value of the rsrcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsrcName(String value) {
        this.rsrcName = value;
    }

    /**
     * Gets the value of the rsrcDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsrcDescription() {
        return rsrcDescription;
    }

    /**
     * Sets the value of the rsrcDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsrcDescription(String value) {
        this.rsrcDescription = value;
    }

    /**
     * Gets the value of the rsrcTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRsrcTypeId() {
        return rsrcTypeId;
    }

    /**
     * Sets the value of the rsrcTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRsrcTypeId(Integer value) {
        this.rsrcTypeId = value;
    }

    /**
     * Gets the value of the rsrcTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsrcTypeName() {
        return rsrcTypeName;
    }

    /**
     * Sets the value of the rsrcTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsrcTypeName(String value) {
        this.rsrcTypeName = value;
    }

    /**
     * Gets the value of the rsrcSubtypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRsrcSubtypeId() {
        return rsrcSubtypeId;
    }

    /**
     * Sets the value of the rsrcSubtypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRsrcSubtypeId(Integer value) {
        this.rsrcSubtypeId = value;
    }

    /**
     * Gets the value of the rsrcSubtypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsrcSubtypeName() {
        return rsrcSubtypeName;
    }

    /**
     * Sets the value of the rsrcSubtypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsrcSubtypeName(String value) {
        this.rsrcSubtypeName = value;
    }

    /**
     * Gets the value of the rsrcSubtypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsrcSubtypeDescription() {
        return rsrcSubtypeDescription;
    }

    /**
     * Sets the value of the rsrcSubtypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsrcSubtypeDescription(String value) {
        this.rsrcSubtypeDescription = value;
    }

    /**
     * Gets the value of the secured property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecured() {
        return secured;
    }

    /**
     * Sets the value of the secured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecured(Integer value) {
        this.secured = value;
    }

    /**
     * Gets the value of the rsrcAccessId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRsrcAccessId() {
        return rsrcAccessId;
    }

    /**
     * Sets the value of the rsrcAccessId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRsrcAccessId(Integer value) {
        this.rsrcAccessId = value;
    }

    /**
     * Gets the value of the loginId property.
     * 
     */
    public int getLoginId() {
        return loginId;
    }

    /**
     * Sets the value of the loginId property.
     * 
     */
    public void setLoginId(int value) {
        this.loginId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupId(Integer value) {
        this.groupId = value;
    }

}
