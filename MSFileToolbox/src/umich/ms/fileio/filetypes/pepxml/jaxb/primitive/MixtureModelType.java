//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.11 at 08:31:05 PM EDT 
//


package umich.ms.fileio.filetypes.pepxml.jaxb.primitive;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mixtureModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mixtureModelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="point" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="pos_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="neg_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="neg_obs_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="pos_obs_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pos_bandwidth" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="neg_bandwidth" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mixtureModelType", propOrder = {
    "point"
})
public class MixtureModelType {

    protected List<MixtureModelPoint> point;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "pos_bandwidth", required = true)
    protected float posBandwidth;
    @XmlAttribute(name = "neg_bandwidth", required = true)
    protected float negBandwidth;

    /**
     * Gets the value of the point property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the point property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MixtureModelPoint }
     * 
     * 
     */
    public List<MixtureModelPoint> getPoint() {
        if (point == null) {
            point = new ArrayList<MixtureModelPoint>();
        }
        return this.point;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the posBandwidth property.
     * 
     */
    public float getPosBandwidth() {
        return posBandwidth;
    }

    /**
     * Sets the value of the posBandwidth property.
     * 
     */
    public void setPosBandwidth(float value) {
        this.posBandwidth = value;
    }

    /**
     * Gets the value of the negBandwidth property.
     * 
     */
    public float getNegBandwidth() {
        return negBandwidth;
    }

    /**
     * Sets the value of the negBandwidth property.
     * 
     */
    public void setNegBandwidth(float value) {
        this.negBandwidth = value;
    }

}
