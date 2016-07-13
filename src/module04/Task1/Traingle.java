package module04.Task1;

public class Traingle implements Figure {

    private double firstSideOfTraingle;

    public double getSecondSideOfTraingle() {
        return secondSideOfTraingle;
    }

    public void setSecondSideOfTraingle(double secondSideOfTraingle) {
        this.secondSideOfTraingle = secondSideOfTraingle;
    }

    public double getFirstSideOfTraingle() {
        return firstSideOfTraingle;
    }

    public void setFirstSideOfTraingle(double firstSideOfTraingle) {
        this.firstSideOfTraingle = firstSideOfTraingle;
    }

    private double secondSideOfTraingle;



    public Traingle(double firstSideOfTraingle, double secondSideOfTraingle)throws IllegalArgumentException {
        if (firstSideOfTraingle < 0 || secondSideOfTraingle < 0){
            throw new IllegalArgumentException("Вы ввели отрицательное число");
        }else
        this.firstSideOfTraingle = firstSideOfTraingle;
        this.secondSideOfTraingle = secondSideOfTraingle;
    }

    @Override
    public double area() {
        return (0.5 * firstSideOfTraingle) * secondSideOfTraingle;
    }
}
