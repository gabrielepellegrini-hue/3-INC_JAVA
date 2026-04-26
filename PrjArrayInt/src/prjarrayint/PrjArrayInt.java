/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjarrayint;

/**
 *
 * @author Gabbo
 */
public class PrjArrayInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayInt test1 = new ArrayInt(5);
        System.out.println(test1.addElem(1));
        System.out.println(test1.addElem(3));
        System.out.println(test1.addElem(5));
        test1.addElemOrdinato(4);
        System.out.println(test1.stampa());

    }
    
}
