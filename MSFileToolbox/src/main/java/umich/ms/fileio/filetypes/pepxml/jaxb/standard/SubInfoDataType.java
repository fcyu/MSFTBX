
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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Peptide found via aminoacid substitution. Can apply to represent a substitution within peptide
 * sequence, and/or on flanking residues
 *
 * <p>Java class for subInfoDataType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="subInfoDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="position" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="orig_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subInfoDataType")
public class SubInfoDataType {

  @XmlAttribute(name = "position")
  @XmlJavaTypeAdapter(Adapter1.class)
  @XmlSchemaType(name = "nonNegativeInteger")
  protected Integer position;
  @XmlAttribute(name = "orig_aa")
  protected String origAa;
  @XmlAttribute(name = "num_tol_term")
  @XmlJavaTypeAdapter(Adapter1.class)
  @XmlSchemaType(name = "nonNegativeInteger")
  protected Integer numTolTerm;
  @XmlAttribute(name = "peptide_prev_aa")
  protected String peptidePrevAa;
  @XmlAttribute(name = "peptide_next_aa")
  protected String peptideNextAa;

  /**
   * Gets the value of the position property.
   *
   * @return possible object is {@link String }
   */
  public Integer getPosition() {
    return position;
  }

  /**
   * Sets the value of the position property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPosition(Integer value) {
    this.position = value;
  }

  /**
   * Gets the value of the origAa property.
   *
   * @return possible object is {@link String }
   */
  public String getOrigAa() {
    return origAa;
  }

  /**
   * Sets the value of the origAa property.
   *
   * @param value allowed object is {@link String }
   */
  public void setOrigAa(String value) {
    this.origAa = value;
  }

  /**
   * Gets the value of the numTolTerm property.
   *
   * @return possible object is {@link String }
   */
  public Integer getNumTolTerm() {
    return numTolTerm;
  }

  /**
   * Sets the value of the numTolTerm property.
   *
   * @param value allowed object is {@link String }
   */
  public void setNumTolTerm(Integer value) {
    this.numTolTerm = value;
  }

  /**
   * Gets the value of the peptidePrevAa property.
   *
   * @return possible object is {@link String }
   */
  public String getPeptidePrevAa() {
    return peptidePrevAa;
  }

  /**
   * Sets the value of the peptidePrevAa property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPeptidePrevAa(String value) {
    this.peptidePrevAa = value;
  }

  /**
   * Gets the value of the peptideNextAa property.
   *
   * @return possible object is {@link String }
   */
  public String getPeptideNextAa() {
    return peptideNextAa;
  }

  /**
   * Sets the value of the peptideNextAa property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPeptideNextAa(String value) {
    this.peptideNextAa = value;
  }

}
