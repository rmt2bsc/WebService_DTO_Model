//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.30 at 03:34:36 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * Request one or more records from the Country/State/Province data source.
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{}header_type"/>
 *         &lt;element name="state_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="country_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="state_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="login_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="order_by" type="{}order_by_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "stateId",
    "countryId",
    "stateName",
    "stateCode",
    "loginId",
    "orderBy"
})
@XmlRootElement(name = "ProvinceRequest")
public class ProvinceRequest
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected HeaderType header;
    @XmlElement(name = "state_id", required = true)
    protected BigInteger stateId;
    @XmlElement(name = "country_id", required = true)
    protected BigInteger countryId;
    @XmlElement(name = "state_name", required = true)
    protected String stateName;
    @XmlElement(name = "state_code", required = true)
    protected String stateCode;
    @XmlElement(name = "login_id", required = true)
    protected String loginId;
    @XmlElement(name = "order_by")
    protected List<OrderByType> orderBy;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the stateId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStateId() {
        return stateId;
    }

    /**
     * Sets the value of the stateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStateId(BigInteger value) {
        this.stateId = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountryId(BigInteger value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the stateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * Sets the value of the stateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateName(String value) {
        this.stateName = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the loginId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * Sets the value of the loginId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginId(String value) {
        this.loginId = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderByType }
     * 
     * 
     */
    public List<OrderByType> getOrderBy() {
        if (orderBy == null) {
            orderBy = new ArrayList<OrderByType>();
        }
        return this.orderBy;
    }

}
