
package net.loquequiera2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.loquequiera2 package. 
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

    private final static QName _GenerarDocumentoGEDOResponse_QNAME = new QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "generarDocumentoGEDOResponse");
    private final static QName _ParametroInvalidoException_QNAME = new QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "ParametroInvalidoException");
    private final static QName _CantidadDatosNoSoportadaException_QNAME = new QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "CantidadDatosNoSoportadaException");
    private final static QName _GenerarDocumentoUsuarioExternoResponse_QNAME = new QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "generarDocumentoUsuarioExternoResponse");
    private final static QName _GenerarDocumentoGEDO_QNAME = new QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "generarDocumentoGEDO");
    private final static QName _GenerarDocumentoUsuarioExterno_QNAME = new QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "generarDocumentoUsuarioExterno");
    private final static QName _ClavesFaltantesException_QNAME = new QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "ClavesFaltantesException");
    private final static QName _ErrorGeneracionDocumentoException_QNAME = new QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "ErrorGeneracionDocumentoException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.loquequiera2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestExternalGenerarDocumento }
     * 
     */
    public RequestExternalGenerarDocumento createRequestExternalGenerarDocumento() {
        return new RequestExternalGenerarDocumento();
    }

    /**
     * Create an instance of {@link RequestExternalGenerarDocumento.MetaDatos }
     * 
     */
    public RequestExternalGenerarDocumento.MetaDatos createRequestExternalGenerarDocumentoMetaDatos() {
        return new RequestExternalGenerarDocumento.MetaDatos();
    }

    /**
     * Create an instance of {@link RequestExternalGenerarDocumento.ListaUsuariosDestinatariosExternos }
     * 
     */
    public RequestExternalGenerarDocumento.ListaUsuariosDestinatariosExternos createRequestExternalGenerarDocumentoListaUsuariosDestinatariosExternos() {
        return new RequestExternalGenerarDocumento.ListaUsuariosDestinatariosExternos();
    }

    /**
     * Create an instance of {@link ErrorGeneracionDocumentoException }
     * 
     */
    public ErrorGeneracionDocumentoException createErrorGeneracionDocumentoException() {
        return new ErrorGeneracionDocumentoException();
    }

    /**
     * Create an instance of {@link ClavesFaltantesException }
     * 
     */
    public ClavesFaltantesException createClavesFaltantesException() {
        return new ClavesFaltantesException();
    }

    /**
     * Create an instance of {@link GenerarDocumentoUsuarioExterno }
     * 
     */
    public GenerarDocumentoUsuarioExterno createGenerarDocumentoUsuarioExterno() {
        return new GenerarDocumentoUsuarioExterno();
    }

    /**
     * Create an instance of {@link GenerarDocumentoUsuarioExternoResponse }
     * 
     */
    public GenerarDocumentoUsuarioExternoResponse createGenerarDocumentoUsuarioExternoResponse() {
        return new GenerarDocumentoUsuarioExternoResponse();
    }

    /**
     * Create an instance of {@link GenerarDocumentoGEDO }
     * 
     */
    public GenerarDocumentoGEDO createGenerarDocumentoGEDO() {
        return new GenerarDocumentoGEDO();
    }

    /**
     * Create an instance of {@link GenerarDocumentoGEDOResponse }
     * 
     */
    public GenerarDocumentoGEDOResponse createGenerarDocumentoGEDOResponse() {
        return new GenerarDocumentoGEDOResponse();
    }

    /**
     * Create an instance of {@link ParametroInvalidoException }
     * 
     */
    public ParametroInvalidoException createParametroInvalidoException() {
        return new ParametroInvalidoException();
    }

    /**
     * Create an instance of {@link CantidadDatosNoSoportadaException }
     * 
     */
    public CantidadDatosNoSoportadaException createCantidadDatosNoSoportadaException() {
        return new CantidadDatosNoSoportadaException();
    }

    /**
     * Create an instance of {@link ArchivoEmbebidoDTO }
     * 
     */
    public ArchivoEmbebidoDTO createArchivoEmbebidoDTO() {
        return new ArchivoEmbebidoDTO();
    }

    /**
     * Create an instance of {@link RequestExternalGenerarDocumentoUsuarioExterno }
     * 
     */
    public RequestExternalGenerarDocumentoUsuarioExterno createRequestExternalGenerarDocumentoUsuarioExterno() {
        return new RequestExternalGenerarDocumentoUsuarioExterno();
    }

    /**
     * Create an instance of {@link ResponseExternalGenerarDocumento }
     * 
     */
    public ResponseExternalGenerarDocumento createResponseExternalGenerarDocumento() {
        return new ResponseExternalGenerarDocumento();
    }

    /**
     * Create an instance of {@link RequestExternalGenerarDocumento.MetaDatos.Entry }
     * 
     */
    public RequestExternalGenerarDocumento.MetaDatos.Entry createRequestExternalGenerarDocumentoMetaDatosEntry() {
        return new RequestExternalGenerarDocumento.MetaDatos.Entry();
    }

    /**
     * Create an instance of {@link RequestExternalGenerarDocumento.ListaUsuariosDestinatariosExternos.Entry }
     * 
     */
    public RequestExternalGenerarDocumento.ListaUsuariosDestinatariosExternos.Entry createRequestExternalGenerarDocumentoListaUsuariosDestinatariosExternosEntry() {
        return new RequestExternalGenerarDocumento.ListaUsuariosDestinatariosExternos.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarDocumentoGEDOResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", name = "generarDocumentoGEDOResponse")
    public JAXBElement<GenerarDocumentoGEDOResponse> createGenerarDocumentoGEDOResponse(GenerarDocumentoGEDOResponse value) {
        return new JAXBElement<GenerarDocumentoGEDOResponse>(_GenerarDocumentoGEDOResponse_QNAME, GenerarDocumentoGEDOResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametroInvalidoException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", name = "ParametroInvalidoException")
    public JAXBElement<ParametroInvalidoException> createParametroInvalidoException(ParametroInvalidoException value) {
        return new JAXBElement<ParametroInvalidoException>(_ParametroInvalidoException_QNAME, ParametroInvalidoException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantidadDatosNoSoportadaException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", name = "CantidadDatosNoSoportadaException")
    public JAXBElement<CantidadDatosNoSoportadaException> createCantidadDatosNoSoportadaException(CantidadDatosNoSoportadaException value) {
        return new JAXBElement<CantidadDatosNoSoportadaException>(_CantidadDatosNoSoportadaException_QNAME, CantidadDatosNoSoportadaException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarDocumentoUsuarioExternoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", name = "generarDocumentoUsuarioExternoResponse")
    public JAXBElement<GenerarDocumentoUsuarioExternoResponse> createGenerarDocumentoUsuarioExternoResponse(GenerarDocumentoUsuarioExternoResponse value) {
        return new JAXBElement<GenerarDocumentoUsuarioExternoResponse>(_GenerarDocumentoUsuarioExternoResponse_QNAME, GenerarDocumentoUsuarioExternoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarDocumentoGEDO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", name = "generarDocumentoGEDO")
    public JAXBElement<GenerarDocumentoGEDO> createGenerarDocumentoGEDO(GenerarDocumentoGEDO value) {
        return new JAXBElement<GenerarDocumentoGEDO>(_GenerarDocumentoGEDO_QNAME, GenerarDocumentoGEDO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarDocumentoUsuarioExterno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", name = "generarDocumentoUsuarioExterno")
    public JAXBElement<GenerarDocumentoUsuarioExterno> createGenerarDocumentoUsuarioExterno(GenerarDocumentoUsuarioExterno value) {
        return new JAXBElement<GenerarDocumentoUsuarioExterno>(_GenerarDocumentoUsuarioExterno_QNAME, GenerarDocumentoUsuarioExterno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClavesFaltantesException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", name = "ClavesFaltantesException")
    public JAXBElement<ClavesFaltantesException> createClavesFaltantesException(ClavesFaltantesException value) {
        return new JAXBElement<ClavesFaltantesException>(_ClavesFaltantesException_QNAME, ClavesFaltantesException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorGeneracionDocumentoException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", name = "ErrorGeneracionDocumentoException")
    public JAXBElement<ErrorGeneracionDocumentoException> createErrorGeneracionDocumentoException(ErrorGeneracionDocumentoException value) {
        return new JAXBElement<ErrorGeneracionDocumentoException>(_ErrorGeneracionDocumentoException_QNAME, ErrorGeneracionDocumentoException.class, null, value);
    }

}
