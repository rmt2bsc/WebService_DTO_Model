//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.17 at 05:12:10 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for xact_criteria_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xact_criteria_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="target_level" type="{}xact_custom_criteria_target_type"/>
 *         &lt;element name="basic_criteria" type="{}xact_basic_criteria_type" minOccurs="0"/>
 *         &lt;element name="custom_criteria" type="{}xact_custom_relational_criteria_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xact_criteria_type", propOrder = {
    "targetLevel",
    "basicCriteria",
    "customCriteria"
})
public class XactCriteriaType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "target_level", required = true)
    @XmlSchemaType(name = "string")
    protected XactCustomCriteriaTargetType targetLevel;
    @XmlElement(name = "basic_criteria")
    protected XactBasicCriteriaType basicCriteria;
    @XmlElement(name = "custom_criteria")
    protected XactCustomRelationalCriteriaType customCriteria;

    /**
     * Gets the value of the targetLevel property.
     * 
     * @return
     *     possible object is
     *     {@link XactCustomCriteriaTargetType }
     *     
     */
    public XactCustomCriteriaTargetType getTargetLevel() {
        return targetLevel;
    }

    /**
     * Sets the value of the targetLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactCustomCriteriaTargetType }
     *     
     */
    public void setTargetLevel(XactCustomCriteriaTargetType value) {
        this.targetLevel = value;
    }

    /**
     * Gets the value of the basicCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link XactBasicCriteriaType }
     *     
     */
    public XactBasicCriteriaType getBasicCriteria() {
        return basicCriteria;
    }

    /**
     * Sets the value of the basicCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactBasicCriteriaType }
     *     
     */
    public void setBasicCriteria(XactBasicCriteriaType value) {
        this.basicCriteria = value;
    }

    /**
     * Gets the value of the customCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link XactCustomRelationalCriteriaType }
     *     
     */
    public XactCustomRelationalCriteriaType getCustomCriteria() {
        return customCriteria;
    }

    /**
     * Sets the value of the customCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactCustomRelationalCriteriaType }
     *     
     */
    public void setCustomCriteria(XactCustomRelationalCriteriaType value) {
        this.customCriteria = value;
    }

}
