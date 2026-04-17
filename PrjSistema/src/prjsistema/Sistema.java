/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjsistema;

/**
 *
 * @author Gabbo
 */
public class Sistema {

    private int[] valori;
    private int dimF;

    public Sistema(int[] input) {
        this.dimF = input.length;
        this.valori = new int[dimF];
        for (int i = 0; i < dimF; i++) {
            this.valori[i] = input[i];
        }
    }

    public int accendi() {
        int posizione = -1;
        int i = 0;
        while (i < dimF && posizione == -1) {
            if (valori[i] == 1) {
                posizione = i;
            }
            i++;
        }
        return posizione;
    }

    public String stampa() {
        String txt = "";
        for (int i = 0; i < dimF; i++) {
            txt += "arr[" + i + "]: " + valori[i] + "\n";
        }
        return txt;
    }
}
