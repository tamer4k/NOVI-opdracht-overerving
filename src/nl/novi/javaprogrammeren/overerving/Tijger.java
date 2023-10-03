package nl.novi.javaprogrammeren.overerving;

import java.util.Date;

public class Tijger  extends  Animal{
    int aantalStrepen;

    public Tijger(String naam, String hokNaam, String geslacht, String latsteDagGevoed, String herkomst, int aantalStrepen) {
        super(naam, hokNaam, geslacht, latsteDagGevoed, herkomst);
        this.aantalStrepen = aantalStrepen;
    }

    @Override
    public void print() {
        System.out.println(" naam " + naam + " | " + " geslacht " +  geslacht + " | " + " hok " +  hokNaam + " | " + " dg gevoed " + latsteDagGevoed + " | " + " herkomst " + herkomst + " aantalStrepen " + aantalStrepen);
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
