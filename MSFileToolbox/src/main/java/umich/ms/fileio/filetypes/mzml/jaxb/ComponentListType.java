
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

package umich.ms.fileio.filetypes.mzml.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * List with the different components used in the mass spectrometer. At least one source, one mass
 * analyzer and one detector need to be specified.
 *
 * <p>Java class for ComponentListType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ComponentListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{http://psi.hupo.org/ms/mzml}SourceComponentType" maxOccurs="unbounded"/>
 *         &lt;element name="analyzer" type="{http://psi.hupo.org/ms/mzml}AnalyzerComponentType" maxOccurs="unbounded"/>
 *         &lt;element name="detector" type="{http://psi.hupo.org/ms/mzml}DetectorComponentType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentListType", propOrder = {
    "source",
    "analyzer",
    "detector"
})
public class ComponentListType {

  @XmlElement(required = true)
  protected List<SourceComponentType> source;
  @XmlElement(required = true)
  protected List<AnalyzerComponentType> analyzer;
  @XmlElement(required = true)
  protected List<DetectorComponentType> detector;
  @XmlAttribute(name = "count", required = true)
  @XmlJavaTypeAdapter(Adapter1.class)
  @XmlSchemaType(name = "nonNegativeInteger")
  protected Integer count;

  /**
   * Gets the value of the source property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the source property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSource().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link SourceComponentType }
   */
  public List<SourceComponentType> getSource() {
    if (source == null) {
      source = new ArrayList<SourceComponentType>();
    }
    return this.source;
  }

  /**
   * Gets the value of the analyzer property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the analyzer property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAnalyzer().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link AnalyzerComponentType }
   */
  public List<AnalyzerComponentType> getAnalyzer() {
    if (analyzer == null) {
      analyzer = new ArrayList<AnalyzerComponentType>();
    }
    return this.analyzer;
  }

  /**
   * Gets the value of the detector property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the detector property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDetector().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link DetectorComponentType }
   */
  public List<DetectorComponentType> getDetector() {
    if (detector == null) {
      detector = new ArrayList<DetectorComponentType>();
    }
    return this.detector;
  }

  /**
   * Gets the value of the count property.
   *
   * @return possible object is {@link String }
   */
  public Integer getCount() {
    return count;
  }

  /**
   * Sets the value of the count property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCount(Integer value) {
    this.count = value;
  }

}
