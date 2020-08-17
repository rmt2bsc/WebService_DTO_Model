//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.17 at 04:49:16 PM CDT 
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
 * <p>Java class for business_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="business_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="business_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="entity_type" type="{}code_detail_type"/>
 *         &lt;element name="service_type" type="{}code_detail_type"/>
 *         &lt;element name="long_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="short_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contact_firstname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contact_lastname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contact_phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contact_ext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contact_email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="category" type="{}code_group_type"/>
 *         &lt;element name="address" type="{}address_type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "business_type", propOrder = {
    "businessId",
    "entityType",
    "serviceType",
    "longName",
    "shortName",
    "contactFirstname",
    "contactLastname",
    "contactPhone",
    "contactExt",
    "contactEmail",
    "taxId",
    "website",
    "category",
    "address"
})
public class BusinessType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "business_id", required = true, defaultValue = "0")
    protected BigInteger businessId;
    @XmlElement(name = "entity_type", required = true)
    protected CodeDetailType entityType;
    @XmlElement(name = "service_type", required = true)
    protected CodeDetailType serviceType;
    @XmlElement(name = "long_name", required = true)
    protected String longName;
    @XmlElement(name = "short_name", required = true)
    protected String shortName;
    @XmlElement(name = "contact_firstname", required = true)
    protected String contactFirstname;
    @XmlElement(name = "contact_lastname", required = true)
    protected String contactLastname;
    @XmlElement(name = "contact_phone", required = true)
    protected String contactPhone;
    @XmlElement(name = "contact_ext", required = true)
    protected String contactExt;
    @XmlElement(name = "contact_email", required = true)
    protected String contactEmail;
    @XmlElement(required = true)
    protected String taxId;
    @XmlElement(required = true)
    protected String website;
    @XmlElement(required = true)
    protected CodeGroupType category;
    @XmlElement(required = true)
    protected AddressType address;

    /**
     * Gets the value of the businessId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBusinessId() {
        return businessId;
    }

    /**
     * Sets the value of the businessId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBusinessId(BigInteger value) {
        this.businessId = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDetailType }
     *     
     */
    public CodeDetailType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDetailType }
     *     
     */
    public void setEntityType(CodeDetailType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDetailType }
     *     
     */
    public CodeDetailType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDetailType }
     *     
     */
    public void setServiceType(CodeDetailType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the longName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongName() {
        return longName;
    }

    /**
     * Sets the value of the longName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongName(String value) {
        this.longName = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the contactFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFirstname() {
        return contactFirstname;
    }

    /**
     * Sets the value of the contactFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFirstname(String value) {
        this.contactFirstname = value;
    }

    /**
     * Gets the value of the contactLastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactLastname() {
        return contactLastname;
    }

    /**
     * Sets the value of the contactLastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactLastname(String value) {
        this.contactLastname = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the contactExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactExt() {
        return contactExt;
    }

    /**
     * Sets the value of the contactExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactExt(String value) {
        this.contactExt = value;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CodeGroupType }
     *     
     */
    public CodeGroupType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGroupType }
     *     
     */
    public void setCategory(CodeGroupType value) {
        this.category = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

}
