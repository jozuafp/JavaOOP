/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandlingthrow;

import java.util.Scanner;

/**
 *
 * @author JW
 */
public class ExceptionHandlingThrow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat Instance Scanner Untuk Input Data
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.println("Isi maksimal 12.");
        try {
            System.out.print("Inputkan angka: ");
            angka = input.nextInt(); //Mendapatkan Input Dari User
            if (angka > 12) {
                //Jika angka > 12, maka akan terjadi error
                throw new Exception("Terjadi Kesalahan! Angka > 12 ");
            } else {
                System.out.println("Aman-Aman Saja");
            }
        } catch (Exception e) {
            //Menampilkan Pesan Kesalahan
            e.printStackTrace();
        }
    }

}
