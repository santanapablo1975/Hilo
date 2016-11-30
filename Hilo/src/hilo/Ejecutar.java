/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pc12
 */
public class Ejecutar extends Thread{

    @Override
    public void run() {
        //super.run(); //To change body of generated methods, choose Tools | Templates.
        
        for (int i = 10; i >0; i--) {
            System.out.println(i);
            try {
                //imprimir cada segundo
                sleep(1000);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejecutar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    
    
    
}
