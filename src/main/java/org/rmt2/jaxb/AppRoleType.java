//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.28 at 09:28:29 PM CDT 
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
 * This is the document that manages user's application roles.
 * 
 * <p>Java class for app_role_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="app_role_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="app_role_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="app_role_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="app_role_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="app_role_desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="base_role" type="{}role_type"/>
 *         &lt;element name="app_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "app_role_type", propOrder = {
    "appRoleId",
    "appRoleCode",
    "appRoleName",
    "appRoleDesc",
    "baseRole",
    "appId"
})
public class AppRoleType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "app_role_id", required = true)
    protected BigInteger appRoleId;
    @XmlElement(name = "app_role_code", required = true)
    protected String appRoleCode;
    @XmlElement(name = "app_role_name", required = true)
    protected String appRoleName;
    @XmlElement(name = "app_role_desc", required = true)
    protected String appRoleDesc;
    @XmlElement(name = "base_role", required = true)
    protected RoleType baseRole;
    @XmlElement(name = "app_id", required = true)
    protected BigInteger appId;

    /**
     * Gets the value of the appRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAppRoleId() {
        return appRoleId;
    }

    /**
     * Sets the value of the appRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAppRoleId(BigInteger value) {
        this.appRoleId = value;
    }

    /**
     * Gets the value of the appRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppRoleCode() {
        return appRoleCode;
    }

    /**
     * Sets the value of the appRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppRoleCode(String value) {
        this.appRoleCode = value;
    }

    /**
     * Gets the value of the appRoleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppRoleName() {
        return appRoleName;
    }

    /**
     * Sets the value of the appRoleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppRoleName(String value) {
        this.appRoleName = value;
    }

    /**
     * Gets the value of the appRoleDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppRoleDesc() {
        return appRoleDesc;
    }

    /**
     * Sets the value of the appRoleDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppRoleDesc(String value) {
        this.appRoleDesc = value;
    }

    /**
     * Gets the value of the baseRole property.
     * 
     * @return
     *     possible object is
     *     {@link RoleType }
     *     
     */
    public RoleType getBaseRole() {
        return baseRole;
    }

    /**
     * Sets the value of the baseRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleType }
     *     
     */
    public void setBaseRole(RoleType value) {
        this.baseRole = value;
    }

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAppId(BigInteger value) {
        this.appId = value;
    }

}
