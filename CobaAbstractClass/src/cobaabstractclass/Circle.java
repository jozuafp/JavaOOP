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
public class Circle extends Shape {

    private /*final*/ float radius;

    public Circle(float radius) {
        this.radius = radius;
    }
    
    @Override
    float getArea() {
        return (float) (Math.PI * radius * radius);
    }
    
}