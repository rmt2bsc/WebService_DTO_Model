//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.15 at 08:49:23 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for contact_detail_group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contact_detail_group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="business_contacts" type="{}business_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="person_contacts" type="{}person_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="common_contacts" type="{}common_contact_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contact_detail_group", propOrder = {
    "businessContacts",
    "personContacts",
    "commonContacts"
})
public class ContactDetailGroup
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "business_contacts")
    protected List<BusinessType> businessContacts;
    @XmlElement(name = "person_contacts")
    protected List<PersonType> personContacts;
    @XmlElement(name = "common_contacts")
    protected List<CommonContactType> commonContacts;

    /**
     * Gets the value of the businessContacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessContacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessType }
     * 
     * 
     */
    public List<BusinessType> getBusinessContacts() {
        if (businessContacts == null) {
            businessContacts = new ArrayList<BusinessType>();
        }
        return this.businessContacts;
    }

    /**
     * Gets the value of the personContacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personContacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getPersonContacts() {
        if (personContacts == null) {
            personContacts = new ArrayList<PersonType>();
        }
        return this.personContacts;
    }

    /**
     * Gets the value of the commonContacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commonContacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommonContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonContactType }
     * 
     * 
     */
    public List<CommonContactType> getCommonContacts() {
        if (commonContacts == null) {
            commonContacts = new ArrayList<CommonContactType>();
        }
        return this.commonContacts;
    }

}
