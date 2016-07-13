package module04.Task1;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
 class Rectangle implements Figure {


    //дать адекватные названия
    private double x;
    private double y;


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Rectangle(double x, double y) throws IllegalArgumentException {
        if (x < 0 || y < 0){
            throw new IllegalArgumentException("Вы ввели отрицательное число");
        }else
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        return x * y;
    }
}