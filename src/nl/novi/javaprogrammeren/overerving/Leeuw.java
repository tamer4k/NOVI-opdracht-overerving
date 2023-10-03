package nl.novi.javaprogrammeren.overerving;

import java.util.Date;

public class Leeuw extends Animal {
    int aantalkinderen;

    public Leeuw(String naam, String hokNaam, String geslacht, String latsteDagGevoed, String herkomst, int aantalkinderen) {
        super(naam, hokNaam, geslacht, latsteDagGevoed, herkomst);
        this.aantalkinderen = aantalkinderen;
    }

    @Override
    public void print() {
        System.out.println(" naam " + getNaam() + " | " + " geslacht " +  geslacht + " | " + " hok " +  getHokNaam() + " | " + " dg gevoed " + getLatsteDagGevoed() + " | " + " herkomst " + getHerkomst() + " aantknderen " + getAantalkinderen());
    }

    @Override
    public void bewegen() {
    }

    public void geluid() {
        System.out.println("fff");
    }

    @Override
    public void slapen() {
        super.slapen();
    }

    @Override
    public void eten() {
        super.eten();
    }

    public int getAantalkinderen() {
        return aantalkinderen;
    }

    public void setAantalkinderen(int aantalkinderen) {
        this.aantalkinderen = aantalkinderen;
    }
}
