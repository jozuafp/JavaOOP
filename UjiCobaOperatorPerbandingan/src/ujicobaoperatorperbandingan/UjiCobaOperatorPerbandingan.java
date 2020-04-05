/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujicobaoperatorperbandingan;

/**
 *
 * @author JW
 */
public class UjiCobaOperatorPerbandingan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi variabel
        int a = 12;
        int b = 5;
        int c = 1;
        int d = 2;

        boolean uc1 = a > b;
        boolean uc2 = b < c;
        boolean uc3 = (a * 2) >= (b + c);
        boolean uc4 = (a / d) <= (c - a);
        boolean uc5 = (a - d) == d;
        boolean uc6 = (a - b) != (b - d);
        boolean uc7 = a > 12;
        boolean uc8 = b <= 7;
        boolean uc9 = c == 10;
        boolean uc10 = d != 5;

        System.out.println("Tes ke 1 = " + uc1);
        System.out.println("Tes ke 2 = " + uc2);
        System.out.println("Tes ke 3 = " + uc3);
        System.out.println("Tes ke 4 = " + uc4);
        System.out.println("Tes ke 5 = " + uc5);
        System.out.println("Tes ke 6 = " + uc6);
        System.out.println("Tes ke 7 = " + uc7);
        System.out.println("Tes ke 8 = " + uc8);
        System.out.println("Tes ke 9 = " + uc9);
        System.out.println("Tes ke 10 = " + uc10);
    }

}
