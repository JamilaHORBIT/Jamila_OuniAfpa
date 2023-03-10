package com.afpa.www.main;

import com.afpa.www.bean.Moneyrest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0;
        int reglement = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Quel est la somme à payer : ");
        total = sc.nextInt();
        System.out.println("Le reglement du client : ");
        reglement = sc.nextInt();
        Moneyrest mon =new Moneyrest(total,reglement);




        System.out.println(mon.traitement());
    }
}