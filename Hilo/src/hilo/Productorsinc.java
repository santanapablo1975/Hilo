/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo;

import static java.lang.Thread.sleep;

/**
 *
 * @author Pc12
 */
public class Productorsinc extends Thread {
  private BufferSinc buffer;
  private final String letras="abcdefghijklmnopqrstuvxyz";
  public Productorsinc(BufferSinc buffer) {
    this.buffer=buffer;
  }
    public void run() {
        for(int i=0; i<10; i++){
            char c=letras.charAt((int)(Math.random()*letras.length()));
            buffer.poner(c);
            System.out.println(i+" Productor: " +c);
            try {
                sleep(100);
            } catch (InterruptedException e) { }
        }
    }
}
