/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez04;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Corso {

    private ArrayList<Alunno> registroAlunni;
    private String titoloCorso;
    private LocalDateTime dataStart;
    private int oreDurata;
    private String edizione;

    public Corso(String titoloCorso) {
        this.titoloCorso = titoloCorso;
        registroAlunni = new ArrayList<Alunno>();
        this.dataStart = LocalDateTime.now();
        oreDurata = 0;
        edizione = "---";
    }

    public Corso(String titoloCorso, LocalDateTime dataStart, int oreDurata, String edizione) {
        this.titoloCorso = titoloCorso;
        this.dataStart = dataStart;
        this.oreDurata = oreDurata;
        this.edizione = edizione;
        registroAlunni = new ArrayList<Alunno>();
    }

    public ArrayList<Alunno> getRegistroAlunni() {
        return registroAlunni;
    }

    public String getTitoloCorso() {
        return titoloCorso;
    }

    public LocalDateTime getDataStart() {
        return dataStart;
    }

    public int getOreDurata() {
        return oreDurata;
    }

    public String getEdizione() {
        return edizione;
    }

    public void setRegistroAlunni(ArrayList<Alunno> registroAlunni) {
        this.registroAlunni = registroAlunni;
    }

    public void setTitoloCorso(String titoloCorso) {
        this.titoloCorso = titoloCorso;
    }

    public void setDataStart(LocalDateTime dataStart) {
        this.dataStart = dataStart;
    }

    public void setOreDurata(int oreDurata) {
        this.oreDurata = oreDurata;
    }

    public void setEdizione(String edizione) {
        this.edizione = edizione;
    }

    public String getCorso() {
        String ris = "";
        ris += getTitoloCorso() + fillString(getTitoloCorso()) + getEdizione() + fillString(getEdizione()) + getOreDurata() + " " + 
                getDataStart().getDayOfMonth() + " " + getDataStart().getMonth() + " " + getDataStart().getYear() + "\n";
        return ris;
    }
    
    private String fillString(String str) {
        return "              ".substring(str.length() > 13 ? 13 : str.length());
    }
}
