package nl.novi.javaprogrammeren.overerving;

public class Hond extends Huisdier {

    public Hond(String naam, String geslacht, String baasje, String favorieteVoedselmerk, String soort) {
        super(naam, geslacht, baasje, favorieteVoedselmerk, soort);
    }
    @Override
    public void print() {
        System.out.println(" naam " + naam + " | " + " geslacht " +  geslacht + " | " + " baasje " +  baasje + " | " + " favorieteVoedselmerk " + favorieteVoedselmerk + " | " + " soort " + soort );
    }
    @Override
    public void bewegen() {
        System.out.println("0.25 meter is verplaatst");
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
