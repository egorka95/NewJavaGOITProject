package module04.Task3;


/*
 * Added by Dmitrij Lenchuk
 * 1. Синтаксические ошибки poin -> point +++
 * 2. Dote - переводится где-то как "сумашествие" или "выжывать из ума". +++
 *    Это точно то название, которое ты хотел дать классу? Наверное Dot? +++
 * 3. С первого взгляда никак не мог понять о чем это.
 *    Названия полей никак не отображают физический смысл, а только путают.
 *    Нужно назвать так, чтобы было понятно, что одно, это координата "x",
 *    а второе - "y", при этом название поля лучше чтобы состояло не из одной буквы.
 * 4. Стоит реализовать метод toString(). +++
 * 5. Поубирай бессмысленные надписи из javaDoc, типа: "Created by nikitarozhkov on 01.06.16.".+++
 *    Напиши туда что-то вразумительное о классе.
 * 6. Приучи себя пользоваться функцией Reformat Code (клавиши ctrl+alt+L) на Маке смотри сам +++ *
 *
 */
public class Dot {

    private int point1;
    private int point2;

    public Dot(int point1, int point2) {

        this.point1 = point1;
        this.point2 = point2;

    }

    public int getPoint1() {
        return point1;
    }

    public void setPoint1(int point1) {
        this.point1 = point1;
    }

    public int getPoint2() {
        return point2;
    }

    public void setPoint2(int point2) {
        this.point2 = point2;
    }

    public double calculator(Dot dot2) {
        return Math.sqrt(Math.pow((this.point1 - dot2.getPoint1()), 2) + Math.pow((this.point2 - dot2.getPoint2()), 2));
    }

    @Override
    public String toString() {
        return "Dot{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }


}
