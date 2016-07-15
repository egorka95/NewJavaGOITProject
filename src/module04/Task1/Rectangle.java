package module04.Task1;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
/*
 * Added by Dmitrij Lenchuk
 *
 * 1. Можно оставить, но мне не нравятся названия, в которых присутствует "1", "2".
 *    Стоит увязывать с физическим смыслом. обычно в математике стороны обозначают "a", "b".
 *    Но название не должно содержать одну букву... *
 * 2. Не соблюдена конвенция - поля класса идут первыми, конструктор класса должен идти сразу после полей класса
 * 4. Когда вываливают эксепшин, стараются выдать как можно больше информации, которой ты обладаешь,
 *    поэтому стоит передавать в конструктор не только "Вы ввели отрицательное число",
 *    но и сами некорректные данные
 * 5. Конструктор будет работать правильно, но там лажа. Найди сам.
 * 6. Поубирай бессмысленные надписи из javaDoc, типа: "Created by nikitarozhkov on 01.06.16.".
 *    Напиши туда что-то вразумительное о классе.
 * 7. Приучи себя пользоваться функцией Reformat Code (клавиши ctrl+alt+L) на Маке смотри сам *
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