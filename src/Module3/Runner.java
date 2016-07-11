package module3;

import java.util.ArrayList;
import java.util.List;


public class Runner {
    public static void main(String[] args) {


        Rose rose = new Rose("Red", Size.BIG, 17.3);
        Daisy daisy = new Daisy("White", Size.SMALL, 20.5);
        Astra astra = new Astra("Blue", Size.MEDIUM, 24.4);
        Tulp tulp = new Tulp("Green", Size.MEDIUM, 79.99);

        List<Flower> flowers = new ArrayList<>();

        flowers.add(rose);
        flowers.add(daisy);
        flowers.add(astra);
        flowers.add(tulp);

        double sum = 0;

        for (Flower flower : flowers) {

            sum += flower.getPrice();

        }

        System.out.println(sum);

        Bouqet bouqetOfFlowers = new Bouqet();

        bouqetOfFlowers.add(new Rose("Red", Size.BIG, 100.99));
        bouqetOfFlowers.add(new Rose("Red", Size.BIG, 100.99));
        bouqetOfFlowers.add(new Rose("Red", Size.BIG, 100.99));
        bouqetOfFlowers.add(new Rose("Red", Size.MEDIUM, 80.99));

        System.out.println(bouqetOfFlowers);

        System.out.println(bouqetOfFlowers.getTotalPrice());

    }
}
