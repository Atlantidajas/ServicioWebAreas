
package com.calculararea;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.calculararea package. 
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

    private final static QName _AreaCircuferencia_QNAME = new QName("http://CalcularArea.com/", "areaCircuferencia");
    private final static QName _AreaCircuferenciaResponse_QNAME = new QName("http://CalcularArea.com/", "areaCircuferenciaResponse");
    private final static QName _AreaCuadrado_QNAME = new QName("http://CalcularArea.com/", "areaCuadrado");
    private final static QName _AreaCuadradoResponse_QNAME = new QName("http://CalcularArea.com/", "areaCuadradoResponse");
    private final static QName _AreaTriangulo_QNAME = new QName("http://CalcularArea.com/", "areaTriangulo");
    private final static QName _AreaTrianguloResponse_QNAME = new QName("http://CalcularArea.com/", "areaTrianguloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.calculararea
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AreaCircuferencia }
     * 
     */
    public AreaCircuferencia createAreaCircuferencia() {
        return new AreaCircuferencia();
    }

    /**
     * Create an instance of {@link AreaCircuferenciaResponse }
     * 
     */
    public AreaCircuferenciaResponse createAreaCircuferenciaResponse() {
        return new AreaCircuferenciaResponse();
    }

    /**
     * Create an instance of {@link AreaCuadrado }
     * 
     */
    public AreaCuadrado createAreaCuadrado() {
        return new AreaCuadrado();
    }

    /**
     * Create an instance of {@link AreaCuadradoResponse }
     * 
     */
    public AreaCuadradoResponse createAreaCuadradoResponse() {
        return new AreaCuadradoResponse();
    }

    /**
     * Create an instance of {@link AreaTriangulo }
     * 
     */
    public AreaTriangulo createAreaTriangulo() {
        return new AreaTriangulo();
    }

    /**
     * Create an instance of {@link AreaTrianguloResponse }
     * 
     */
    public AreaTrianguloResponse createAreaTrianguloResponse() {
        return new AreaTrianguloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaCircuferencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CalcularArea.com/", name = "areaCircuferencia")
    public JAXBElement<AreaCircuferencia> createAreaCircuferencia(AreaCircuferencia value) {
        return new JAXBElement<AreaCircuferencia>(_AreaCircuferencia_QNAME, AreaCircuferencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaCircuferenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CalcularArea.com/", name = "areaCircuferenciaResponse")
    public JAXBElement<AreaCircuferenciaResponse> createAreaCircuferenciaResponse(AreaCircuferenciaResponse value) {
        return new JAXBElement<AreaCircuferenciaResponse>(_AreaCircuferenciaResponse_QNAME, AreaCircuferenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaCuadrado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CalcularArea.com/", name = "areaCuadrado")
    public JAXBElement<AreaCuadrado> createAreaCuadrado(AreaCuadrado value) {
        return new JAXBElement<AreaCuadrado>(_AreaCuadrado_QNAME, AreaCuadrado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaCuadradoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CalcularArea.com/", name = "areaCuadradoResponse")
    public JAXBElement<AreaCuadradoResponse> createAreaCuadradoResponse(AreaCuadradoResponse value) {
        return new JAXBElement<AreaCuadradoResponse>(_AreaCuadradoResponse_QNAME, AreaCuadradoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaTriangulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CalcularArea.com/", name = "areaTriangulo")
    public JAXBElement<AreaTriangulo> createAreaTriangulo(AreaTriangulo value) {
        return new JAXBElement<AreaTriangulo>(_AreaTriangulo_QNAME, AreaTriangulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaTrianguloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CalcularArea.com/", name = "areaTrianguloResponse")
    public JAXBElement<AreaTrianguloResponse> createAreaTrianguloResponse(AreaTrianguloResponse value) {
        return new JAXBElement<AreaTrianguloResponse>(_AreaTrianguloResponse_QNAME, AreaTrianguloResponse.class, null, value);
    }

}
