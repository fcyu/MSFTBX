//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.18 at 01:26:07 PM PDT 
//


package umich.ms.io.type.mzidentml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Organizations are entities like companies, universities, government agencies. Any additional information such as the address, email etc. should be supplied either as CV parameters or as user parameters. 
 * 
 * <p>Java class for OrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://psidev.info/psi/pi/mzIdentML/1.2}AbstractContactType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parent" type="{http://psidev.info/psi/pi/mzIdentML/1.2}ParentOrganizationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationType", namespace = "http://psidev.info/psi/pi/mzIdentML/1.2", propOrder = {
    "parent"
})
public class OrganizationType
    extends AbstractContactType
{

    @XmlElement(name = "Parent", namespace = "http://psidev.info/psi/pi/mzIdentML/1.2")
    protected ParentOrganizationType parent;

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link ParentOrganizationType }
     *     
     */
    public ParentOrganizationType getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentOrganizationType }
     *     
     */
    public void setParent(ParentOrganizationType value) {
        this.parent = value;
    }

}
