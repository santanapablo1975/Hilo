/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo;

/**
 *
 * @author Pc12
 */
public class Hilo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //new Ejecutar().start();
        
        /*
        Buffer b = new Buffer();
        Consumidor c=new Consumidor(b);
        Productor p = new Productor (b);
        
        p.start();
        c.start();
        */
        
        
        BufferSinc b = new BufferSinc();
        ConsumidorSinc c=new ConsumidorSinc(b);
        Productorsinc p = new Productorsinc(b);
        
        p.start();
        c.start();
        
        
        
        
    }
    
}