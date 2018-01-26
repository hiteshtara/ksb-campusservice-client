
package org.kuali.rice.location.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCampusTypeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCampusTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/location/v2_0}campusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCampusTypeResponse", propOrder = {
    "campusType"
})
public class GetCampusTypeResponse {

    protected CampusTypeType campusType;

    /**
     * Gets the value of the campusType property.
     * 
     * @return
     *     possible object is
     *     {@link CampusTypeType }
     *     
     */
    public CampusTypeType getCampusType() {
        return campusType;
    }

    /**
     * Sets the value of the campusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampusTypeType }
     *     
     */
    public void setCampusType(CampusTypeType value) {
        this.campusType = value;
    }

}
