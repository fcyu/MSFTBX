
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
 * List and descriptions of data processing applied to this data.
 *
 * <p>Java class for DataProcessingListType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DataProcessingListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataProcessing" type="{http://psi.hupo.org/ms/mzml}DataProcessingType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataProcessingListType", propOrder = {
    "dataProcessing"
})
public class DataProcessingListType {

  @XmlElement(required = true)
  protected List<DataProcessingType> dataProcessing;
  @XmlAttribute(name = "count", required = true)
  @XmlJavaTypeAdapter(Adapter1.class)
  @XmlSchemaType(name = "nonNegativeInteger")
  protected Integer count;

  /**
   * Gets the value of the dataProcessing property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the dataProcessing property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDataProcessing().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list {@link DataProcessingType }
   */
  public List<DataProcessingType> getDataProcessing() {
    if (dataProcessing == null) {
      dataProcessing = new ArrayList<DataProcessingType>();
    }
    return this.dataProcessing;
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
