package module04.Task1;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
public class Circle implements Figure {

    private double radius;

    public double getX() {
        return radius;
    }

    public void setX(double x) {
        this.radius = radius;
    }

    public  Circle(double radius)throws IllegalArgumentException{
        if (radius < 0){
            throw new IllegalArgumentException("Вы ввели отрицательно число");
        }else
        this.radius=radius;

    }

    @Override
    public double area() {
        return Math.PI * (this.radius * this.radius);
    }
}
