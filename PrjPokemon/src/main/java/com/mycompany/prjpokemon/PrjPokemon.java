/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.prjpokemon;

/**
 *
 * @author gabriele.pellegrini
 */
public class PrjPokemon {

    public static void main(String[] args) {
     Pokemon p1 = new Pokemon("Pikachu", "Elettro", 12, 200);
        Pokemon p2 = new Pokemon("Charmander", "Fuoco", 10, 200);
        System.out.println(p1.aggiungi("Tuono",20));
        System.out.println(p2.aggiungi("Fulmine",15));
        p1.combatti(p2, 0, 0);
        System.out.println(p1.stampaMosse());
        System.out.println(p1.analisiPokemon());        
        System.out.println(p2.analisiPokemon());
        System.out.println(p1.stampaStorico());
        System.out.println(p2.stampaStorico());
    }
}
