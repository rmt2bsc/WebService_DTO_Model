//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.17 at 05:12:10 PM CST 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for audio_video_criteria_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="audio_video_criteria_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fetch_full" type="{}mime_custom_criteria_target_type" minOccurs="0"/>
 *         &lt;element name="artist_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="artist_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="project_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="project_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ripped" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="track_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="track_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genre_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="genre_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="media_type_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="media_type_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="project_type_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="project_type_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mime_type_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mime_type_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="search_term" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audio_video_criteria_type", propOrder = {
    "fetchFull",
    "artistId",
    "artistName",
    "projectId",
    "projectTitle",
    "year",
    "ripped",
    "trackId",
    "trackTitle",
    "genreId",
    "genreName",
    "mediaTypeId",
    "mediaTypeName",
    "projectTypeId",
    "projectTypeName",
    "mimeTypeId",
    "mimeTypeName",
    "searchTerm"
})
public class AudioVideoCriteriaType
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "fetch_full")
    @XmlSchemaType(name = "string")
    protected MimeCustomCriteriaTargetType fetchFull;
    @XmlElement(name = "artist_id", defaultValue = "0")
    protected Integer artistId;
    @XmlElement(name = "artist_name")
    protected String artistName;
    @XmlElement(name = "project_id")
    protected Integer projectId;
    @XmlElement(name = "project_title")
    protected String projectTitle;
    protected Integer year;
    protected Integer ripped;
    @XmlElement(name = "track_id")
    protected Integer trackId;
    @XmlElement(name = "track_title")
    protected String trackTitle;
    @XmlElement(name = "genre_id")
    protected Integer genreId;
    @XmlElement(name = "genre_name")
    protected String genreName;
    @XmlElement(name = "media_type_id")
    protected Integer mediaTypeId;
    @XmlElement(name = "media_type_name")
    protected String mediaTypeName;
    @XmlElement(name = "project_type_id")
    protected Integer projectTypeId;
    @XmlElement(name = "project_type_name")
    protected String projectTypeName;
    @XmlElement(name = "mime_type_id")
    protected Integer mimeTypeId;
    @XmlElement(name = "mime_type_name")
    protected String mimeTypeName;
    @XmlElement(name = "search_term")
    protected String searchTerm;

    /**
     * Gets the value of the fetchFull property.
     * 
     * @return
     *     possible object is
     *     {@link MimeCustomCriteriaTargetType }
     *     
     */
    public MimeCustomCriteriaTargetType getFetchFull() {
        return fetchFull;
    }

    /**
     * Sets the value of the fetchFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeCustomCriteriaTargetType }
     *     
     */
    public void setFetchFull(MimeCustomCriteriaTargetType value) {
        this.fetchFull = value;
    }

    /**
     * Gets the value of the artistId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArtistId() {
        return artistId;
    }

    /**
     * Sets the value of the artistId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArtistId(Integer value) {
        this.artistId = value;
    }

    /**
     * Gets the value of the artistName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * Sets the value of the artistName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtistName(String value) {
        this.artistName = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectId(Integer value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the projectTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectTitle() {
        return projectTitle;
    }

    /**
     * Sets the value of the projectTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectTitle(String value) {
        this.projectTitle = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYear(Integer value) {
        this.year = value;
    }

    /**
     * Gets the value of the ripped property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRipped() {
        return ripped;
    }

    /**
     * Sets the value of the ripped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRipped(Integer value) {
        this.ripped = value;
    }

    /**
     * Gets the value of the trackId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrackId() {
        return trackId;
    }

    /**
     * Sets the value of the trackId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrackId(Integer value) {
        this.trackId = value;
    }

    /**
     * Gets the value of the trackTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackTitle() {
        return trackTitle;
    }

    /**
     * Sets the value of the trackTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackTitle(String value) {
        this.trackTitle = value;
    }

    /**
     * Gets the value of the genreId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGenreId() {
        return genreId;
    }

    /**
     * Sets the value of the genreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGenreId(Integer value) {
        this.genreId = value;
    }

    /**
     * Gets the value of the genreName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenreName() {
        return genreName;
    }

    /**
     * Sets the value of the genreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenreName(String value) {
        this.genreName = value;
    }

    /**
     * Gets the value of the mediaTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMediaTypeId() {
        return mediaTypeId;
    }

    /**
     * Sets the value of the mediaTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMediaTypeId(Integer value) {
        this.mediaTypeId = value;
    }

    /**
     * Gets the value of the mediaTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaTypeName() {
        return mediaTypeName;
    }

    /**
     * Sets the value of the mediaTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaTypeName(String value) {
        this.mediaTypeName = value;
    }

    /**
     * Gets the value of the projectTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectTypeId() {
        return projectTypeId;
    }

    /**
     * Sets the value of the projectTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectTypeId(Integer value) {
        this.projectTypeId = value;
    }

    /**
     * Gets the value of the projectTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectTypeName() {
        return projectTypeName;
    }

    /**
     * Sets the value of the projectTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectTypeName(String value) {
        this.projectTypeName = value;
    }

    /**
     * Gets the value of the mimeTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMimeTypeId() {
        return mimeTypeId;
    }

    /**
     * Sets the value of the mimeTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMimeTypeId(Integer value) {
        this.mimeTypeId = value;
    }

    /**
     * Gets the value of the mimeTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeTypeName() {
        return mimeTypeName;
    }

    /**
     * Sets the value of the mimeTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeTypeName(String value) {
        this.mimeTypeName = value;
    }

    /**
     * Gets the value of the searchTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchTerm() {
        return searchTerm;
    }

    /**
     * Sets the value of the searchTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchTerm(String value) {
        this.searchTerm = value;
    }

}
