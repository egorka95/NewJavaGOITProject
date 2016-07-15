package module04.Task1;

/**
 * Created by nikitarozhkov on 13.07.16.
 */
/*
 * Added by Dmitrij Lenchuk
 *
 * 1. Поубирай бессмысленные надписи из javaDoc, типа: "Created by nikitarozhkov on 01.06.16.".
 *    Напиши туда что-то вразумительное о классе.
 */
public class IllegalStateForFigureException extends Exception {

    private final String message;

    @Override
    public String getMessage() {
        return message;
    }

    IllegalStateForFigureException(String message){
        this.message = message;
    }
}
