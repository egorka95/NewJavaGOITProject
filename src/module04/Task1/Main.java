package module04.Task1;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
public class Main {


    public static void main(String[] args) {

        /*

        Magic Numbers && Hard code.

         */

        Figure rectangle = new Rectangle(3,4);
        System.out.println(rectangle.area());

        Figure circle = new Circle(4);
        System.out.println(circle.area());

        Figure traingle = new Traingle(3,4);
        System.out.println(traingle.area());

    }
}
