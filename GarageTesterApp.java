package be.intecbrussel;

public class GarageTesterApp {
    public static void main(String[] args) {

        Auto auto1 = new Auto("BMW Z4", "N.V. Vandersanden");
        Auto.toString(auto1);
        Auto auto2 = new Auto(auto1);
        Auto.toString(auto2);
        Auto auto3 = new Auto("Mercedes CLA");
        Auto.toString(auto3);

    }


}
