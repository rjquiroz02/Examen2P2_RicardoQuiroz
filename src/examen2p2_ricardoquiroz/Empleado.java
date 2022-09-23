/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_ricardoquiroz;

import java.io.Serializable;

/**
 *
 * @author rjqer
 */
public class Empleado implements Serializable{
    private static final long SerialVersionUID = 528L;
    
    private String nombre;
    private int edad;
    private String id;
    private int creparados;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, String id, int creparados) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.creparados = creparados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCreparados() {
        return creparados;
    }

    public void setCreparados(int creparados) {
        this.creparados = creparados;
    }

    @Override
    public String toString() {
        return nombre + ", id=" + id;
    }
    
    
    
    
}
