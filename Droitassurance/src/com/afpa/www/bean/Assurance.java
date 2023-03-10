package com.afpa.www.bean;

import java.util.Objects;

public class Assurance {
    private String ancienClient;
    private int age;
    private int permis;
    private int nbAcc;

    public Assurance(String ancienClient, int age, int permis, int nbAcc) {
    }

    public String etude(){

        int cptPointMalus = nbAcc;
        String message = "";

        if (age < 25) {
            cptPointMalus++;
        }
        System.out.println("compteur" + cptPointMalus);

        if (permis < 2) {
            cptPointMalus++;
        }
        System.out.println("compteur" + cptPointMalus);

        if (Objects.equals(ancienClient, "oui")) {
            cptPointMalus -= 1;

        }

        switch (cptPointMalus) {
            case -1:
                message = "Bleu";
                break;
            case 0:
                message = "Vert";
                break;
            case 1:
                message = "Orange";
                break;
            case 2:
                message = "Rouge";
                break;
            default:
                message = "Refus";
        }
        return message;
}




}