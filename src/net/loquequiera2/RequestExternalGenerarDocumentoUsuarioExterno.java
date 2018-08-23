
package net.loquequiera2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestExternalGenerarDocumentoUsuarioExterno complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestExternalGenerarDocumentoUsuarioExterno">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/}requestExternalGenerarDocumento">
 *       &lt;sequence>
 *         &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreYApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reparticion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestExternalGenerarDocumentoUsuarioExterno", propOrder = {
    "cargo",
    "nombreYApellido",
    "reparticion"
})
public class RequestExternalGenerarDocumentoUsuarioExterno
    extends RequestExternalGenerarDocumento
{

    protected String cargo;
    protected String nombreYApellido;
    protected String reparticion;

    /**
     * Gets the value of the cargo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Sets the value of the cargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargo(String value) {
        this.cargo = value;
    }

    /**
     * Gets the value of the nombreYApellido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreYApellido() {
        return nombreYApellido;
    }

    /**
     * Sets the value of the nombreYApellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreYApellido(String value) {
        this.nombreYApellido = value;
    }

    /**
     * Gets the value of the reparticion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReparticion() {
        return reparticion;
    }

    /**
     * Sets the value of the reparticion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReparticion(String value) {
        this.reparticion = value;
    }

}
