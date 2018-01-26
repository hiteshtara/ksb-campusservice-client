
package org.kuali.rice.location.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findCampusesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findCampusesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="results" type="{http://rice.kuali.org/location/v2_0}CampusQueryResultsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findCampusesResponse", propOrder = {
    "results"
})
public class FindCampusesResponse {

    protected CampusQueryResultsType results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link CampusQueryResultsType }
     *     
     */
    public CampusQueryResultsType getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampusQueryResultsType }
     *     
     */
    public void setResults(CampusQueryResultsType value) {
        this.results = value;
    }

}
