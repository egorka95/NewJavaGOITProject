package module04.Task1;

/*
 * Added by Dmitrij Lenchuk
 *
 * 1. Синтаксические ошибки: Traingle -> Triangle
 * 2. Не соблюдена конвенция - поля класса идут первыми, конструктор класса должен идти сразу после полей класса
 * 3. Я ничего не имею против площади прямоугольного треугольника по двум катетам,
 *    но такого ограничения в задаче не было.
 * 4. Когда вываливают эксепшин, стараются выдать как можно больше информации, которой ты обладаешь,
 *    поэтому стоит передавать в конструктор не только "Вы ввели отрицательное число",
 *    но и сами некорректные данные
 * 5. Конструктор будет работать правильно, но там лажа. Найди сам.
 * 6. Поубирай бессмысленные надписи из javaDoc, типа: "Created by nikitarozhkov on 01.06.16.".
 *    Напиши туда что-то вразумительное о классе.
 */
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
