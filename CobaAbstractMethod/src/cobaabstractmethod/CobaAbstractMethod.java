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
public class CobaAbstractMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gaji g = new Gaji("Alim", "Malang", 1, 72000000.00);
        Karyawan k = new Gaji("Budi", "Lawang", 2, 48000000.00);
        System.out.println("");
        System.out.println("object dari class Gaji: ");
        g.mailCheck();
        System.out.println(g.computePay());
        System.out.println("");
        System.out.println("object dari class Karyawan:" );
        k.mailCheck();     
        System.out.println(k.computePay());
    }
}
