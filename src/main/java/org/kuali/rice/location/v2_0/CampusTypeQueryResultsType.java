
package org.kuali.rice.location.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CampusTypeQueryResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampusTypeQueryResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="results" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CampusType" type="{http://rice.kuali.org/location/v2_0}CampusTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="totalRowCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="moreResultsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampusTypeQueryResultsType", propOrder = {
    "results",
    "totalRowCount",
    "moreResultsAvailable",
    "any"
})
public class CampusTypeQueryResultsType {

    protected CampusTypeQueryResultsType.Results results;
    protected Integer totalRowCount;
    protected boolean moreResultsAvailable;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link CampusTypeQueryResultsType.Results }
     *     
     */
    public CampusTypeQueryResultsType.Results getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampusTypeQueryResultsType.Results }
     *     
     */
    public void setResults(CampusTypeQueryResultsType.Results value) {
        this.results = value;
    }

    /**
     * Gets the value of the totalRowCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRowCount() {
        return totalRowCount;
    }

    /**
     * Sets the value of the totalRowCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRowCount(Integer value) {
        this.totalRowCount = value;
    }

    /**
     * Gets the value of the moreResultsAvailable property.
     * 
     */
    public boolean isMoreResultsAvailable() {
        return moreResultsAvailable;
    }

    /**
     * Sets the value of the moreResultsAvailable property.
     * 
     */
    public void setMoreResultsAvailable(boolean value) {
        this.moreResultsAvailable = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CampusType" type="{http://rice.kuali.org/location/v2_0}CampusTypeType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "campusType"
    })
    public static class Results {

        @XmlElement(name = "CampusType")
        protected List<CampusTypeType> campusType;

        /**
         * Gets the value of the campusType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the campusType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCampusType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CampusTypeType }
         * 
         * 
         */
        public List<CampusTypeType> getCampusType() {
            if (campusType == null) {
                campusType = new ArrayList<CampusTypeType>();
            }
            return this.campusType;
        }

    }

}
