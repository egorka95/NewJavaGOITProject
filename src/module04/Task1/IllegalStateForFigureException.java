package module04.Task1;

/**
 * Created by nikitarozhkov on 13.07.16.
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
