package module03.task1;

import java.util.ArrayList;
import java.util.List;

abstract class Flower {

    private final List<Flower> flowers = new ArrayList<>();


    private Color color;
    private Size size;
    private double price;

    public Flower() {

        //тут мы должны установить какие то константы отталкиваясь от нужной нам логики

    }

    public enum  Size {

        BIG,
        MEDIUM,
        SMALL

    }

    public enum Color{
        RED,
        BLUE,
        WHITE,
        GREEN,
    }

    public Flower(Color name, Size size, double price) {
        this.color = name;
        this.size = size;
        this.price = price;

    }

    public Flower flower(int index){
        return flowers.get(index);
    }

    public boolean add(Flower flower){
        return flowers.add(flower);
    }

    public Flower remove(int index){
        return flowers.remove(index);
    }

    public Color getColor() {
        return color;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }



    @Override
    public String toString() {
        return "Flower{" +
                "color = '" + color + '\'' +
                ", size = " + size +
                ", price = " + price +
                '}';
    }
}
