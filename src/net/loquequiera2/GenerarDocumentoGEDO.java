
package net.loquequiera2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generarDocumentoGEDO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generarDocumentoGEDO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/}requestExternalGenerarDocumento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generarDocumentoGEDO", propOrder = {
    "request"
})
public class GenerarDocumentoGEDO {

    protected RequestExternalGenerarDocumento request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestExternalGenerarDocumento }
     *     
     */
    public RequestExternalGenerarDocumento getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestExternalGenerarDocumento }
     *     
     */
    public void setRequest(RequestExternalGenerarDocumento value) {
        this.request = value;
    }

}
