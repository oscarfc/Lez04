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
public class Esame {

    private String nomeEsame;
    private String nomeDocente;
    private int voto;
    private LocalDateTime dataSostenuto;

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public void setDataSostenuto(LocalDateTime dataSostenuto) {
        this.dataSostenuto = dataSostenuto;
    }

    public String getNomeEsame() {
        return nomeEsame;
    }

    public String getNomeDocente() {
        return nomeDocente;
    }

    public int getVoto() {
        return voto;
    }

    public LocalDateTime getDataSostenuto() {
        return dataSostenuto;
    }

    public Esame(String nomeEsame, String nomeDocente) {
        this.nomeEsame = nomeEsame;
        this.nomeDocente = nomeDocente;
        this.dataSostenuto = LocalDateTime.now();
    }

}
