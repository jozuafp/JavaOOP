/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclasssimple;

/**
 *
 * @author JW
 */
public class AbstractClassSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //object induk tidak bisa di buat disini

        //buat object anak kecil
        AnakKecil ak = new AnakKecil();

        //panggil method anak kecil
        ak.makan();
        ak.minum();
        ak.namaAyahKu();
        System.out.println();
    }
}
