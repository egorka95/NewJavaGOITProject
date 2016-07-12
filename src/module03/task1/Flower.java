package module03.task1;

abstract class Flower {

    private Color color;
    private Size size;
    private double price;

    public Flower() {

        //тут мы должны установить какие то константы отталкиваясь от нужно нам логики

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
