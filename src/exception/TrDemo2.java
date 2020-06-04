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
public class TrDemo2 {
    static void methodKu() throws IllegalAccessException {
        System.out.println("Ini Isi methodKu broh");
        throw new IllegalAccessException("Nyoba");
    }
    
    public static void main(String[] args) {
        try {
            methodKu();
        } catch (IllegalAccessException e) {
            System.out.println("TERTANGKAP: " +e);
        }
    }
}
