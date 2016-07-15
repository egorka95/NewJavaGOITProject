package module04.Task1;


/*
 * Added by Dmitrij Lenchuk
 *
 * 1. Не соблюдена конвенция
 * 1.1. Поля класса идут первыми, конструктор класса должен идти сразу после полей класса +++
 * 1.2. Названия гетера, сетера не совпадают с названием поля, при этом в сетере логическая ошибка - найди сам ???!!!
 * 4. Когда вываливают эксепшин, стараются выдать как можно больше информации, которой ты обладаешь,  +++
 *    поэтому стоит передавать в конструктор не только "Вы ввели отрицательное число",  +++
 *    но и сами некорректные данные
 * 5. Конструктор будет работать правильно, но там лажа. Найди сам. ???!!!
 * 6. Поубирай бессмысленные надписи из javaDoc, типа: "Created by nikitarozhkov on 01.06.16.".
 *    Напиши туда что-то вразумительное о классе.
 * 7. Приучи себя пользоваться функцией Reformat Code (клавиши ctrl+alt+L) на Маке смотри сам * +++
 */
public class Circle implements Figure {

    public Circle(double radius) throws IllegalArgumentException {
        if (radius < 0) {
            throw new IllegalArgumentException("Вы ввели отрицательное число " + radius + "Введите пожалуйста коерктные данные");
        }
            this.radius = radius;

    }

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (this.radius * this.radius);
    }
}
