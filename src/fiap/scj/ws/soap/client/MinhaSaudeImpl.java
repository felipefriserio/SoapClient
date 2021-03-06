
package fiap.scj.ws.soap.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MinhaSaudeImpl", targetNamespace = "http://soap.ws.scj.fiap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MinhaSaudeImpl {


    /**
     * 
     * @param altura
     * @param peso
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calcularImc", targetNamespace = "http://soap.ws.scj.fiap/", className = "fiap.scj.ws.soap.client.CalcularImc")
    @ResponseWrapper(localName = "calcularImcResponse", targetNamespace = "http://soap.ws.scj.fiap/", className = "fiap.scj.ws.soap.client.CalcularImcResponse")
    @Action(input = "http://soap.ws.scj.fiap/MinhaSaudeImpl/calcularImcRequest", output = "http://soap.ws.scj.fiap/MinhaSaudeImpl/calcularImcResponse")
    public float calcularImc(
        @WebParam(name = "altura", targetNamespace = "")
        float altura,
        @WebParam(name = "peso", targetNamespace = "")
        float peso);

    /**
     * 
     * @param imc
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "classificacaoImc", targetNamespace = "http://soap.ws.scj.fiap/", className = "fiap.scj.ws.soap.client.ClassificacaoImc")
    @ResponseWrapper(localName = "classificacaoImcResponse", targetNamespace = "http://soap.ws.scj.fiap/", className = "fiap.scj.ws.soap.client.ClassificacaoImcResponse")
    @Action(input = "http://soap.ws.scj.fiap/MinhaSaudeImpl/classificacaoImcRequest", output = "http://soap.ws.scj.fiap/MinhaSaudeImpl/classificacaoImcResponse")
    public String classificacaoImc(
        @WebParam(name = "imc", targetNamespace = "")
        float imc);

}
