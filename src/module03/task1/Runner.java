package module03.task1;

import java.util.ArrayList;
import java.util.List;


public class Runner {
    public static void main(String[] args) {


        Rose rose = new Rose(Flower.Color.RED, Flower.Size.BIG, 17.3);
        Daisy daisy = new Daisy(Flower.Color.WHITE, Flower.Size.SMALL, 20.5);
        Astra astra = new Astra(Flower.Color.WHITE, Flower.Size.MEDIUM, 24.4);
        Tulp tulp = new Tulp(Flower.Color.GREEN, Flower.Size.BIG, 79.99);

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

        bouqetOfFlowers.add(new Rose(Flower.Color.RED, Flower.Size.BIG, 100.99));
        bouqetOfFlowers.add(new Rose(Flower.Color.RED, Flower.Size.BIG, 100.99));
        bouqetOfFlowers.add(new Rose(Flower.Color.RED, Flower.Size.BIG, 100.99));
        bouqetOfFlowers.add(new Rose(Flower.Color.RED, Flower.Size.MEDIUM, 80.99));

        System.out.println(bouqetOfFlowers);

        System.out.println(bouqetOfFlowers.getTotalPrice());

        RoseBush roseBush = new RoseBush(Flower.Color.RED, Flower.Size.SMALL);
        roseBush.birth();
        System.out.println(roseBush);

    }
}
