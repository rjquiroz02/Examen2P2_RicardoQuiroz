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
public class Carro implements Serializable{
    private static final long SerialVersionUID = 695L;
    
    String marca, modelo;
    int anofab;
    String estado;
    int costorep;

    public Carro() {
    }

    public Carro(String marca, String modelo, int anofab, String estado, int costorep) {
        this.marca = marca;
        this.modelo = modelo;
        this.anofab = anofab;
        this.estado = estado;
        this.costorep = costorep;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnofab() {
        return anofab;
    }

    public void setAnofab(int anofab) {
        this.anofab = anofab;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCostorep() {
        return costorep;
    }

    public void setCostorep(int costorep) {
        this.costorep = costorep;
    }

    @Override
    public String toString() {
        return marca + ", " + modelo + ", " + estado + ", CRep=" + costorep;
    }
    
    
    
}
