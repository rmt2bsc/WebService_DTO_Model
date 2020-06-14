//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.14 at 02:19:54 AM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for creditor_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditor_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditor_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="creditor_type" type="{}creditortype_type"/>
 *         &lt;element name="contact_details" type="{}business_type" minOccurs="0"/>
 *         &lt;element name="acct_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="account_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="credit_limit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="apr" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ext_account_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="transactions" type="{}creditor_activity_list_type"/>
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
@XmlType(name = "creditor_type", propOrder = {
    "creditorId",
    "creditorType",
    "contactDetails",
    "acctId",
    "accountNo",
    "creditLimit",
    "apr",
    "balance",
    "extAccountNo",
    "active",
    "transactions",
    "tracking"
})
public class CreditorType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "creditor_id", required = true)
    protected BigInteger creditorId;
    @XmlElement(name = "creditor_type", required = true)
    protected CreditortypeType creditorType;
    @XmlElement(name = "contact_details")
    protected BusinessType contactDetails;
    @XmlElement(name = "acct_id")
    protected BigInteger acctId;
    @XmlElement(name = "account_no", required = true)
    protected String accountNo;
    @XmlElement(name = "credit_limit")
    protected BigDecimal creditLimit;
    protected BigDecimal apr;
    @XmlElement(required = true)
    protected BigDecimal balance;
    @XmlElement(name = "ext_account_no")
    protected String extAccountNo;
    protected BigInteger active;
    @XmlElement(required = true)
    protected CreditorActivityListType transactions;
    protected RecordTrackingType tracking;

    /**
     * Gets the value of the creditorId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCreditorId() {
        return creditorId;
    }

    /**
     * Sets the value of the creditorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCreditorId(BigInteger value) {
        this.creditorId = value;
    }

    /**
     * Gets the value of the creditorType property.
     * 
     * @return
     *     possible object is
     *     {@link CreditortypeType }
     *     
     */
    public CreditortypeType getCreditorType() {
        return creditorType;
    }

    /**
     * Sets the value of the creditorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditortypeType }
     *     
     */
    public void setCreditorType(CreditortypeType value) {
        this.creditorType = value;
    }

    /**
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessType }
     *     
     */
    public BusinessType getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessType }
     *     
     */
    public void setContactDetails(BusinessType value) {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcctId(BigInteger value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLimit(BigDecimal value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the apr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApr() {
        return apr;
    }

    /**
     * Sets the value of the apr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApr(BigDecimal value) {
        this.apr = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the extAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtAccountNo() {
        return extAccountNo;
    }

    /**
     * Sets the value of the extAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtAccountNo(String value) {
        this.extAccountNo = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActive(BigInteger value) {
        this.active = value;
    }

    /**
     * Gets the value of the transactions property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorActivityListType }
     *     
     */
    public CreditorActivityListType getTransactions() {
        return transactions;
    }

    /**
     * Sets the value of the transactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorActivityListType }
     *     
     */
    public void setTransactions(CreditorActivityListType value) {
        this.transactions = value;
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
