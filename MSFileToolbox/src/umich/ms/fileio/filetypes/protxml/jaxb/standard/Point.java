//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.11 at 10:24:01 PM EDT 
//


package umich.ms.fileio.filetypes.protxml.jaxb.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="logratio" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="obs_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="model_distr" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Point {

    @XmlAttribute(name = "logratio", required = true)
    protected double logratio;
    @XmlAttribute(name = "obs_distr", required = true)
    protected double obsDistr;
    @XmlAttribute(name = "model_distr", required = true)
    protected double modelDistr;

    /**
     * Gets the value of the logratio property.
     * 
     */
    public double getLogratio() {
        return logratio;
    }

    /**
     * Sets the value of the logratio property.
     * 
     */
    public void setLogratio(double value) {
        this.logratio = value;
    }

    /**
     * Gets the value of the obsDistr property.
     * 
     */
    public double getObsDistr() {
        return obsDistr;
    }

    /**
     * Sets the value of the obsDistr property.
     * 
     */
    public void setObsDistr(double value) {
        this.obsDistr = value;
    }

    /**
     * Gets the value of the modelDistr property.
     * 
     */
    public double getModelDistr() {
        return modelDistr;
    }

    /**
     * Sets the value of the modelDistr property.
     * 
     */
    public void setModelDistr(double value) {
        this.modelDistr = value;
    }

}
