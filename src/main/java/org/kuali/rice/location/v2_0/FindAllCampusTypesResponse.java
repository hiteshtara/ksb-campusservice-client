
package org.kuali.rice.location.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findAllCampusTypesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findAllCampusTypesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campusTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://rice.kuali.org/location/v2_0}campusType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "findAllCampusTypesResponse", propOrder = {
    "campusTypes"
})
public class FindAllCampusTypesResponse {

    protected FindAllCampusTypesResponse.CampusTypes campusTypes;

    /**
     * Gets the value of the campusTypes property.
     * 
     * @return
     *     possible object is
     *     {@link FindAllCampusTypesResponse.CampusTypes }
     *     
     */
    public FindAllCampusTypesResponse.CampusTypes getCampusTypes() {
        return campusTypes;
    }

    /**
     * Sets the value of the campusTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindAllCampusTypesResponse.CampusTypes }
     *     
     */
    public void setCampusTypes(FindAllCampusTypesResponse.CampusTypes value) {
        this.campusTypes = value;
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
     *         &lt;element ref="{http://rice.kuali.org/location/v2_0}campusType" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class CampusTypes {

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
