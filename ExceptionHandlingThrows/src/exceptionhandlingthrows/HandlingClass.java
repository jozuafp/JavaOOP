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
public class HandlingClass {

    static void HandlingBreak() throws ClassNotFoundException {
        System.out.println("Terjadi kesalahan!");
        throw new ClassNotFoundException("Ini pesan kesalahannya.");
    }
}
