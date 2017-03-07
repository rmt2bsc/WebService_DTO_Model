//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.07 at 02:54:32 PM CST 
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
 * <p>Java class for user_app_roles_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user_app_roles_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user_info" type="{}user_type"/>
 *         &lt;element name="app_info" type="{}application_type"/>
 *         &lt;element name="assigned_roles" type="{}app_role_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="revoked_roles" type="{}app_role_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user_app_roles_type", propOrder = {
    "userInfo",
    "appInfo",
    "assignedRoles",
    "revokedRoles"
})
public class UserAppRolesType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "user_info", required = true, nillable = true)
    protected UserType userInfo;
    @XmlElement(name = "app_info", required = true, nillable = true)
    protected ApplicationType appInfo;
    @XmlElement(name = "assigned_roles", nillable = true)
    protected List<AppRoleType> assignedRoles;
    @XmlElement(name = "revoked_roles", nillable = true)
    protected List<AppRoleType> revokedRoles;

    /**
     * Gets the value of the userInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the value of the userInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUserInfo(UserType value) {
        this.userInfo = value;
    }

    /**
     * Gets the value of the appInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationType }
     *     
     */
    public ApplicationType getAppInfo() {
        return appInfo;
    }

    /**
     * Sets the value of the appInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationType }
     *     
     */
    public void setAppInfo(ApplicationType value) {
        this.appInfo = value;
    }

    /**
     * Gets the value of the assignedRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppRoleType }
     * 
     * 
     */
    public List<AppRoleType> getAssignedRoles() {
        if (assignedRoles == null) {
            assignedRoles = new ArrayList<AppRoleType>();
        }
        return this.assignedRoles;
    }

    /**
     * Gets the value of the revokedRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revokedRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevokedRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppRoleType }
     * 
     * 
     */
    public List<AppRoleType> getRevokedRoles() {
        if (revokedRoles == null) {
            revokedRoles = new ArrayList<AppRoleType>();
        }
        return this.revokedRoles;
    }

}
