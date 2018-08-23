
package net.loquequiera2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generarDocumentoUsuarioExterno complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generarDocumentoUsuarioExterno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/}requestExternalGenerarDocumentoUsuarioExterno" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generarDocumentoUsuarioExterno", propOrder = {
    "request"
})
public class GenerarDocumentoUsuarioExterno {

    protected RequestExternalGenerarDocumentoUsuarioExterno request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestExternalGenerarDocumentoUsuarioExterno }
     *     
     */
    public RequestExternalGenerarDocumentoUsuarioExterno getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestExternalGenerarDocumentoUsuarioExterno }
     *     
     */
    public void setRequest(RequestExternalGenerarDocumentoUsuarioExterno value) {
        this.request = value;
    }

}
