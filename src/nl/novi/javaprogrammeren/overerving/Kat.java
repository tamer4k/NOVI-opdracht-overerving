package nl.novi.javaprogrammeren.overerving;

public class Kat extends Huisdier{
    boolean binnenOfBuitenkat;

    public Kat(String naam, String geslacht, String baasje, String favorieteVoedselmerk, String soort, boolean binnenOfBuitenkat) {
        super(naam, geslacht, baasje, favorieteVoedselmerk, soort);
        this.binnenOfBuitenkat = binnenOfBuitenkat;
    }


    @Override
    public void print() {
        System.out.println(" naam " + naam + " | " + " geslacht " +  geslacht + " | " + " baasje " +  baasje + " | " + " favorieteVoedselmerk " + favorieteVoedselmerk + " | " + " soort " + soort  + " | " + " binnenOfBuitenkat " + binnenOfBuitenkat);

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

    public boolean isBinnenOfBuitenkat() {
        return binnenOfBuitenkat;
    }

    public void setBinnenOfBuitenkat(boolean binnenOfBuitenkat) {
        this.binnenOfBuitenkat = binnenOfBuitenkat;
    }
}
