//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.18 at 01:26:07 PM PDT 
//


package umich.ms.io.type.mzidentml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The parameters and settings of a ProteinDetection process.
 * 
 * <p>Java class for ProteinDetectionProtocolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProteinDetectionProtocolType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://psidev.info/psi/pi/mzIdentML/1.2}IdentifiableType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnalysisParams" type="{http://psidev.info/psi/pi/mzIdentML/1.2}ParamListType" minOccurs="0"/&gt;
 *         &lt;element name="Threshold" type="{http://psidev.info/psi/pi/mzIdentML/1.2}ParamListType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="analysisSoftware_ref" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProteinDetectionProtocolType", namespace = "http://psidev.info/psi/pi/mzIdentML/1.2", propOrder = {
    "analysisParams",
    "threshold"
})
public class ProteinDetectionProtocolType
    extends IdentifiableType
{

    @XmlElement(name = "AnalysisParams", namespace = "http://psidev.info/psi/pi/mzIdentML/1.2")
    protected ParamListType analysisParams;
    @XmlElement(name = "Threshold", namespace = "http://psidev.info/psi/pi/mzIdentML/1.2", required = true)
    protected ParamListType threshold;
    @XmlAttribute(name = "analysisSoftware_ref", required = true)
    protected String analysisSoftwareRef;

    /**
     * Gets the value of the analysisParams property.
     * 
     * @return
     *     possible object is
     *     {@link ParamListType }
     *     
     */
    public ParamListType getAnalysisParams() {
        return analysisParams;
    }

    /**
     * Sets the value of the analysisParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamListType }
     *     
     */
    public void setAnalysisParams(ParamListType value) {
        this.analysisParams = value;
    }

    /**
     * Gets the value of the threshold property.
     * 
     * @return
     *     possible object is
     *     {@link ParamListType }
     *     
     */
    public ParamListType getThreshold() {
        return threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamListType }
     *     
     */
    public void setThreshold(ParamListType value) {
        this.threshold = value;
    }

    /**
     * Gets the value of the analysisSoftwareRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysisSoftwareRef() {
        return analysisSoftwareRef;
    }

    /**
     * Sets the value of the analysisSoftwareRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysisSoftwareRef(String value) {
        this.analysisSoftwareRef = value;
    }

}
