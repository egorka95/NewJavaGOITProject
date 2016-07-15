package module04.Task1;

/**
 * Класс Треугольник здесь реализованы методы подсчета площади треугольника и так же
 * внедренна специальный Exception для фигур
 */

/*
 * Added by Dmitrij Lenchuk
 *
 * 1. Синтаксические ошибки: Triangle -> Triangle +++
 * 2. Не соблюдена конвенция - поля класса идут первыми, конструктор класса должен идти сразу после полей класса +++
 * 3. Я ничего не имею против площади прямоугольного треугольника по двум катетам,
 *    но такого ограничения в задаче не было.
 * 4. Когда вываливают эксепшин, стараются выдать как можно больше информации, которой ты обладаешь,
 *    поэтому стоит передавать в конструктор не только "Вы ввели отрицательное число",
 *    но и сами некорректные данные
 * 5. Конструктор будет работать правильно, но там лажа. Найди сам.
 * 6. Поубирай бессмысленные надписи из javaDoc, типа: "Created by nikitarozhkov on 01.06.16.".
 *    Напиши туда что-то вразумительное о классе.
 */
public class Triangle implements Figure {

    public Triangle(double firstSideOfTriangle, double secondSideOfTriangle) throws IllegalArgumentException {
        if (firstSideOfTriangle < 0 || secondSideOfTriangle < 0) {
            throw new IllegalArgumentException("Вы ввели отрицательное число " + firstSideOfTriangle
                    + " или " + secondSideOfTriangle + "Введите пожалуйста коерктные данные");
        }
            this.firstSideOfTriangle = firstSideOfTriangle;
            this.secondSideOfTriangle = secondSideOfTriangle;

    }

    private double firstSideOfTriangle;

    public double getSecondSideOfTriangle() {
        return secondSideOfTriangle;
    }

    public void setSecondSideOfTriangle(double secondSideOfTriangle) {
        this.secondSideOfTriangle = secondSideOfTriangle;
    }

    public double getFirstSideOfTriangle() {
        return firstSideOfTriangle;
    }

    public void setFirstSideOfTriangle(double firstSideOfTriangle) {
        this.firstSideOfTriangle = firstSideOfTriangle;
    }


    private double secondSideOfTriangle;

    @Override
    public double area() {
        return (0.5 * firstSideOfTriangle) * secondSideOfTriangle;
    }
}
