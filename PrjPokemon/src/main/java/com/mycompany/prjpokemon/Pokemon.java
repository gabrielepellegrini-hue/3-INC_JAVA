/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjpokemon;

/**
 *
 * @author gabriele.pellegrini
 */
public class Pokemon {

    private String nome;
    private String tipo;
    private int livello;
    private int puntiVita;
    private String codicePokemon;
    private int nMosse;
    private String[] mosse;
    private ArrayInt puntiPartite;
    private int[] danni;

    public Pokemon(String nome, String tipo, int livello, int puntiVita) {
        this.nome = nome;
        this.tipo = tipo;
        this.livello = livello;
        this.puntiVita = puntiVita;
        this.codicePokemon = generaCodice();
        nMosse = 0;
        mosse = new String[4];
        this.puntiPartite = new ArrayInt(100);  //massimo di 100 partite  
        this.danni = new int[mosse.length];

    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getLivello() {
        return livello;
    }

    public int getPuntiVita() {
        return puntiVita;
    }

    private String generaCodice() {
        String txt;
        txt = nome.substring(0, 2);
        txt += tipo.substring(tipo.length() - 2);
        txt = txt.toUpperCase();
        txt += livello;
        return txt;
    }

    public String attacca(Pokemon p) {
        String risultato = "hai perso";
        if (p.livello < this.livello) {
            risultato = "hai vinto";
        } else if (p.livello == livello) {
            risultato = "pareggio";
        }
        return risultato;
    }

    public boolean aggiungiMossa(String mossa, int danno) {
        boolean controllo = false;
        if (nMosse < mosse.length) {
            mosse[nMosse] = mossa;
            danni[nMosse] = danno;
            nMosse++;
            controllo = true;
        }
        return controllo;
    }

    public String stampaMosse() {
        String txt = "";
        for (int i = 0; i < mosse.length; i++) {
            txt += mosse[i] + " " + "danni: " + danni[i] +" ";
        }
        return txt;
    }

    public boolean registraPartita(int punti) {
        return puntiPartite.addElem(punti);
    }

    public String stampaStorico() {
        String txt = "";
        int numeroPartite = puntiPartite.size();
        for (int i = 0; i < puntiPartite.size(); i++) {
            txt += "Partita " + i + ": " + puntiPartite.getArr()[i] + " punti\n";
        }
        return txt;
    }

    public int migliorPunteggio() {
        return puntiPartite.max();
    }

    public double mediaPunti() {
        return puntiPartite.media();
    }

    public boolean haBattutoRecord(int punteggio) {
        return puntiPartite.isMax(punteggio);
    }

    public int partiteVinte() {
        int vinte = 0;
        for (int i = 0; i < puntiPartite.size(); i++) {
            if (puntiPartite.get(i) > 50) {
                vinte++;
            }
        }
        return vinte;
    }
    
    public int potenzaAtacco (int indiceMossa){
        return livello + danni[indiceMossa];
    }

    public String analisiPokemon() {
        String txt;
        txt = "Pokemon: " + nome + "\n";
        txt += "Miglior puteggio: " + migliorPunteggio() + "\n";
        txt += "Media punti: " + mediaPunti() + "\n";
        txt += "PartiteVinte: " + partiteVinte() + "\n";
        return txt;
    }

    public String stampa() {
        String txt;
        txt = "nome: " + nome + "\n";
        txt += "tipo: " + tipo + "\n";
        txt += "livello: " + livello + "\n";
        txt += "puntiVita: " + puntiVita + "\n";
        txt += "codicePokemon: " + codicePokemon + "\n";
        return txt;
    }

}
