//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.09 at 02:01:55 PM CDT 
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
 * <p>Java class for zipcode_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zipcode_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zip_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityAliasName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityAliasAbbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="countyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zipcode_type", propOrder = {
    "zipId",
    "zipcode",
    "city",
    "state",
    "areaCode",
    "cityAliasName",
    "cityAliasAbbr",
    "countyName"
})
public class ZipcodeType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "zip_id", required = true, defaultValue = "0")
    protected BigInteger zipId;
    @XmlElement(required = true)
    protected BigInteger zipcode;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    protected String state;
    @XmlElement(required = true)
    protected String areaCode;
    @XmlElement(required = true)
    protected String cityAliasName;
    @XmlElement(required = true)
    protected String cityAliasAbbr;
    @XmlElement(required = true)
    protected String countyName;

    /**
     * Gets the value of the zipId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZipId() {
        return zipId;
    }

    /**
     * Sets the value of the zipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZipId(BigInteger value) {
        this.zipId = value;
    }

    /**
     * Gets the value of the zipcode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZipcode() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZipcode(BigInteger value) {
        this.zipcode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the cityAliasName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityAliasName() {
        return cityAliasName;
    }

    /**
     * Sets the value of the cityAliasName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityAliasName(String value) {
        this.cityAliasName = value;
    }

    /**
     * Gets the value of the cityAliasAbbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityAliasAbbr() {
        return cityAliasAbbr;
    }

    /**
     * Sets the value of the cityAliasAbbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityAliasAbbr(String value) {
        this.cityAliasAbbr = value;
    }

    /**
     * Gets the value of the countyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * Sets the value of the countyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyName(String value) {
        this.countyName = value;
    }

}
