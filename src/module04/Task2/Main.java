package module04.Task2;

/*
 * Added by Dmitrij Lenchuk
 * 1. Не соблюдена конвенция - названия методов у тебя в капсе, а должен быть camelName +++
 * 4. Класс Temperature не хранит никаких состояний. Ты его используешь, как контейнер утилит.
 *    Поэтому стоит методы в нем сделать статическими.
 *    Тогда тебе не прийдется зря создавать ненужные экземпляры классов.
 * 5. Стоит проверить класс на эксепшин. Передай в метод инвалидное значение. +++
 * 6. Поубирай бессмысленные надписи из javaDoc, типа: "Created by nikitarozhkov on 01.06.16.". +++
 *    Напиши туда что-то вразумительное о классе.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        /*

        Magic Numbers && Hard code.

         */

        Temperature calc = new Temperature();

        System.out.println(calc.celsius(-400));

        System.out.println(calc.fahrenheit(32));
    }
}

