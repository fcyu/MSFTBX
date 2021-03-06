
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

package umich.ms.fileio.filetypes.mzidentml.jaxb.standard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A specification of how a nucleic acid sequence database was translated for searching.
 *
 * <p>Java class for DatabaseTranslationType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DatabaseTranslationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TranslationTable" type="{http://psidev.info/psi/pi/mzIdentML/1.2}TranslationTableType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="frames" type="{http://psidev.info/psi/pi/mzIdentML/1.2}listOfAllowedFrames" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseTranslationType", propOrder = {
    "translationTable"
})
public class DatabaseTranslationType {

  @XmlElement(name = "TranslationTable", required = true)
  protected List<TranslationTableType> translationTable;
  @XmlAttribute(name = "frames")
  protected List<Integer> frames;

  /**
   * Gets the value of the translationTable property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the translationTable property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTranslationTable().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link TranslationTableType }
   */
  public List<TranslationTableType> getTranslationTable() {
    if (translationTable == null) {
      translationTable = new ArrayList<TranslationTableType>(1);
    }
    return this.translationTable;
  }

  /**
   * Gets the value of the frames property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the frames property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFrames().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Integer }
   */
  public List<Integer> getFrames() {
    if (frames == null) {
      frames = new ArrayList<Integer>(1);
    }
    return this.frames;
  }

}
