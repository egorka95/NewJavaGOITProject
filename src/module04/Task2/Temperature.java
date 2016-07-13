package module04.Task2;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
public class Temperature {

    public static final double ABSOLUTE_ZERO_IN_CELSIUS = -273.15;
    public static final double ABSOLUTE_ZERO_IN_FAHRENHEIT = -459.67;




    public double CELSIUS(double x) throws TemperatureExсeption {
        double temperature = (x * 1.8) + 32;

        if (x <= ABSOLUTE_ZERO_IN_CELSIUS)
        {
            throw new TemperatureExсeption("Некоректные данные");
        }
        else
            return temperature;
    }

    public double FAHRENHEIT(double x) throws TemperatureExсeption {
        double temperature = (x - 32) * 1.8;

        if (x <= ABSOLUTE_ZERO_IN_FAHRENHEIT)
        {
            throw new TemperatureExсeption("Некоректные данные");
        }else
            return temperature;
    }
}
