package com.afpa.www.main;

import com.afpa.www.bean.Imprimer;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nbr = 0;
        System.out.println("renseigner le nombre de photocopie :");
        nbr = sc.nextInt();
        Imprimer imp = new Imprimer(nbr);
        System.out.println(imp.traitement());
    }
}