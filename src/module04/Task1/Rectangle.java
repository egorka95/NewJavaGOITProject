package module04.Task1;

/**
 * Класс треугольник тут находятся методы и переменные этого класса
 */
/*
 * Added by Dmitrij Lenchuk
 *
 * 1. Можно оставить, но мне не нравятся названия, в которых присутствует "1", "2".
 *    Стоит увязывать с физическим смыслом. обычно в математике стороны обозначают "a", "b". +++
 *    Но название не должно содержать одну букву... *
 * 2. Не соблюдена конвенция - поля класса идут первыми, конструктор класса должен идти сразу после полей класса +++
 * 4. Когда вываливают эксепшин, стараются выдать как можно больше информации, которой ты обладаешь, +++
 *    поэтому стоит передавать в конструктор не только "Вы ввели отрицательное число",
 *    но и сами некорректные данные
 * 5. Конструктор будет работать правильно, но там лажа. Найди сам. ???
 * 6. Поубирай бессмысленные надписи из javaDoc, типа: "Created by nikitarozhkov on 01.06.16.". +++
 *    Напиши туда что-то вразумительное о классе.
 * 7. Приучи себя пользоваться функцией Reformat Code (клавиши ctrl+alt+L) на Маке смотри сам * +++
 */
class Rectangle implements Figure {

    private double sideB;
    private double sideA;

    public Rectangle(double sideA, double sideB) throws IllegalStateForFigureException {
        if (sideA < 0 || sideB < 0) {
            throw new IllegalStateForFigureException("Вы ввели отрицательное число " + sideA +
                    " или " + sideB + "Введите пожалуйста коерктные данные");
        }
            this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }


    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }
}