package com.afpa.www.main;

import com.afpa.www.bean.Assurance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Etes-vous un client depuis plus d'un an : oui/non ");
        String ancienClient = sc.nextLine();
        System.out.println("Saisissez votre age : ");
        int age = sc.nextInt();
        System.out.println("Depuis combien d'annee avez-vous votre permis : ");
        int permis = sc.nextInt();
        System.out.println("Combien d'accident avez-vous eu : ");
        int nbAcc = sc.nextInt();
        Assurance Assur =new Assurance(ancienClient,age,permis,nbAcc);
        int cptPointMalus=0;
        System.out.println("compteur" + cptPointMalus);
        System.out.println(Assur.etude());
    }
}