//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.20 at 12:01:04 AM CEST 
//


package claseEstacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the claseEstacion package. 
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

    private final static QName _Estacion_QNAME = new QName("https://api.mobipalma.mobi/docs/", "estacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: claseEstacion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Estacion }
     * 
     */
    public Estacion createEstacion() {
        return new Estacion();
    }

    /**
     * Create an instance of {@link Estacion.Anclajes }
     * 
     */
    public Estacion.Anclajes createEstacionAnclajes() {
        return new Estacion.Anclajes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Estacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://api.mobipalma.mobi/docs/", name = "estacion")
    public JAXBElement<Estacion> createEstacion(Estacion value) {
        return new JAXBElement<Estacion>(_Estacion_QNAME, Estacion.class, null, value);
    }

}
