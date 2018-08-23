
package net.loquequiera2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestExternalGenerarDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestExternalGenerarDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acronimoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="idTransaccion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="listaArchivosEmbebidos" type="{http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/}archivoEmbebidoDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listaUsuariosDestinatarios" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listaUsuariosDestinatariosCopia" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listaUsuariosDestinatariosCopiaOculta" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listaUsuariosDestinatariosExternos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mensajeDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaDatos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sistemaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoArchivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestExternalGenerarDocumento", propOrder = {
    "acronimoTipoDocumento",
    "data",
    "idTransaccion",
    "listaArchivosEmbebidos",
    "listaUsuariosDestinatarios",
    "listaUsuariosDestinatariosCopia",
    "listaUsuariosDestinatariosCopiaOculta",
    "listaUsuariosDestinatariosExternos",
    "mensajeDestinatario",
    "metaDatos",
    "referencia",
    "sistemaOrigen",
    "tipoArchivo",
    "usuario"
})
@XmlSeeAlso({
    RequestExternalGenerarDocumentoUsuarioExterno.class
})
public class RequestExternalGenerarDocumento {

    protected String acronimoTipoDocumento;
    protected byte[] data;
    protected Integer idTransaccion;
    @XmlElement(nillable = true)
    protected List<ArchivoEmbebidoDTO> listaArchivosEmbebidos;
    @XmlElement(nillable = true)
    protected List<String> listaUsuariosDestinatarios;
    @XmlElement(nillable = true)
    protected List<String> listaUsuariosDestinatariosCopia;
    @XmlElement(nillable = true)
    protected List<String> listaUsuariosDestinatariosCopiaOculta;
    @XmlElement(required = true)
    protected RequestExternalGenerarDocumento.ListaUsuariosDestinatariosExternos listaUsuariosDestinatariosExternos;
    protected String mensajeDestinatario;
    @XmlElement(required = true)
    protected RequestExternalGenerarDocumento.MetaDatos metaDatos;
    protected String referencia;
    protected String sistemaOrigen;
    protected String tipoArchivo;
    protected String usuario;

    /**
     * Gets the value of the acronimoTipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcronimoTipoDocumento() {
        return acronimoTipoDocumento;
    }

    /**
     * Sets the value of the acronimoTipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcronimoTipoDocumento(String value) {
        this.acronimoTipoDocumento = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = value;
    }

    /**
     * Gets the value of the idTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * Sets the value of the idTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTransaccion(Integer value) {
        this.idTransaccion = value;
    }

    /**
     * Gets the value of the listaArchivosEmbebidos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaArchivosEmbebidos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaArchivosEmbebidos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArchivoEmbebidoDTO }
     * 
     * 
     */
    public List<ArchivoEmbebidoDTO> getListaArchivosEmbebidos() {
        if (listaArchivosEmbebidos == null) {
            listaArchivosEmbebidos = new ArrayList<ArchivoEmbebidoDTO>();
        }
        return this.listaArchivosEmbebidos;
    }

    /**
     * Gets the value of the listaUsuariosDestinatarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaUsuariosDestinatarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaUsuariosDestinatarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaUsuariosDestinatarios() {
        if (listaUsuariosDestinatarios == null) {
            listaUsuariosDestinatarios = new ArrayList<String>();
        }
        return this.listaUsuariosDestinatarios;
    }

    /**
     * Gets the value of the listaUsuariosDestinatariosCopia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaUsuariosDestinatariosCopia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaUsuariosDestinatariosCopia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaUsuariosDestinatariosCopia() {
        if (listaUsuariosDestinatariosCopia == null) {
            listaUsuariosDestinatariosCopia = new ArrayList<String>();
        }
        return this.listaUsuariosDestinatariosCopia;
    }

    /**
     * Gets the value of the listaUsuariosDestinatariosCopiaOculta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaUsuariosDestinatariosCopiaOculta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaUsuariosDestinatariosCopiaOculta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaUsuariosDestinatariosCopiaOculta() {
        if (listaUsuariosDestinatariosCopiaOculta == null) {
            listaUsuariosDestinatariosCopiaOculta = new ArrayList<String>();
        }
        return this.listaUsuariosDestinatariosCopiaOculta;
    }

    /**
     * Gets the value of the listaUsuariosDestinatariosExternos property.
     * 
     * @return
     *     possible object is
     *     {@link RequestExternalGenerarDocumento.ListaUsuariosDestinatariosExternos }
     *     
     */
    public RequestExternalGenerarDocumento.ListaUsuariosDestinatariosExternos getListaUsuariosDestinatariosExternos() {
        return listaUsuariosDestinatariosExternos;
    }

    /**
     * Sets the value of the listaUsuariosDestinatariosExternos property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestExternalGenerarDocumento.ListaUsuariosDestinatariosExternos }
     *     
     */
    public void setListaUsuariosDestinatariosExternos(RequestExternalGenerarDocumento.ListaUsuariosDestinatariosExternos value) {
        this.listaUsuariosDestinatariosExternos = value;
    }

    /**
     * Gets the value of the mensajeDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeDestinatario() {
        return mensajeDestinatario;
    }

    /**
     * Sets the value of the mensajeDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeDestinatario(String value) {
        this.mensajeDestinatario = value;
    }

    /**
     * Gets the value of the metaDatos property.
     * 
     * @return
     *     possible object is
     *     {@link RequestExternalGenerarDocumento.MetaDatos }
     *     
     */
    public RequestExternalGenerarDocumento.MetaDatos getMetaDatos() {
        return metaDatos;
    }

    /**
     * Sets the value of the metaDatos property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestExternalGenerarDocumento.MetaDatos }
     *     
     */
    public void setMetaDatos(RequestExternalGenerarDocumento.MetaDatos value) {
        this.metaDatos = value;
    }

    /**
     * Gets the value of the referencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Sets the value of the referencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Gets the value of the sistemaOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaOrigen() {
        return sistemaOrigen;
    }

    /**
     * Sets the value of the sistemaOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaOrigen(String value) {
        this.sistemaOrigen = value;
    }

    /**
     * Gets the value of the tipoArchivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoArchivo() {
        return tipoArchivo;
    }

    /**
     * Sets the value of the tipoArchivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoArchivo(String value) {
        this.tipoArchivo = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class ListaUsuariosDestinatariosExternos {

        protected List<RequestExternalGenerarDocumento.ListaUsuariosDestinatariosExternos.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequestExternalGenerarDocumento.ListaUsuariosDestinatariosExternos.Entry }
         * 
         * 
         */
        public List<RequestExternalGenerarDocumento.ListaUsuariosDestinatariosExternos.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<RequestExternalGenerarDocumento.ListaUsuariosDestinatariosExternos.Entry>();
            }
            return this.entry;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "key",
            "value"
        })
        public static class Entry {

            protected String key;
            protected String value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class MetaDatos {

        protected List<RequestExternalGenerarDocumento.MetaDatos.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequestExternalGenerarDocumento.MetaDatos.Entry }
         * 
         * 
         */
        public List<RequestExternalGenerarDocumento.MetaDatos.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<RequestExternalGenerarDocumento.MetaDatos.Entry>();
            }
            return this.entry;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "key",
            "value"
        })
        public static class Entry {

            protected String key;
            protected String value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }

}
