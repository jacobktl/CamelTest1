
package com.widgetvendor.types.widgettypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.widgetvendor.types.widgettypes package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _KeyElem_QNAME = new QName("http://widgetVendor.com/types/widgetTypes", "keyElem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.widgetvendor.types.widgettypes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://widgetVendor.com/types/widgetTypes", name = "keyElem")
    public JAXBElement<byte[]> createKeyElem(byte[] value) {
        return new JAXBElement<byte[]>(_KeyElem_QNAME, byte[].class, null, ((byte[]) value));
    }

}
