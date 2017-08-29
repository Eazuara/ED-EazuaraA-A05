/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.eazuaraa.a03;

import java.util.Scanner;

/**
 *
 * @author eazuara
 */
public class EDEazuaraAA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Binario teclado= new Binario();
       teclado.setVector(teclado.RandomV(3));
       teclado.MergeSort();
        System.out.println(teclado.showVector());
        
   }
    
}
