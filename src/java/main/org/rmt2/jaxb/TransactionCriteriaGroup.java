//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.01 at 08:13:01 PM CDT 
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
 * <p>Java class for transaction_criteria_group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaction_criteria_group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer_criteria" type="{}customer_criteria_type"/>
 *         &lt;element name="creditor_criteria" type="{}creditor_criteria_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sales_criteria" type="{}sales_order_criteria" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="purchases_criteria" type="{}purchase_order_criteria" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="xact_criteria" type="{}gl_account_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction_criteria_group", propOrder = {
    "customerCriteria",
    "creditorCriteria",
    "salesCriteria",
    "purchasesCriteria",
    "xactCriteria"
})
public class TransactionCriteriaGroup
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "customer_criteria", required = true, nillable = true)
    protected CustomerCriteriaType customerCriteria;
    @XmlElement(name = "creditor_criteria", nillable = true)
    protected List<CreditorCriteriaType> creditorCriteria;
    @XmlElement(name = "sales_criteria", nillable = true)
    protected List<SalesOrderCriteria> salesCriteria;
    @XmlElement(name = "purchases_criteria", nillable = true)
    protected List<PurchaseOrderCriteria> purchasesCriteria;
    @XmlElement(name = "xact_criteria", nillable = true)
    protected List<GlAccountType> xactCriteria;

    /**
     * Gets the value of the customerCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCriteriaType }
     *     
     */
    public CustomerCriteriaType getCustomerCriteria() {
        return customerCriteria;
    }

    /**
     * Sets the value of the customerCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCriteriaType }
     *     
     */
    public void setCustomerCriteria(CustomerCriteriaType value) {
        this.customerCriteria = value;
    }

    /**
     * Gets the value of the creditorCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditorCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditorCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditorCriteriaType }
     * 
     * 
     */
    public List<CreditorCriteriaType> getCreditorCriteria() {
        if (creditorCriteria == null) {
            creditorCriteria = new ArrayList<CreditorCriteriaType>();
        }
        return this.creditorCriteria;
    }

    /**
     * Gets the value of the salesCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderCriteria }
     * 
     * 
     */
    public List<SalesOrderCriteria> getSalesCriteria() {
        if (salesCriteria == null) {
            salesCriteria = new ArrayList<SalesOrderCriteria>();
        }
        return this.salesCriteria;
    }

    /**
     * Gets the value of the purchasesCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchasesCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchasesCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseOrderCriteria }
     * 
     * 
     */
    public List<PurchaseOrderCriteria> getPurchasesCriteria() {
        if (purchasesCriteria == null) {
            purchasesCriteria = new ArrayList<PurchaseOrderCriteria>();
        }
        return this.purchasesCriteria;
    }

    /**
     * Gets the value of the xactCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xactCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXactCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlAccountType }
     * 
     * 
     */
    public List<GlAccountType> getXactCriteria() {
        if (xactCriteria == null) {
            xactCriteria = new ArrayList<GlAccountType>();
        }
        return this.xactCriteria;
    }

}
