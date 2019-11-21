/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author tss
 */
public class Alunno {

    private String cognome;
    private String nome;
    private int voto;
    private LocalDateTime dataNascita;
    private Esame esameAmmissione;
    private Esame elencoEsami[];

    public void setElencoEsami(Esame[] elencoEsami) {
        this.elencoEsami = elencoEsami;
    }

    public Esame[] getElencoEsami() {
        return elencoEsami;
    }

    String segnoZodiacale;

    public Alunno() {
        cognome = "";
        nome = "";
        voto = 10;
        dataNascita = LocalDateTime.now();
        segnoZodiacale = "pesci";
        int anno = dataNascita.getYear();
        if (anno == 2018) {
            segnoZodiacale = "Drago";
        }
        if (anno == 2019) {
            segnoZodiacale = "Serpente";
        }
        if (anno == 2020) {
            segnoZodiacale = "Topo";
        }
    }

    public Alunno(String newCognome) {
        cognome = newCognome;
        nome = "";
        voto = 10;
        dataNascita = LocalDateTime.now();
        segnoZodiacale = "pesci";
        int anno = dataNascita.getYear();
        if (anno == 2018) {
            segnoZodiacale = "Drago";
        }
        if (anno == 2019) {
            segnoZodiacale = "Serpente";
        }
        if (anno == 2020) {
            segnoZodiacale = "Topo";
        }
    }

    public Alunno(String cognome, String nome, int numeroEsami) {
        this.cognome = cognome;
        this.nome = nome;
        this.elencoEsami = new Esame[numeroEsami];
        this.dataNascita = LocalDateTime.now();
    }

    public void setEsameAmmissione(Esame esameAmmissione) {
        this.esameAmmissione = esameAmmissione;
    }

    public Esame getEsameAmmissione() {
        return esameAmmissione;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public int getVoto() {
        return voto;
    }

    public LocalDateTime getDataNascita() {
        return dataNascita;
    }

    public void aggiungiEsame(Esame esame) {
        elencoEsami[0] = esame;
    }

    public String getLibretto() {
        String libretto = "Libretto Esami; \n";
        for (int i = 0; i < elencoEsami.length; i++) {
            if (elencoEsami[i] == null) {
                break;
            }
            libretto += (i + 1) + ". " + elencoEsami[i].getNomeEsame() + " ";
            libretto += elencoEsami[i].getDataSostenuto().format(DateTimeFormatter.ISO_LOCAL_TIME) + " ";
            libretto += elencoEsami[i].getVoto() + "\n";
        }
        return libretto;
    }
}
