//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.22 at 02:29:00 PM EDT 
//


package umich.ms.fileio.filetypes.protxml.jaxb;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Float>
{


    public Float unmarshal(String value) {
        return (javax.xml.bind.DatatypeConverter.parseFloat(value));
    }

    public String marshal(Float value) {
        if (value == null) {
            return null;
        }
        return (javax.xml.bind.DatatypeConverter.printFloat(value));
    }

}
