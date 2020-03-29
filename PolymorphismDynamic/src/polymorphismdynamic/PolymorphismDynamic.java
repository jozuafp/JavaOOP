/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismdynamic;

/**
 *
 * @author JW
 */
public class PolymorphismDynamic {

    public static void main(String[] args) {
        Vehicle vh = new MotorBike();
        vh.move();    // prints MotorBike can move and accelerate too!
        vh = new Vehicle();
        vh.move();    // prints Vehicles can move!
    }
}
