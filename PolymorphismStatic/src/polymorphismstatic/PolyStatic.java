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
public class PolyStatic {

    public int add(int x, int y) {  //method 1
        return x + y;
    }

    public int add(int x, int y, int z) { //method 2
        return x + y + z;
    }

    public int add(double x, int y) { //method 3
        return (int) x + y;
    }

    public int add(int x, double y) { //method 4
        return x + (int) y;
    }

}
