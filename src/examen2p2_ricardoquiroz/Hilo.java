/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_ricardoquiroz;

import java.util.ArrayList;
import javax.swing.JProgressBar;

/**
 *
 * @author rjqer
 */
public class Hilo extends Thread{
    private JProgressBar barra;
    private Carro carro;

    public Hilo() {
    }

    public Hilo(JProgressBar barra, Carro carro) {
        this.barra = barra;
        this.carro = carro;
    }

    
    
    
    public void run(){
        
    }
    
    
    
}
