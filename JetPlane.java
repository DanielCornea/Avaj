package AvajSimulator;
import AvajSimulator.*;


/**
 * Created by dcornea on 6/7/17.
 */
public class JetPlane extends Aircraft implements Flyable {


    private WeatherTower weatherTower;
    JetPlane(String name, Coordinates coordinates){
        super(name, coordinates);
        weatherTower = new WeatherTower();

    }
    public void updateConditions() {
        if (this.coordinates.getHeight() > 0) {
            String weather = weatherTower.getWeather(this.coordinates);
            if (weather.equals("SUN")) {
                this.coordinates.setLatitude(this.coordinates.getLatitude() + 10);
                this.coordinates.setHeight(this.coordinates.getHeight() + 2);
                if (this.coordinates.getHeight() > 100){
                    this.coordinates.setHeight(100);

                }
            } else if (weather.equals("RAIN")) {
                this.coordinates.setLatitude(this.coordinates.getLatitude() + 5);


            } else if (weather.equals("FOG")) {
                this.coordinates.setLatitude(this.coordinates.getLatitude() + 1);

            } else {
                this.coordinates.setLatitude(this.coordinates.getLatitude() - 7);
                this.coordinates.setHeight(this.coordinates.getHeight() + 5);
                if (this.coordinates.getHeight() > 100){
                    this.coordinates.setHeight(100);

                }
            }
            if (this.coordinates.getHeight() <= 0) {
                weatherTower.unregister(this);
                Writer.writeToFile("JetPlane  with the glorious name " + this.name + " and with magnificient ID " + this.id + " has landed at " + "LONG:" +
                        this.coordinates.getLongitude() + " LAT:" + this.coordinates.getLatitude());
            } else {


                weather = (String) weatherTower.getWeather(this.coordinates);
                if (weather.equals("SUN")) {
                    Writer.writeToFile("JetPlane#" + this.name + " (" + this.id + ") : My speedy wings so shine much sun "  + "\n");
                }
                if (weather.equals("RAIN")) {
                    Writer.writeToFile("JetPlane#" + this.name + " (" + this.id + ") : Purple rain, purple rain Purple Jet Plane " + "\n");
                }
                if (weather.equals("FOG")) {
                    Writer.writeToFile("JetPlane#" + this.name + " (" + this.id + ") : FOG, FOG, FOG, has anyone seen Moscow on the road ? " + "\n");

                }
                if (weather.equals("SNOW")) {
                    Writer.writeToFile("JetPlane#" + this.name + " (" + this.id + ") Rains like in Moscow again!!!! Hurray Hurray Hurray !!!" + "\n");
                }
            }
        }

    }

    public void registerTower(WeatherTower weatherTower){

        Writer.writeToFile("The JetPlane with #" + this.id + " with the glorius name of " + this.name + " is registered to the tower" + "\n");
    }
}
