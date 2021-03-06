
package net.loquequiera2;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "CantidadDatosNoSoportadaException", targetNamespace = "http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/")
public class CantidadDatosNoSoportadaException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CantidadDatosNoSoportadaException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public CantidadDatosNoSoportadaException_Exception(String message, CantidadDatosNoSoportadaException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public CantidadDatosNoSoportadaException_Exception(String message, CantidadDatosNoSoportadaException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: net.loquequiera2.CantidadDatosNoSoportadaException
     */
    public CantidadDatosNoSoportadaException getFaultInfo() {
        return faultInfo;
    }

}
