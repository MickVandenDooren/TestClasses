package be.intecbrussel;

public class Garage {

    private String naam;

    public Garage(){
        setNaam();
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam() {
    this.naam = toString();
    }

    public String toString() {
        return String.valueOf(getNaam());
    }

}
