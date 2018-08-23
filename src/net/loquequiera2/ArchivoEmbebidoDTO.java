
package net.loquequiera2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for archivoEmbebidoDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="archivoEmbebidoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataArchivo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="nombreArchivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "archivoEmbebidoDTO", propOrder = {
    "dataArchivo",
    "nombreArchivo"
})
public class ArchivoEmbebidoDTO {

    protected byte[] dataArchivo;
    protected String nombreArchivo;

    /**
     * Gets the value of the dataArchivo property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDataArchivo() {
        return dataArchivo;
    }

    /**
     * Sets the value of the dataArchivo property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDataArchivo(byte[] value) {
        this.dataArchivo = value;
    }

    /**
     * Gets the value of the nombreArchivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * Sets the value of the nombreArchivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreArchivo(String value) {
        this.nombreArchivo = value;
    }

}
