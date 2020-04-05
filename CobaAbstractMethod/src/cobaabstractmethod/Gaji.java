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
public class Gaji extends Karyawan {

    private double gaji; 

    public Gaji(String nama, String alamat, int nomor, double gaji) {
        super(nama, alamat, nomor);
        setSalary(gaji);
    }

    public double computePay() {
        System.out.println("Menghitung pembayaran gaji untuk " + getName());
        return gaji / 52;
    }

    public void mailCheck() {
        System.out.println("-method mailCheck (class Gaji)");
        System.out.println("-Mengirim check untuk " + getName() + " dengan gaji " + gaji);
    }

    public double getSalary() {
        return gaji;
    }

    public void setSalary(double gajiBaru) {
        if (gajiBaru >= 0.0) {
            gaji = gajiBaru;
        }
    }

}
