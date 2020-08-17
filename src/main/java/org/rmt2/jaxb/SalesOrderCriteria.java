//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.17 at 04:49:16 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.RMT2Base;


/**
 * <p>Java class for sales_order_criteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sales_order_criteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="target_level" type="{}xact_custom_criteria_target_type"/>
 *         &lt;element name="sales_order_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="customer_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="account_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="business_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="business_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sales_order_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="sales_order_total" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="invoice_on_sales_order_creation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="apply_payment_on_sales_order_creation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sales_order_criteria", propOrder = {
    "targetLevel",
    "salesOrderId",
    "customerId",
    "accountNo",
    "businessId",
    "businessName",
    "salesOrderDate",
    "salesOrderTotal",
    "invoiceOnSalesOrderCreation",
    "applyPaymentOnSalesOrderCreation"
})
public class SalesOrderCriteria
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "target_level", required = true)
    @XmlSchemaType(name = "string")
    protected XactCustomCriteriaTargetType targetLevel;
    @XmlElement(name = "sales_order_id", required = true)
    protected BigInteger salesOrderId;
    @XmlElement(name = "customer_id", required = true)
    protected BigInteger customerId;
    @XmlElement(name = "account_no", required = true)
    protected String accountNo;
    @XmlElement(name = "business_id", required = true)
    protected BigInteger businessId;
    @XmlElement(name = "business_name", required = true)
    protected String businessName;
    @XmlElement(name = "sales_order_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar salesOrderDate;
    @XmlElement(name = "sales_order_total", required = true)
    protected BigDecimal salesOrderTotal;
    @XmlElement(name = "invoice_on_sales_order_creation", defaultValue = "false")
    protected boolean invoiceOnSalesOrderCreation;
    @XmlElement(name = "apply_payment_on_sales_order_creation", defaultValue = "false")
    protected boolean applyPaymentOnSalesOrderCreation;

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
     * Gets the value of the salesOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSalesOrderId() {
        return salesOrderId;
    }

    /**
     * Sets the value of the salesOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSalesOrderId(BigInteger value) {
        this.salesOrderId = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerId(BigInteger value) {
        this.customerId = value;
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
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the salesOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSalesOrderDate() {
        return salesOrderDate;
    }

    /**
     * Sets the value of the salesOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSalesOrderDate(XMLGregorianCalendar value) {
        this.salesOrderDate = value;
    }

    /**
     * Gets the value of the salesOrderTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesOrderTotal() {
        return salesOrderTotal;
    }

    /**
     * Sets the value of the salesOrderTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesOrderTotal(BigDecimal value) {
        this.salesOrderTotal = value;
    }

    /**
     * Gets the value of the invoiceOnSalesOrderCreation property.
     * 
     */
    public boolean isInvoiceOnSalesOrderCreation() {
        return invoiceOnSalesOrderCreation;
    }

    /**
     * Sets the value of the invoiceOnSalesOrderCreation property.
     * 
     */
    public void setInvoiceOnSalesOrderCreation(boolean value) {
        this.invoiceOnSalesOrderCreation = value;
    }

    /**
     * Gets the value of the applyPaymentOnSalesOrderCreation property.
     * 
     */
    public boolean isApplyPaymentOnSalesOrderCreation() {
        return applyPaymentOnSalesOrderCreation;
    }

    /**
     * Sets the value of the applyPaymentOnSalesOrderCreation property.
     * 
     */
    public void setApplyPaymentOnSalesOrderCreation(boolean value) {
        this.applyPaymentOnSalesOrderCreation = value;
    }

}
