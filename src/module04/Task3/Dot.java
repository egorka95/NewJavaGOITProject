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

    private int xValue;
    private int yValue;

    public Dot(int xValue, int yValue) {
        this.xValue = xValue;
        this.yValue = yValue;
    }

    public int getxValue() {
        return xValue;
    }

    public void setxValue(int xValue) {
        this.xValue = xValue;
    }

    public int getyValue() {
        return yValue;
    }

    public void setyValue(int yValue) {
        this.yValue = yValue;
    }

    public double calculator(Dot dot2) {
        return Math.sqrt(Math.pow((this.xValue - dot2.getxValue()), 2) + Math.pow((this.yValue - dot2.getyValue()), 2));
    }

    @Override
    public String toString() {
        return "Dot{" +
                "point1=" + xValue +
                ", point2=" + yValue +
                '}';
    }


}
