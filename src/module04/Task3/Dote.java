package module04.Task3;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
/*
 * Added by Dmitrij Lenchuk
 * 1. Синтаксические ошибки poin -> point
 * 2. Dote - переводится где-то как "сумашествие" или "выжывать из ума".
 *    Это точно то название, которое ты хотел дать классу? Наверное Dot?
 * 3. С первого взгляда никак не мог понять о чем это.
 *    Названия полей никак не отображают физический смысл, а только путают.
 *    Нужно назвать так, чтобы было понятно, что одно, это координата "x",
 *    а второе - "y", при этом название поля лучше чтобы состояло не из одной буквы.
 * 4. Стоит реализовать метод toString().
 * 5. Поубирай бессмысленные надписи из javaDoc, типа: "Created by nikitarozhkov on 01.06.16.".
 *    Напиши туда что-то вразумительное о классе.
 * 6. Приучи себя пользоваться функцией Reformat Code (клавиши ctrl+alt+L) на Маке смотри сам *
 */
public class Dote {

    private int poin1;
    private int poin2;

    public Dote(int poin1, int poin2) {

        this.poin1 = poin1;
        this.poin2 = poin2;

    }

    public int getPoin1() {
        return poin1;
    }

    public void setPoin1(int poin1) {
        this.poin1 = poin1;
    }

    public int getPoin2() {
        return poin2;
    }

    public void setPoin2(int poin2) {
        this.poin2 = poin2;
    }

    public double calculator(Dote dote2) {
        return Math.sqrt(Math.pow((this.poin1 - dote2.getPoin1()), 2) + Math.pow((this.poin2 - dote2.getPoin2()), 2));
    }


}
