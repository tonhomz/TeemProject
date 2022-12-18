
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coviddata2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coviddata2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newCase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="newCaseExcludeabroad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="newDeath" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalCaseExcludeabroad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalDeath" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weeknum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="yy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coviddata2", propOrder = {
    "newCase",
    "newCaseExcludeabroad",
    "newDeath",
    "province",
    "totalCase",
    "totalCaseExcludeabroad",
    "totalDeath",
    "updateDate",
    "weeknum",
    "yy"
})
public class Coviddata2 {

    protected Integer newCase;
    protected Integer newCaseExcludeabroad;
    protected Integer newDeath;
    protected String province;
    protected Integer totalCase;
    protected Integer totalCaseExcludeabroad;
    protected Integer totalDeath;
    protected String updateDate;
    protected Integer weeknum;
    protected Integer yy;

    /**
     * Gets the value of the newCase property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewCase() {
        return newCase;
    }

    /**
     * Sets the value of the newCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewCase(Integer value) {
        this.newCase = value;
    }

    /**
     * Gets the value of the newCaseExcludeabroad property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    /**
     * Sets the value of the newCaseExcludeabroad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewCaseExcludeabroad(Integer value) {
        this.newCaseExcludeabroad = value;
    }

    /**
     * Gets the value of the newDeath property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewDeath() {
        return newDeath;
    }

    /**
     * Sets the value of the newDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewDeath(Integer value) {
        this.newDeath = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * Gets the value of the totalCase property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCase() {
        return totalCase;
    }

    /**
     * Sets the value of the totalCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCase(Integer value) {
        this.totalCase = value;
    }

    /**
     * Gets the value of the totalCaseExcludeabroad property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    /**
     * Sets the value of the totalCaseExcludeabroad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCaseExcludeabroad(Integer value) {
        this.totalCaseExcludeabroad = value;
    }

    /**
     * Gets the value of the totalDeath property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalDeath() {
        return totalDeath;
    }

    /**
     * Sets the value of the totalDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalDeath(Integer value) {
        this.totalDeath = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDate(String value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the weeknum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeeknum() {
        return weeknum;
    }

    /**
     * Sets the value of the weeknum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeeknum(Integer value) {
        this.weeknum = value;
    }

    /**
     * Gets the value of the yy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYy() {
        return yy;
    }

    /**
     * Sets the value of the yy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYy(Integer value) {
        this.yy = value;
    }

}
