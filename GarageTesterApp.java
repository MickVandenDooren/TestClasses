package be.intecbrussel;

public class GarageTesterApp {
    public static void main(String[] args) {

        Auto auto1 = new Auto("BMW Z4", "NV Vandersande");
        System.out.println("Auto:" + auto1.getMerknaam() + " Garage: " + auto1.toString());


    }


}
