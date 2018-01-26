
package org.kuali.rice.location.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCampusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCampusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/location/v2_0}campus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCampusResponse", propOrder = {
    "campus"
})
public class GetCampusResponse {

    protected CampusType campus;

    /**
     * Gets the value of the campus property.
     * 
     * @return
     *     possible object is
     *     {@link CampusType }
     *     
     */
    public CampusType getCampus() {
        return campus;
    }

    /**
     * Sets the value of the campus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampusType }
     *     
     */
    public void setCampus(CampusType value) {
        this.campus = value;
    }

}
