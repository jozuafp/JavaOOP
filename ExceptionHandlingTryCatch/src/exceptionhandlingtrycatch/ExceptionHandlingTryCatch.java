/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandlingtrycatch;

/**
 *
 * @author JW
 */
public class ExceptionHandlingTryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // pernyataan yang berpotensi mengakibatkan Exception
            int angka = 12;
            int hasil = angka / 0;
            System.out.println(hasil);
        } catch (ArithmeticException ex) {
            // pernyataan disini akan di eksekusi jika terjadi Exception
            System.out.println("Tidak Boleh Menggunakan Pembagian dengan 0 (nol)");
        }
    }

}
