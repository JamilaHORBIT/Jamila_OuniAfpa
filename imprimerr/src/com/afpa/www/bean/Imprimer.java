package com.afpa.www.bean;

public class Imprimer {
    private int nbrePhotocopies;

    public Imprimer(int nbrePhotocopies) {
        this.nbrePhotocopies = nbrePhotocopies;
    }

    public int getNbrePhotocopies() {
        return nbrePhotocopies;
    }

    public void setNbrePhotocopies(int nbrePhotocopies) {
        this.nbrePhotocopies = nbrePhotocopies;
    }

    public String traitement() {
        String message = "";

        int nbrPhotocopie = this.nbrePhotocopies;
        if (nbrPhotocopie <= 10) {
            message = nbrPhotocopie * 0.10f + "";
        } else if (nbrPhotocopie <= 30) {
            message = (nbrPhotocopie - 10) * 0.09f + 1f + "";
        } else {
            message = (nbrPhotocopie - 30) * 0.08f + 2.8f + "";
        }
        return message;
    }

}
