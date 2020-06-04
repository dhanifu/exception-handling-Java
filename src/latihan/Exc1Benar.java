/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author mrmdhni
 */
public class Exc1Benar {
    public static void main(String[] args) {
        try {
            System.out.print("Input kata    : ");
            char w = (char) System.in.read();
            System.out.println("Huruf pertama : " +w);
            
            // JIKA DIRUN
            // Input kata!   : Eaaaaa
            // Huruf pertama : E
            
        } catch (Exception e) {
            System.out.println("Error : "+e.getMessage());
        }
    }
}
