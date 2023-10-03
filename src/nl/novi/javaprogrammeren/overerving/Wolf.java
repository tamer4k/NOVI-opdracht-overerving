package nl.novi.javaprogrammeren.overerving;

import java.util.Date;

public class Wolf extends Animal {
    String roedel;

    public Wolf(String naam, String hokNaam, String geslacht, String latsteDagGevoed, String herkomst, String roedel) {
        super(naam, hokNaam, geslacht, latsteDagGevoed, herkomst);
        this.roedel = roedel;
    }

    @Override
    public void print() {
        System.out.println(" naam " + naam + " | " + " geslacht " +  geslacht + " | " + " hok " +  hokNaam + " | " + " dg gevoed " + latsteDagGevoed + " | " + " herkomst " + herkomst + " roedel " + roedel);
    }
    @Override
    public void bewegen() {
    }

    @Override
    public void geluid() {
        super.geluid();
    }

    @Override
    public void slapen() {
        super.slapen();
    }

    @Override
    public void eten() {
        super.eten();
    }
}
