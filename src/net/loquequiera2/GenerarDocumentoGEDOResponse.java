
package net.loquequiera2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generarDocumentoGEDOResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generarDocumentoGEDOResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/}responseExternalGenerarDocumento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generarDocumentoGEDOResponse", propOrder = {
    "_return"
})
public class GenerarDocumentoGEDOResponse {

    @XmlElement(name = "return")
    protected ResponseExternalGenerarDocumento _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseExternalGenerarDocumento }
     *     
     */
    public ResponseExternalGenerarDocumento getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseExternalGenerarDocumento }
     *     
     */
    public void setReturn(ResponseExternalGenerarDocumento value) {
        this._return = value;
    }

}
