//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.18 at 01:26:07 PM PDT 
//


package umich.ms.io.type.mzidentml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A person's name and contact details. Any additional information such as the address, contact email etc. should be supplied using CV parameters or user parameters.
 * 
 * <p>Java class for PersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://psidev.info/psi/pi/mzIdentML/1.2}AbstractContactType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Affiliation" type="{http://psidev.info/psi/pi/mzIdentML/1.2}AffiliationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="midInitials" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", namespace = "http://psidev.info/psi/pi/mzIdentML/1.2", propOrder = {
    "affiliation"
})
public class PersonType
    extends AbstractContactType
{

    @XmlElement(name = "Affiliation", namespace = "http://psidev.info/psi/pi/mzIdentML/1.2")
    protected List<AffiliationType> affiliation;
    @XmlAttribute(name = "lastName")
    protected String lastName;
    @XmlAttribute(name = "firstName")
    protected String firstName;
    @XmlAttribute(name = "midInitials")
    protected String midInitials;

    /**
     * Gets the value of the affiliation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affiliation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffiliation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffiliationType }
     * 
     * 
     */
    public List<AffiliationType> getAffiliation() {
        if (affiliation == null) {
            affiliation = new ArrayList<AffiliationType>();
        }
        return this.affiliation;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the midInitials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidInitials() {
        return midInitials;
    }

    /**
     * Sets the value of the midInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidInitials(String value) {
        this.midInitials = value;
    }

}
