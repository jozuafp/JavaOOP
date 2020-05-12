/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandlingthrows;

/**
 *
 * @author JW
 */
public class ExceptionHandlingThrows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            HandlingClass.HandlingBreak();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
