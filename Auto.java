package be.intecbrussel;

public class Auto {

    private String merknaam;
    private Garage garage;

    public Auto(String merknaam, String garage){
        this.merknaam=merknaam;
        this.garage= setGarage();
    }

    public String getMerknaam() {
        return merknaam;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public String toString() {
        return "Auto:" + merknaam + " Garage: " + garage;
    }
}
