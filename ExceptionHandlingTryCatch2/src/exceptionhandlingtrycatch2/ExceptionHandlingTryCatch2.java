/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandlingtrycatch2;

/**
 *
 * @author JW
 */
public class ExceptionHandlingTryCatch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // pernyataan yang berpotensi mengakibatkan Exception
            String[] mhs = new String[3];
            mhs[0] = "ANI";
            mhs[1] = "ARI";
            mhs[2] = "ALI";
            System.out.println(mhs[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            // pernyataan disini akan dieksekusi jika terjadi Exception
            System.out.println("Data Array Yang Dimaksud Tidak Ada");
        }
    }
}
