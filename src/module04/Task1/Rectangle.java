package module04.Task1;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
 class Rectangle implements Figure {


    //дать адекватные названия
    private double side1;

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    private double side2;


    public Rectangle(double side1, double side2) throws IllegalStateForFigureException {
        if (side1 < 0 || side2 < 0){
            throw new IllegalStateForFigureException("Вы ввели отрицательное число");
        }else
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double area() {
        return side1 * side2;
    }
}