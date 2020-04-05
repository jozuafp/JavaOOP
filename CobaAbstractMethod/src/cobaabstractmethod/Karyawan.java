/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaabstractmethod;

/**
 *
 * @author JW
 */
public abstract class Karyawan {

    private String nama;
    private String alamat;
    private int nomor;

    public Karyawan(String nama, String alamat, int nomor) {
        System.out.println("Menambah Data Karyawan");
        this.nama = nama;
        this.alamat = alamat;
        this.nomor = nomor;
    }

    public abstract double computePay();

    public void mailCheck() {
        System.out.println("Mengirim check untuk" + this.nama + " " + this.alamat);
    }

    public String toString() {
        return nama + " " + alamat + " " + nomor;
    }

    public String getName() {
        return nama;
    }

    public String getAdress() {
        return alamat;
    }

    public void getAdress(String alamatBaru) {
        alamat = alamatBaru;
    }

    public int getNumber() {
        return nomor;
    }
}
