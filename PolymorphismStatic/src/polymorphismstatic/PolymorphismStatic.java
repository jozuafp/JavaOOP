/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismstatic;

/**
 *
 * @author JW
 */
public class PolymorphismStatic {

    public static void main(String[] args) {
        PolyStatic demo = new PolyStatic();
        System.out.println(demo.add(1, 2));      //method 1 called
        System.out.println(demo.add(3, 4, 5));    //method 2 called
        System.out.println(demo.add(6, 7.8));    //method 4 called
        System.out.println(demo.add(9.1, 2));    //method 3 called
    }
}
