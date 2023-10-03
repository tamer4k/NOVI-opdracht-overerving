package nl.novi.javaprogrammeren.overerving;

import java.util.Date;

public abstract class Animal {

    String naam;
    String hokNaam;

    String geslacht;

    String latsteDagGevoed;
    String herkomst;

    public  Animal(String naam, String hokNaam, String geslacht, String latsteDagGevoed, String herkomst) {
        this.naam = naam;
        this.hokNaam = hokNaam;
        this.geslacht = geslacht;
        this.latsteDagGevoed = latsteDagGevoed;
        this.herkomst = herkomst;
    }

    public Animal(String naam, String geslacht) {
        this.naam = naam;
        this.geslacht = geslacht;
    }


    public abstract void bewegen();
    public  void geluid(){
        System.out.println("geluid");
    }
    public  void slapen(){
        System.out.println("8 uren slapen");
    }
    public  void eten(){
        System.out.println("aan het eten");
    }

   public abstract void print();

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getHokNaam() {
        return hokNaam;
    }

    public void setHokNaam(String hokNaam) {
        this.hokNaam = hokNaam;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }

    public String getLatsteDagGevoed() {
        return latsteDagGevoed;
    }

    public void setLatsteDagGevoed(String latsteDagGevoed) {
        this.latsteDagGevoed = latsteDagGevoed;
    }

    public String getHerkomst() {
        return herkomst;
    }

    public void setHerkomst(String herkomst) {
        this.herkomst = herkomst;
    }
}
