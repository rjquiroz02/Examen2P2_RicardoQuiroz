/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_ricardoquiroz;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author rjqer
 */
public class AdminEmpleado implements Serializable{
    private static final long SerialVersionUID = 123L;
    
    private ArrayList<Empleado> listaempleados = new ArrayList();
    private File archivo = null;

    public AdminEmpleado(String path) {
        archivo = new File(path);
    }

    public ArrayList<Empleado> getListaemlpeados() {
        return listaempleados;
    }

    public void setListaPersonas(ArrayList<Empleado> listaempleados) {
        this.listaempleados = listaempleados;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaempleados" + listaempleados;
    }

    
    public void addEmpleado(Empleado p) {
        this.listaempleados.add(p);
    }

    public void cargarArchivo() {
        try {            
            listaempleados = new ArrayList();
            Empleado temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Empleado) objeto.readObject()) != null) {
                        listaempleados.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Empleado t : listaempleados) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
    
    
}
