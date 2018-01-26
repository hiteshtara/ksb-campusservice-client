
package org.kuali.rice.location.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findCampusTypesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findCampusTypesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="results" type="{http://rice.kuali.org/location/v2_0}CampusTypeQueryResultsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findCampusTypesResponse", propOrder = {
    "results"
})
public class FindCampusTypesResponse {

    protected CampusTypeQueryResultsType results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link CampusTypeQueryResultsType }
     *     
     */
    public CampusTypeQueryResultsType getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampusTypeQueryResultsType }
     *     
     */
    public void setResults(CampusTypeQueryResultsType value) {
        this.results = value;
    }

}
