package module04.Task2;

/*
 * Added by Dmitrij Lenchuk
 * 1. Не соблюдена конвенция - названия методов у тебя в капсе, а должен быть camelName +++
 * 2. Название аргумента "х" неинформативно. +++
 * 3. В методах у тебя делаются вначале вычисления, а потом проверки. +++
 *    Это неприемлимо.
 *    Вначале верифаятся и валидируются исходные данные, а затем производят какие-то действия
 * 4. Класс Temperature не хранит никаких состояний. Ты его используешь, как контейнер утилит.
 *    Поэтому стоит методы в нем сделать статическими. ???
 *    Тогда тебе не прийдется зря создавать ненужные экземпляры классов.
 * 5. Когда вываливают эксепшин, стараются выдать как можно больше информации, которой ты обладаешь,
 *    поэтому стоит передавать в конструктор не только "Некоректные данные", но и сами некорректные данные
 * 6. Поубирай бессмысленные надписи из javaDoc, типа: "Created by nikitarozhkov on 01.06.16.".
 *    Напиши туда что-то вразумительное о классе.
 */
public class Temperature {

    public static final double ABSOLUTE_ZERO_IN_CELSIUS = -273.15;
    public static final double ABSOLUTE_ZERO_IN_FAHRENHEIT = -459.67;


    public static double celsius(double degree) throws TemperatureException {

        if (degree <= ABSOLUTE_ZERO_IN_CELSIUS) {
            throw new TemperatureException("Вы ввели некоректные данные: " + degree
                    + " температрура которую вы ввели ниже " + ABSOLUTE_ZERO_IN_CELSIUS
                    + " а это на минуточку обсолютный ноль");
        }
        return (degree * 1.8) + 32;
    }

    public static double fahrenheit(double degree) throws TemperatureException {

        if (degree <= ABSOLUTE_ZERO_IN_FAHRENHEIT) {
            throw new TemperatureException("Вы ввели некоректные данные: " + degree
                    + " температрура которую вы ввели ниже " + ABSOLUTE_ZERO_IN_FAHRENHEIT
                    + " а это на минуточку обсолютный ноль");
        }
        return (degree - 32) * 1.8;
    }
}
