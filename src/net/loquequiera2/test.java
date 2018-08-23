/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.loquequiera2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.LinkedList;
import net.loquequiera2.RequestExternalGenerarDocumento.ListaUsuariosDestinatariosExternos.Entry;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author js298678
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            IExternalGenerarDocumentoService servidor;
            servidor = conexion();
            RequestExternalGenerarDocumento request = new RequestExternalGenerarDocumento();
            setParams(request);
            ResponseExternalGenerarDocumento a = servidor.generarDocumentoGEDO(request);
            System.out.println(a.getLicencia());
            System.out.println(a.getNumero());
            System.out.println(a.getNumeroEspecial());
            System.out.println(a.getUrlArchivoGenerado());
            //setParams(request);
            //System.out.println(servidor.generarExpedienteElectronicoCaratulacion(request));

        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();

        }
    }

    public static void setParams(RequestExternalGenerarDocumento request) {
        
        Entry entry = new Entry();
        LinkedList<String> lista =new LinkedList<String>();
      //  lista.add("AGORE");
       // lista.add("JSTACCO");
       request.getListaUsuariosDestinatarios().add("AGORE");
      // request.getListaUsuariosDestinatarios().add("JSTACCO");
       request.getListaUsuariosDestinatariosCopia().add("JSTACCO");
       
     //  request.get
       //request.get
        //RequestExternalGenerarDocumento.ListaUsuariosDestinatariosExternos  l = new RequestExternalGenerarDocumento.ListaUsuariosDestinatariosExternos();
       // request.listaUsuariosDestinatarios = lista;
        request.setAcronimoTipoDocumento("MEMO");
        //request.l
        request.setData(obtenerArchivo("C:\\Users\\usuario2\\Documents\\NetBeansProjects\\GenerarDocumento\\src\\net\\loquequiera2\\pascal.txt"));
        request.setReferencia("motivo1");
        request.setSistemaOrigen("RCE");
        request.setTipoArchivo("txt");
        request.setUsuario("JSTACCO");
      //  request.


    }

    public static byte[] obtenerArchivo(String path) {
        Base64 base = new Base64();
       
        File file = new File(path);
        byte[] fileArray = new byte[(int) file.length()];
        InputStream inputStream;
        try {
            inputStream = new FileInputStream(file);
            inputStream.read(fileArray);
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar Error
        }
        return fileArray;
                //base.encode(fileArray);
    
    }

    public static IExternalGenerarDocumentoService conexion() throws MalformedURLException {

        IExternalGenerarDocumentoService_Service test = new IExternalGenerarDocumentoService_Service();
        return test.getIExternalGenerarDocumentoServicePort();
    }

}
