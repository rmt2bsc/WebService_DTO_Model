//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.01.24 at 12:16:07 AM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for xact_custom_relational_criteria_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xact_custom_relational_criteria_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xact_reason_options" type="{}string_search_pattern_type" minOccurs="0"/>
 *         &lt;element name="from_xact_amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="from_rel_op_xact_amount" type="{}relational_operator_type" minOccurs="0"/>
 *         &lt;element name="to_xact_amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="to_rel_op_xact_amount" type="{}relational_operator_type" minOccurs="0"/>
 *         &lt;element name="from_xact_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="from_rel_op_xact_date" type="{}relational_operator_type" minOccurs="0"/>
 *         &lt;element name="to_xact_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="to_rel_op_xact_date" type="{}relational_operator_type" minOccurs="0"/>
 *         &lt;element name="from_item_amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="from_rel_op_item_amount" type="{}relational_operator_type" minOccurs="0"/>
 *         &lt;element name="to_item_amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="to_rel_op_item_amount" type="{}relational_operator_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xact_custom_relational_criteria_type", propOrder = {
    "xactReasonOptions",
    "fromXactAmount",
    "fromRelOpXactAmount",
    "toXactAmount",
    "toRelOpXactAmount",
    "fromXactDate",
    "fromRelOpXactDate",
    "toXactDate",
    "toRelOpXactDate",
    "fromItemAmount",
    "fromRelOpItemAmount",
    "toItemAmount",
    "toRelOpItemAmount"
})
public class XactCustomRelationalCriteriaType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "xact_reason_options")
    @XmlSchemaType(name = "string")
    protected StringSearchPatternType xactReasonOptions;
    @XmlElement(name = "from_xact_amount")
    protected BigDecimal fromXactAmount;
    @XmlElement(name = "from_rel_op_xact_amount")
    @XmlSchemaType(name = "string")
    protected RelationalOperatorType fromRelOpXactAmount;
    @XmlElement(name = "to_xact_amount")
    protected BigDecimal toXactAmount;
    @XmlElement(name = "to_rel_op_xact_amount")
    @XmlSchemaType(name = "string")
    protected RelationalOperatorType toRelOpXactAmount;
    @XmlElement(name = "from_xact_date")
    protected String fromXactDate;
    @XmlElement(name = "from_rel_op_xact_date")
    @XmlSchemaType(name = "string")
    protected RelationalOperatorType fromRelOpXactDate;
    @XmlElement(name = "to_xact_date")
    protected String toXactDate;
    @XmlElement(name = "to_rel_op_xact_date")
    @XmlSchemaType(name = "string")
    protected RelationalOperatorType toRelOpXactDate;
    @XmlElement(name = "from_item_amount")
    protected BigDecimal fromItemAmount;
    @XmlElement(name = "from_rel_op_item_amount")
    @XmlSchemaType(name = "string")
    protected RelationalOperatorType fromRelOpItemAmount;
    @XmlElement(name = "to_item_amount")
    protected BigDecimal toItemAmount;
    @XmlElement(name = "to_rel_op_item_amount")
    @XmlSchemaType(name = "string")
    protected RelationalOperatorType toRelOpItemAmount;

    /**
     * Gets the value of the xactReasonOptions property.
     * 
     * @return
     *     possible object is
     *     {@link StringSearchPatternType }
     *     
     */
    public StringSearchPatternType getXactReasonOptions() {
        return xactReasonOptions;
    }

    /**
     * Sets the value of the xactReasonOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringSearchPatternType }
     *     
     */
    public void setXactReasonOptions(StringSearchPatternType value) {
        this.xactReasonOptions = value;
    }

    /**
     * Gets the value of the fromXactAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFromXactAmount() {
        return fromXactAmount;
    }

    /**
     * Sets the value of the fromXactAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFromXactAmount(BigDecimal value) {
        this.fromXactAmount = value;
    }

    /**
     * Gets the value of the fromRelOpXactAmount property.
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getFromRelOpXactAmount() {
        return fromRelOpXactAmount;
    }

    /**
     * Sets the value of the fromRelOpXactAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setFromRelOpXactAmount(RelationalOperatorType value) {
        this.fromRelOpXactAmount = value;
    }

    /**
     * Gets the value of the toXactAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToXactAmount() {
        return toXactAmount;
    }

    /**
     * Sets the value of the toXactAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToXactAmount(BigDecimal value) {
        this.toXactAmount = value;
    }

    /**
     * Gets the value of the toRelOpXactAmount property.
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getToRelOpXactAmount() {
        return toRelOpXactAmount;
    }

    /**
     * Sets the value of the toRelOpXactAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setToRelOpXactAmount(RelationalOperatorType value) {
        this.toRelOpXactAmount = value;
    }

    /**
     * Gets the value of the fromXactDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromXactDate() {
        return fromXactDate;
    }

    /**
     * Sets the value of the fromXactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromXactDate(String value) {
        this.fromXactDate = value;
    }

    /**
     * Gets the value of the fromRelOpXactDate property.
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getFromRelOpXactDate() {
        return fromRelOpXactDate;
    }

    /**
     * Sets the value of the fromRelOpXactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setFromRelOpXactDate(RelationalOperatorType value) {
        this.fromRelOpXactDate = value;
    }

    /**
     * Gets the value of the toXactDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToXactDate() {
        return toXactDate;
    }

    /**
     * Sets the value of the toXactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToXactDate(String value) {
        this.toXactDate = value;
    }

    /**
     * Gets the value of the toRelOpXactDate property.
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getToRelOpXactDate() {
        return toRelOpXactDate;
    }

    /**
     * Sets the value of the toRelOpXactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setToRelOpXactDate(RelationalOperatorType value) {
        this.toRelOpXactDate = value;
    }

    /**
     * Gets the value of the fromItemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFromItemAmount() {
        return fromItemAmount;
    }

    /**
     * Sets the value of the fromItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFromItemAmount(BigDecimal value) {
        this.fromItemAmount = value;
    }

    /**
     * Gets the value of the fromRelOpItemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getFromRelOpItemAmount() {
        return fromRelOpItemAmount;
    }

    /**
     * Sets the value of the fromRelOpItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setFromRelOpItemAmount(RelationalOperatorType value) {
        this.fromRelOpItemAmount = value;
    }

    /**
     * Gets the value of the toItemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToItemAmount() {
        return toItemAmount;
    }

    /**
     * Sets the value of the toItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToItemAmount(BigDecimal value) {
        this.toItemAmount = value;
    }

    /**
     * Gets the value of the toRelOpItemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getToRelOpItemAmount() {
        return toRelOpItemAmount;
    }

    /**
     * Sets the value of the toRelOpItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setToRelOpItemAmount(RelationalOperatorType value) {
        this.toRelOpItemAmount = value;
    }

}
