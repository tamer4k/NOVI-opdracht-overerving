package nl.novi.javaprogrammeren.overerving;

public class Huisdier extends Animal{
    String baasje;
    String  favorieteVoedselmerk;
    String soort;

    public Huisdier(String naam, String geslacht, String baasje, String favorieteVoedselmerk, String soort) {
        super(naam, geslacht);
        this.baasje = baasje;
        this.favorieteVoedselmerk = favorieteVoedselmerk;
        this.soort = soort;
    }


    @Override
    public void bewegen() {

    }

    @Override
    public void print() {

    }


    public String getBaasje() {
        return baasje;
    }

    public void setBaasje(String baasje) {
        this.baasje = baasje;
    }

    public String getFavorieteVoedselmerk() {
        return favorieteVoedselmerk;
    }

    public void setFavorieteVoedselmerk(String favorieteVoedselmerk) {
        this.favorieteVoedselmerk = favorieteVoedselmerk;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }
}
