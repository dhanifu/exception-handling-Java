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
public class Exc3 {
    public static void main(String[] args){
        byte[] b = new byte[5];
        System.out.println("Input bilangan bulat: ");
        try {
            System.in.read();
        } catch (Exception e);
            int N = Integer.valueOf(b).intValue();
            System.out.println("Hasil : " + (N+2));
            
            
        // Errornya setelah catch(...) seharusnya {} bukan ;
        // Error kedua yaitu valueOf() tidak bisa diisi parameter tipe byte
    }
}
