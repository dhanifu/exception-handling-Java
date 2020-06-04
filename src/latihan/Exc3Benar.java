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
public class Exc3Benar {
    public static void main(String[] args){
        byte[] b = new byte[5];
        char[] c = new char[5];
        System.out.print("Input angka : ");
        
        try {
            System.in.read(b);
            
            for (int i = 0; i < b.length; i++) {
                if (Integer.valueOf(b[i]) >= 48 && Integer.valueOf(b[i]) <= 57 ) {
                    c[i] = (char) b[i];
                }
            }
            
            String stringC = new String(c).trim();
            System.out.println("Hasil : " + (Integer.valueOf(stringC) + 2));
            
        } catch (NumberFormatException e) {
            // jika bukan input angka maka akan tampil
            System.out.println("Hasil: Hanya bisa input angka");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        
        
        // RUN
        // Input angka : 25
        // Hasil : 27
        
        // Input angka : Bebas
        // Hasil : Hanya bisa input angka
    }
}
