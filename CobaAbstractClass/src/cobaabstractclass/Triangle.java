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
public class Triangle extends Shape {

    private /*final*/ float base;
    private /*final*/ float height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    float getArea() {
        return 0.5f * base * height;
    }

}
