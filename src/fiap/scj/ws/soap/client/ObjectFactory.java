
package fiap.scj.ws.soap.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fiap.scj.ws.soap.client package. 
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

    private final static QName _ClassificacaoImcResponse_QNAME = new QName("http://soap.ws.scj.fiap/", "classificacaoImcResponse");
    private final static QName _ClassificacaoImc_QNAME = new QName("http://soap.ws.scj.fiap/", "classificacaoImc");
    private final static QName _CalcularImcResponse_QNAME = new QName("http://soap.ws.scj.fiap/", "calcularImcResponse");
    private final static QName _CalcularImc_QNAME = new QName("http://soap.ws.scj.fiap/", "calcularImc");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fiap.scj.ws.soap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularImcResponse }
     * 
     */
    public CalcularImcResponse createCalcularImcResponse() {
        return new CalcularImcResponse();
    }

    /**
     * Create an instance of {@link ClassificacaoImc }
     * 
     */
    public ClassificacaoImc createClassificacaoImc() {
        return new ClassificacaoImc();
    }

    /**
     * Create an instance of {@link CalcularImc }
     * 
     */
    public CalcularImc createCalcularImc() {
        return new CalcularImc();
    }

    /**
     * Create an instance of {@link ClassificacaoImcResponse }
     * 
     */
    public ClassificacaoImcResponse createClassificacaoImcResponse() {
        return new ClassificacaoImcResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificacaoImcResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "classificacaoImcResponse")
    public JAXBElement<ClassificacaoImcResponse> createClassificacaoImcResponse(ClassificacaoImcResponse value) {
        return new JAXBElement<ClassificacaoImcResponse>(_ClassificacaoImcResponse_QNAME, ClassificacaoImcResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificacaoImc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "classificacaoImc")
    public JAXBElement<ClassificacaoImc> createClassificacaoImc(ClassificacaoImc value) {
        return new JAXBElement<ClassificacaoImc>(_ClassificacaoImc_QNAME, ClassificacaoImc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularImcResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "calcularImcResponse")
    public JAXBElement<CalcularImcResponse> createCalcularImcResponse(CalcularImcResponse value) {
        return new JAXBElement<CalcularImcResponse>(_CalcularImcResponse_QNAME, CalcularImcResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularImc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.scj.fiap/", name = "calcularImc")
    public JAXBElement<CalcularImc> createCalcularImc(CalcularImc value) {
        return new JAXBElement<CalcularImc>(_CalcularImc_QNAME, CalcularImc.class, null, value);
    }

}
