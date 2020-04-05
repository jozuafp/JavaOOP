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
class AnakKecil extends Ayah {

    public void namaAyahKu() {
        System.out.println("Nama Ayahku adalah " + namaAyah);
    }

    //@Override
    public void makan() {
        System.out.println("Anak kecil makan bubur");
    }

    //@Override
    public void minum() {
        System.out.println("Anak kecil minum susu");
    }
}
