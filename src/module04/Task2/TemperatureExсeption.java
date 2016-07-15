package module04.Task2;

/**
 * Created by nikitarozhkov on 13.07.16.
 */
/*
 * Added by Dmitrij Lenchuk
 * 1. В названии класса ошибка, похоже там где-то не английский символ. Это лажа.
 *    Сделай рефакторинг этого класса и вбей четко английские буквы.
 * 2. Поубирай бессмысленные надписи из javaDoc, типа: "Created by nikitarozhkov on 01.06.16.".
 *    Напиши туда что-то вразумительное о классе.
 */
public class TemperatureExсeption extends Exception {
    private final String message;

    @Override
    public String getMessage() {
        return message;
    }

    TemperatureExсeption(String message){
        this.message = message;
    }
}
