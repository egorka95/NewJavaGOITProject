package module03.task1;

import java.util.ArrayList;
import java.util.List;

public class RoseBush {

    private List<Rose> roses = new ArrayList<>();

    public class Rose extends Flower {

        public Rose(Color color, Size size, double price) {
            super(color, size, price);
        }

    }

    private Flower.Color color;
    private Flower.Size size;

    public RoseBush(Flower.Color color,Flower.Size size) {
        this.color = color;
        this.size = size;
    }



    public void birth(){
        if (roses.size() == 0 ){
            System.out.println("Куст пуст - цветы еще не вырасли");
            System.out.println("Сейчас немного времени и солнца и все будет");
            int newRoseOnTheBush = (int)(Math.random()*10);
            for (int i = 0; i < newRoseOnTheBush; i++){
                roses.add(new Rose(Flower.Color.RED, Flower.Size.SMALL,10.50));
            }
        }
    }

    @Override
    public String toString() {
        return "RoseBush{" +
                "roses=" + roses +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}
