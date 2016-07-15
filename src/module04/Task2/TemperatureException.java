package module04.Task2;


/*
В этом классе я написал специальную ошибку для моих методов вычесления температур
 */

/*
 * Added by Dmitrij Lenchuk
 * 1. В названии класса ошибка, похоже там где-то не английский символ. Это лажа.  +
 *    Сделай рефакторинг этого класса и вбей четко английские буквы. +
 * 2. Поубирай бессмысленные надписи из javaDoc, типа: "Created by nikitarozhkov on 01.06.16.".
 *    Напиши туда что-то вразумительное о классе.
 */
public class TemperatureException extends Exception {
    private final String message;

    @Override
    public String getMessage() {
        return message;
    }

    TemperatureException(String message) {
        this.message = message;
    }
}
