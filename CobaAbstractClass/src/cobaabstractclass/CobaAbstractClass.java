/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaabstractclass;

/**
 *
 * @author JW
 */
public class CobaAbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape segitiga = new Triangle(12, 5);
        Shape lingkaran = new Circle(12);
        
        System.out.println("Luas Segitiga: " + segitiga.getArea());
        System.out.println("Luas Lingkaran: " + lingkaran.getArea());
    }
    
}
