package com.afpa.www.bean;

public class Moneyrest {
    private int total;
    private int reglement;

    public Moneyrest(int total, int reglement) {
        this.total = total;
        this.reglement = reglement;
    }

    String resultat = "";

    public String traitement() {
        int nbrBillet10 = 0;
        int nbrBillet5 = 0;
        int nbrPiece = 0;

        int reste = reglement - total;


        while (reste >= 10) {
            nbrBillet10++;
            reste = reste - 10;
        }

        if (reste >= 5) {
            nbrBillet5++;
            reste = reste - 5;
        }

        nbrPiece = reste;
        resultat=" Le reste : " + nbrBillet10 + " billet10 " +
                nbrBillet5 + " billet5 " + nbrPiece + " piece1";
        return resultat;

    }
}
