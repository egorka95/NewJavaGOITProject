package module3;

abstract class Flower {

    private String color;
    private Size size;
    private double price;


    public Flower(String name, Size size, double price) {
        this.color = name;
        this.size = size;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
