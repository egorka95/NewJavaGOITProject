package Modul3;

import java.util.ArrayList;
import java.util.List;


public class Runner {
    public static void main(String[] args) {


        Rose rose = new Rose("Red", Size.BIG);
        Daisy daisy = new Daisy("White",Size.SMALL);
        Astra astra = new Astra("Blue",Size.MEDIUM);
        Tulp tulp = new Tulp("Green",Size.MEDIUM);

        List<Flower>flowers = new ArrayList<>();

        flowers.add(rose);
        flowers.add(daisy);
        flowers.add(astra);
        flowers.add(tulp);

        for (Flower flower : flowers){
            System.out.println(flower);
        }
       List<Flower>bouqet = new ArrayList<>();

        bouqet.add(rose);
        bouqet.add(rose);
        bouqet.add(rose);
        bouqet.add(tulp);
        bouqet.add(astra);


    }
}
