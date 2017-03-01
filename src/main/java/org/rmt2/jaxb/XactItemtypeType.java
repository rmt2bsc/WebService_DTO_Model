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
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for xact_itemtype_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xact_itemtype_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemtype_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="xact_type_id" type="{}xact_type"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "xact_itemtype_type", propOrder = {
    "itemtypeId",
    "xactTypeId",
    "name",
    "tracking"
})
public class XactItemtypeType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "itemtype_id", required = true)
    protected BigInteger itemtypeId;
    @XmlElement(name = "xact_type_id", required = true)
    protected XactType xactTypeId;
    @XmlElement(required = true)
    protected String name;
    protected RecordTrackingType tracking;

    /**
     * Gets the value of the itemtypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemtypeId() {
        return itemtypeId;
    }

    /**
     * Sets the value of the itemtypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemtypeId(BigInteger value) {
        this.itemtypeId = value;
    }

    /**
     * Gets the value of the xactTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link XactType }
     *     
     */
    public XactType getXactTypeId() {
        return xactTypeId;
    }

    /**
     * Sets the value of the xactTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link XactType }
     *     
     */
    public void setXactTypeId(XactType value) {
        this.xactTypeId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
