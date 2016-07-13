package module03.task1;

import java.util.ArrayList;
import java.util.List;


public class Runner {
    public static void main(String[] args) {

        Rose rose = new Rose(Flower.Color.RED, Flower.Size.BIG, 17.3);
        Daisy daisy = new Daisy(Flower.Color.WHITE, Flower.Size.SMALL, 20.5);
        Astra astra = new Astra(Flower.Color.WHITE, Flower.Size.MEDIUM, 24.4);
        Tulp tulp = new Tulp(Flower.Color.GREEN, Flower.Size.BIG, 79.99);

        List<Flower> shopWindowFlowers = new ArrayList<>();

        shopWindowFlowers.add(rose);
        shopWindowFlowers.add(daisy);
        shopWindowFlowers.add(astra);
        shopWindowFlowers.add(tulp);

        double sum = 0;

        for (Flower flower : shopWindowFlowers) {

            sum += flower.getPrice();

        }

        System.out.println(sum);

        Bouqet bouqetOfFlowers = new Bouqet();

        bouqetOfFlowers.add(shopWindowFlowers.remove(0));
        bouqetOfFlowers.add(shopWindowFlowers.remove(0));
        bouqetOfFlowers.add(shopWindowFlowers.remove(0));
        bouqetOfFlowers.add(shopWindowFlowers.remove(0));

        System.out.println(bouqetOfFlowers);

        System.out.println(bouqetOfFlowers.getTotalPrice());

        RoseBush roseBush = new RoseBush(Flower.Color.RED, Flower.Size.SMALL);
        roseBush.birth();
        System.out.println(roseBush);

    }
}
