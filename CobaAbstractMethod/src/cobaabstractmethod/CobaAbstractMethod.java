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
        Gaji g = new Gaji("Alim", "Malang", 1, 3600.00);
        Karyawan k = new Gaji("Budi", "Lawang", 2, 2400.00);
        System.out.println("");
        System.out.println("mailCheck dari class Gaji: ");
        g.mailCheck();
        System.out.println("");
        System.out.println("mailCheck dari class Karyawan:" );
        k.mailCheck();
        
    }

}
