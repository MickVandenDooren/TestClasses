package be.intecbrussel;

public class Garage {

    private string naam;

    public static garage(String naam){
        this.naam = getNaam();
    }

    public string getNaam() {
        return naam;
    }

    public void setNaam(string naam) {
        this.naam = naam;
    }

    public String toString() {
        return "Garage: " + naam;
    }

}
