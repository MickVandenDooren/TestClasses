package be.intecbrussel;

public class Auto {

    private String merknaam;
    private Garage garage;

    public Auto(String merknaam, Garage garage){
        this.merknaam=merknaam;
        this.garage = garage;
    }

    public String getMerknaam() {
        return merknaam;
    }


    public String toString() {
        return "Auto:" + getMerknaam() + " Garage: " + garage.getNaam();
    }
}
