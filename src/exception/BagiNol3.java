/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author mrmdhni
 */
public class BagiNol3 {
    public static void main(String[] args) {
        System.out.println("Sebelum Pembagian");
        
        try {
            System.out.println(5/0);
        } catch (Throwable t) {
            System.err.println("Terjadi pembagian Nol");
            System.err.println(t.getMessage());
        }
        System.out.println("Sesudah Pembagian");
    }
}
