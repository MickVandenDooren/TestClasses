package be.intecbrussel;
import java.util.*;

public class Gokken {

    int GebruikersGokken[5];
    int Counter=0;
    int Randoms[5];


    public int GetRandom(){
        Random rn = new Random();
        int random = rn.nextInt(10) + 1;
        return random;
    }

    public VraagCijfer(){
        Scanner scan = new Scanner(System.in);
        int input;
        for (int i=0;i<5;i++){
            System.out.println("Gok"+i+1+":");
            input = scan.nextInt();

            while (input < 0 || input > 11){
                System.out.println("Enter valid number (1-10)");
                input = scan.nextInt();
            }

            GebruikersGokken[i]=input;
        }
    }

    public SaveRandoms(){
        for (int i=0;i<5;i++){
            Randoms[i]=GetRandom();
        }
    }


}

