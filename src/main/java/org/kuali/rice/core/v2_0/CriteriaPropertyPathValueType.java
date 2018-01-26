
package org.kuali.rice.core.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriteriaPropertyPathValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriteriaPropertyPathValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rice.kuali.org/core/v2_0}propertyPath"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriteriaPropertyPathValueType", propOrder = {
    "propertyPath"
})
public class CriteriaPropertyPathValueType {

    @XmlElement(required = true)
    protected PropertyPathType propertyPath;

    /**
     * Gets the value of the propertyPath property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyPathType }
     *     
     */
    public PropertyPathType getPropertyPath() {
        return propertyPath;
    }

    /**
     * Sets the value of the propertyPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyPathType }
     *     
     */
    public void setPropertyPath(PropertyPathType value) {
        this.propertyPath = value;
    }

}
