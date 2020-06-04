/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.io.IOException;

/**
 *
 * @author mrmdhni
 */
public class Exc2Benar {
    public static void main(String[] args){
        byte[] b = new byte[5];
        
        try {
            System.out.print("Input kata : ");
            System.in.read(b);
            System.out.println("Hasil      : " + (char) b[0] + (char) b[1] + (char) b[2]);
            
            // JIKA DIRUN
            // Input kata : Bebas
            // Hasil      : Beb
            
        } catch (java.io.IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
