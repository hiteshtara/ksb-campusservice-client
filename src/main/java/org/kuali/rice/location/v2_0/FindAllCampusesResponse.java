
package org.kuali.rice.location.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findAllCampusesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findAllCampusesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campuses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/location/v2_0}campus" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findAllCampusesResponse", propOrder = {
    "campuses"
})
public class FindAllCampusesResponse {

    protected FindAllCampusesResponse.Campuses campuses;

    /**
     * Gets the value of the campuses property.
     * 
     * @return
     *     possible object is
     *     {@link FindAllCampusesResponse.Campuses }
     *     
     */
    public FindAllCampusesResponse.Campuses getCampuses() {
        return campuses;
    }

    /**
     * Sets the value of the campuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindAllCampusesResponse.Campuses }
     *     
     */
    public void setCampuses(FindAllCampusesResponse.Campuses value) {
        this.campuses = value;
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
     *         &lt;element ref="{http://rice.kuali.org/location/v2_0}campus" maxOccurs="unbounded" minOccurs="0"/>
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
        "campus"
    })
    public static class Campuses {

        protected List<CampusType> campus;

        /**
         * Gets the value of the campus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the campus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCampus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CampusType }
         * 
         * 
         */
        public List<CampusType> getCampus() {
            if (campus == null) {
                campus = new ArrayList<CampusType>();
            }
            return this.campus;
        }

    }

}
