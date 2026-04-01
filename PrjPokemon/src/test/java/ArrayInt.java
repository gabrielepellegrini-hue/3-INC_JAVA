/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriele.pellegrini
 */
public class ArrayInt {
    private int[] arr;
    private int dimL;

    public ArrayInt(int dimF) {
        arr = new int[dimF];
        dimL = 0;
    }

    public int[] getArr() {
        return arr;
    }

    public boolean addElem(int add) {
        boolean controllo = false;
        if (dimL < arr.length) {
            arr[dimL] = add;
            dimL++;
            controllo = true;

        }
        return controllo;
    }

    public int removeElem() {
        int rimosso = -1;
        if (dimL > 0) {
            rimosso = arr[dimL - 1];   //tolgo uno perchè dimL parte da 0 
            arr[dimL - 1] = -1;
            dimL--;
        }
        return rimosso;
    }

    public int size() {
        return dimL;
    }

    public void clear() {
        int i = 0;
        while (i < arr.length) {
            arr[i] = -1;
            i++;
        }
        dimL = 0;  //resetto dimL cosi quando in futuro voglio inserire nuovi valori riparto dal primo elemento
    }

    public boolean isMax(int magg) {
        boolean risultato = false;
        int max = max();
        if (magg >= max) {
            risultato = true;
        }
        return risultato;
    }

    public int iMax() {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public int max() {
        return arr[iMax()];
    }

    

    public int iMin() {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }
        return min;
    }
    public int min() {
        return arr[iMin()];
    }
    
    public boolean isMin(int minore) {
        boolean risultato = false;
        int min = min();
        if (min >= minore) {
            risultato = true;
        }
        return risultato;
    }

    public double media() {
        int somma = 0;
        double media;
        for (int i = 0; i < dimL; i++) {
            somma += arr[i];
        }
        media = somma / dimL;
        return media;
    }

    public boolean push(int add) {
        boolean check = false;

        if (dimL != arr.length) {
            for (int i = dimL; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = add;
            dimL++;
            check = true;
        }
        return check;
    }

    public String stampa() {
        String txt = "";
        for (int i = 0; i < arr.length; i++) {
            txt += "arr[" + i + "]: " + arr[i] + "\n";
        }
        txt += "dimL: " + dimL;
        return txt;
    }

}
