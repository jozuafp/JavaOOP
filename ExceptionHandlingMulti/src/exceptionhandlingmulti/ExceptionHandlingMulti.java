/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandlingmulti;

/**
 *
 * @author JW
 */
public class ExceptionHandlingMulti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String[] mhs = new String[3];
            mhs[0] = "ANI";
            mhs[1] = "ARI";
            mhs[2] = "ALI";
            System.out.println(mhs[3]);
            //====================================
            int angka = 12;
            int hasil = angka / 0;
            System.out.println(hasil);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Data Array Yang Dimaksud Tidak Ada");
        } catch (ArithmeticException ex2) {
            System.out.println("Tidak Boleh Menggunakan Pembagian dengan 0 (nol)");
        }
    }

}
