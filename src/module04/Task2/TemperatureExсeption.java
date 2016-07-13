package module04.Task2;

/**
 * Created by nikitarozhkov on 13.07.16.
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
