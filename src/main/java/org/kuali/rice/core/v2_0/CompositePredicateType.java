
package org.kuali.rice.core.v2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompositePredicateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositePredicateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rice.kuali.org/core/v2_0}abstractPredicate">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}and"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}equal"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}equalIgnoreCase"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}existsSubQuery"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}greaterThan"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}greaterThanOrEqual"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}in"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}inIgnoreCase"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}lessThan"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}lessThanOrEqual"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}like"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}likeIgnoreCase"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}notEqual"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}notEqualIgnoreCase"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}notIn"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}notInIgnoreCase"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}notLikeIgnoreCase"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}notLike"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}notNull"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}null"/>
 *           &lt;element ref="{http://rice.kuali.org/core/v2_0}or"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositePredicateType", propOrder = {
    "andOrEqualOrEqualIgnoreCase"
})
@XmlSeeAlso({
    AndType.class,
    OrType.class
})
public abstract class CompositePredicateType
    extends AbstractPredicate
{

    @XmlElements({
        @XmlElement(name = "notInIgnoreCase", type = NotInIgnoreCaseType.class),
        @XmlElement(name = "notLike", type = NotLikeType.class),
        @XmlElement(name = "like", type = LikeType.class),
        @XmlElement(name = "and", type = AndType.class),
        @XmlElement(name = "greaterThan", type = GreaterThanType.class),
        @XmlElement(name = "notEqualIgnoreCase", type = NotEqualIgnoreCaseType.class),
        @XmlElement(name = "notEqual", type = NotEqualType.class),
        @XmlElement(name = "lessThan", type = LessThanType.class),
        @XmlElement(name = "lessThanOrEqual", type = LessThanOrEqualType.class),
        @XmlElement(name = "notNull", type = NotNullType.class),
        @XmlElement(name = "or", type = OrType.class),
        @XmlElement(name = "existsSubQuery", type = ExistsSubQueryType.class),
        @XmlElement(name = "equal", type = EqualType.class),
        @XmlElement(name = "inIgnoreCase", type = InIgnoreCaseType.class),
        @XmlElement(name = "in", type = InType.class),
        @XmlElement(name = "equalIgnoreCase", type = EqualIgnoreCaseType.class),
        @XmlElement(name = "greaterThanOrEqual", type = GreaterThanOrEqualType.class),
        @XmlElement(name = "notIn", type = NotInType.class),
        @XmlElement(name = "notLikeIgnoreCase", type = NotLikeIgnoreCaseType.class),
        @XmlElement(name = "likeIgnoreCase", type = LikeIgnoreCaseType.class),
        @XmlElement(name = "null", type = NullType.class)
    })
    protected List<AbstractPredicate> andOrEqualOrEqualIgnoreCase;

    /**
     * Gets the value of the andOrEqualOrEqualIgnoreCase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the andOrEqualOrEqualIgnoreCase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAndOrEqualOrEqualIgnoreCase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotInIgnoreCaseType }
     * {@link NotLikeType }
     * {@link LikeType }
     * {@link AndType }
     * {@link GreaterThanType }
     * {@link NotEqualIgnoreCaseType }
     * {@link NotEqualType }
     * {@link LessThanType }
     * {@link LessThanOrEqualType }
     * {@link NotNullType }
     * {@link OrType }
     * {@link ExistsSubQueryType }
     * {@link EqualType }
     * {@link InIgnoreCaseType }
     * {@link InType }
     * {@link EqualIgnoreCaseType }
     * {@link GreaterThanOrEqualType }
     * {@link NotInType }
     * {@link NotLikeIgnoreCaseType }
     * {@link LikeIgnoreCaseType }
     * {@link NullType }
     * 
     * 
     */
    public List<AbstractPredicate> getAndOrEqualOrEqualIgnoreCase() {
        if (andOrEqualOrEqualIgnoreCase == null) {
            andOrEqualOrEqualIgnoreCase = new ArrayList<AbstractPredicate>();
        }
        return this.andOrEqualOrEqualIgnoreCase;
    }

}
