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
public class Ex3 {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("nilai a = " +a);
            int b = 40/a;
            int c = {1};
            c[10] = 88;
        } catch (ArithmeticException e) {
            System.out.println("Pembagian dengan NOL!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Array OOB : " +e);
        } catch(Throwable t) {
            System.out.println("got t " +t);
        }
    }
}
