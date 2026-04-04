/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjotteto;

/**
 *
 * @author Gabbo
 */
public class Otteto {

    private int[] valori;

    public Otteto(int[] input) {
        this.valori = new int[8];
        for (int i = 0; i < 8; i++) {
            this.valori[i] = input[i];
        }
    }

    public int decimale() {
        int potenza = valori.length - 1;
        int totale = 0;
        int valoreBit = 0;

        for (int i = 0; i < valori.length; i++) {
            valoreBit = (int) Math.pow(2, potenza);      //elevo a 2 (la base) la potenza corrente
            totale += valori[i] * valoreBit;             //moltiplico per il valore del bit 
            potenza--;

        }
        return totale;
    }

    public Otteto somma(Otteto altro) {
        // 1. Creiamo un array temporaneo per i nuovi bit
        int[] bitSommati = new int[8];
        int riporto = 0;

        // 2. Facciamo la somma colonna per colonna (da destra a sinistra)
        for (int i = 7; i >= 0; i--) {
            int s = this.valori[i] + altro.valori[i] + riporto;  //sommiamo anche il riporto al bit succesivo

            bitSommati[i] = s % 2;
            riporto = s / 2;        // per verificare se c'è riporto
        }

        // 3. CREIAMO e RESTITUIAMO il nuovo oggetto (come richiesto)
        return new Otteto(bitSommati);
    }

    public String stampa() {
        String txt = "";

        for (int i = 0; i < valori.length; i++) {
            txt += valori[i];
        }
        return txt;
    }
}
