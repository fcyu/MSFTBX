//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.11 at 10:25:05 PM EDT 
//


package umich.ms.fileio.filetypes.protxml.jaxb.primitive;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="nsp_distribution" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="bin_no" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="nsp_lower_bound_incl" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="nsp_upper_bound_excl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="nsp_lower_bound_excl" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="nsp_upper_bound_incl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pos_freq" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="neg_freq" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="pos_to_neg_ratio" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="alt_pos_to_neg_ratio" type="{http://www.w3.org/2001/XMLSchema}double" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="neighboring_bin_smoothing" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nspDistribution"
})
public class NspInformation {

    @XmlElement(name = "nsp_distribution", required = true)
    protected List<NspDistribution> nspDistribution;
    @XmlAttribute(name = "neighboring_bin_smoothing", required = true)
    protected String neighboringBinSmoothing;

    /**
     * Gets the value of the nspDistribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nspDistribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNspDistribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NspDistribution }
     * 
     * 
     */
    public List<NspDistribution> getNspDistribution() {
        if (nspDistribution == null) {
            nspDistribution = new ArrayList<NspDistribution>();
        }
        return this.nspDistribution;
    }

    /**
     * Gets the value of the neighboringBinSmoothing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeighboringBinSmoothing() {
        return neighboringBinSmoothing;
    }

    /**
     * Sets the value of the neighboringBinSmoothing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeighboringBinSmoothing(String value) {
        this.neighboringBinSmoothing = value;
    }

}
