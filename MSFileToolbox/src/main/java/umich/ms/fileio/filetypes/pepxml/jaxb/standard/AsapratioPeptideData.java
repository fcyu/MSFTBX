
/*
 * Copyright (c) 2017 Dmitry Avtonomov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package umich.ms.fileio.filetypes.pepxml.jaxb.standard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://regis-web.systemsbiology.net/pepXML}asapratio_contribution" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="status" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="cidIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="light_mass" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="heavy_mass" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="area_flag" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asapratioContribution"
})
@XmlRootElement(name = "asapratio_peptide_data")
public class AsapratioPeptideData {

  @XmlElement(name = "asapratio_contribution", required = true)
  protected List<AsapratioContribution> asapratioContribution;
  @XmlAttribute(name = "status", required = true)
  protected byte status;
  @XmlAttribute(name = "cidIndex", required = true)
  protected int cidIndex;
  @XmlAttribute(name = "light_mass", required = true)
  protected double lightMass;
  @XmlAttribute(name = "heavy_mass", required = true)
  protected double heavyMass;
  @XmlAttribute(name = "area_flag", required = true)
  @XmlSchemaType(name = "unsignedInt")
  protected long areaFlag;

  /**
   * Gets the value of the asapratioContribution property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the asapratioContribution property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAsapratioContribution().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link AsapratioContribution }
   */
  public List<AsapratioContribution> getAsapratioContribution() {
    if (asapratioContribution == null) {
      asapratioContribution = new ArrayList<AsapratioContribution>(1);
    }
    return this.asapratioContribution;
  }

  /**
   * Gets the value of the status property.
   */
  public byte getStatus() {
    return status;
  }

  /**
   * Sets the value of the status property.
   */
  public void setStatus(byte value) {
    this.status = value;
  }

  /**
   * Gets the value of the cidIndex property.
   */
  public int getCidIndex() {
    return cidIndex;
  }

  /**
   * Sets the value of the cidIndex property.
   */
  public void setCidIndex(int value) {
    this.cidIndex = value;
  }

  /**
   * Gets the value of the lightMass property.
   */
  public double getLightMass() {
    return lightMass;
  }

  /**
   * Sets the value of the lightMass property.
   */
  public void setLightMass(double value) {
    this.lightMass = value;
  }

  /**
   * Gets the value of the heavyMass property.
   */
  public double getHeavyMass() {
    return heavyMass;
  }

  /**
   * Sets the value of the heavyMass property.
   */
  public void setHeavyMass(double value) {
    this.heavyMass = value;
  }

  /**
   * Gets the value of the areaFlag property.
   */
  public long getAreaFlag() {
    return areaFlag;
  }

  /**
   * Sets the value of the areaFlag property.
   */
  public void setAreaFlag(long value) {
    this.areaFlag = value;
  }

}
