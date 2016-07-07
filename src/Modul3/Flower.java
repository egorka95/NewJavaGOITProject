package Modul3;

abstract class  Flower {

    private String color;
    private Size size;


    public Flower(String name, Size size) {
        this.color = name;
        this.size = size;
    }

    public String getName() {
        return color;
    }

    public void setName(String name) {
        this.color = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
