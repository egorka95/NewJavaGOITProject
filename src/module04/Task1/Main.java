package module04.Task1;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
/*
 * Added by Dmitrij Lenchuk
 *
 * 1. Синтаксические ошибки: traingle -> triangle
 * 2. Старайся проверять классы на дуракоустойчивость. Подсовывай инвалидные данные.
 * 6. Поубирай бессмысленные надписи из javaDoc, типа: "Created by nikitarozhkov on 01.06.16.".
 *    Напиши туда что-то вразумительное о классе.
 * 7. Приучи себя пользоваться функцией Reformat Code (клавиши ctrl+alt+L) на Маке смотри сам *
 */
public class Main {


    public static void main(String[] args)throws IllegalStateForFigureException {

        /*

        Magic Numbers && Hard code.

         */

        Figure rectangle = new Rectangle(-3,4);
        System.out.println(rectangle.area());

        Figure circle = new Circle(4);
        System.out.println(circle.area());

        Figure traingle = new Traingle(3,4);
        System.out.println(traingle.area());

    }
}
