//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.16 at 07:17:37 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for user_resource_access_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user_resource_access_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user_rsrc_access_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="user_info" type="{}user_type" minOccurs="0"/>
 *         &lt;element name="user_group_info" type="{}user_group_type" minOccurs="0"/>
 *         &lt;element name="resource_info" type="{}resource_type" minOccurs="0"/>
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
@XmlType(name = "user_resource_access_type", propOrder = {
    "userRsrcAccessId",
    "userInfo",
    "userGroupInfo",
    "resourceInfo",
    "tracking"
})
public class UserResourceAccessType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "user_rsrc_access_id")
    protected Integer userRsrcAccessId;
    @XmlElement(name = "user_info")
    protected UserType userInfo;
    @XmlElement(name = "user_group_info")
    protected UserGroupType userGroupInfo;
    @XmlElement(name = "resource_info")
    protected ResourceType resourceInfo;
    protected RecordTrackingType tracking;

    /**
     * Gets the value of the userRsrcAccessId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserRsrcAccessId() {
        return userRsrcAccessId;
    }

    /**
     * Sets the value of the userRsrcAccessId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserRsrcAccessId(Integer value) {
        this.userRsrcAccessId = value;
    }

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
     * Gets the value of the userGroupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UserGroupType }
     *     
     */
    public UserGroupType getUserGroupInfo() {
        return userGroupInfo;
    }

    /**
     * Sets the value of the userGroupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserGroupType }
     *     
     */
    public void setUserGroupInfo(UserGroupType value) {
        this.userGroupInfo = value;
    }

    /**
     * Gets the value of the resourceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceType }
     *     
     */
    public ResourceType getResourceInfo() {
        return resourceInfo;
    }

    /**
     * Sets the value of the resourceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceType }
     *     
     */
    public void setResourceInfo(ResourceType value) {
        this.resourceInfo = value;
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
