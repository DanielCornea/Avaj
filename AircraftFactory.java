package AvajSimulator;
import AvajSimulator.*;

/**
 * Created by dcornea on 6/6/17.
 */
public abstract class AircraftFactory {
    public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height) {
        Coordinates coordinates;
        if (longitude > 100) {
            longitude = 100;
        }
        if (latitude > 100) {
            latitude = 100;
        }
        if (latitude > 100) {
            latitude = 100;
        }
        coordinates = new Coordinates(longitude, latitude, height);
        if (type.equals("Helicopter"))
            return new Helicopter(name, coordinates);
        else if (type.equals("JetPlane"))
            return new JetPlane(name, coordinates);
        else if (type.equals("Baloon"))
            return new Balloon(name, coordinates);
        else
            return null;
    }
}
