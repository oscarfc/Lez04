/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez04;

import java.time.LocalDateTime;

/**
 *
 * @author tss
 */
public class Alunno {

    private String cognome;
    private String nome;
    private int voto;
    private LocalDateTime dataNascita;
    String segnoZodiacale;

    public Alunno() {
        cognome = "";
        nome = "";
        voto = 10;
        dataNascita = LocalDateTime.now();
        segnoZodiacale = "pesci";
        int anno = dataNascita.getYear();
        if(anno == 2018) segnoZodiacale = "Drago";
        if(anno == 2019) segnoZodiacale = "Serpente";
        if(anno == 2020) segnoZodiacale = "Topo";
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
    
    public Alunno(String newCognome) {
        cognome = newCognome;
        nome = "";
        voto = 10;
        dataNascita = LocalDateTime.now();
        segnoZodiacale = "pesci";
        int anno = dataNascita.getYear();
        if(anno == 2018) segnoZodiacale = "Drago";
        if(anno == 2019) segnoZodiacale = "Serpente";
        if(anno == 2020) segnoZodiacale = "Topo";
    }

    public Alunno(String cognome, String nome, int voto) {
        this.cognome = cognome;
        this.nome = nome;
        this.voto = voto;
        this.dataNascita= LocalDateTime.now();
    }
    

}
