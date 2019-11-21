/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez04;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class mainStart {

    public static void main(String[] args) {
        Alunno a1 = new Alunno("Rossi", "Mario", 100);
        Esame es1 = new Esame("Database", "Verdi");
        a1.aggiungiEsame(es1);
        JOptionPane.showMessageDialog(null, a1.getLibretto());
    }

}
