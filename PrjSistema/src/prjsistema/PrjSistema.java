/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjsistema;

/**
 *
 * @author Gabbo
 */
public class PrjSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {0,0,1,0};
        Sistema test1 = new Sistema(arr );
        System.out.println(test1.accendi());
        System.out.println(test1.stampa());
    }
    
}
