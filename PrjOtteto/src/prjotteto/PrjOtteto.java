/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjotteto;

/**
 *
 * @author Gabbo
 */

public class PrjOtteto {

    public static void main(String[] args) {
        // Creazione di due numeri binari
        int[] arr1 = {0, 0, 0, 0, 1, 0, 1, 0}; 
        int[] arr2 = {0, 0, 0, 0, 0, 1, 1, 1}; 
        Otteto test1 = new Otteto(arr1);
        Otteto test2 = new Otteto(arr2);

        // Test Decimale
        System.out.println( test1.decimale());
        System.out.println(test2.decimale());

        // Test Somma
        Otteto somma = test1.somma(test2); // 10 + 7
        System.out.println(somma.stampa());
        System.out.println(somma.decimale());   //controllo che sia 17
       
    }
}

