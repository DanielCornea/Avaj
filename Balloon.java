package AvajSimulator;
import AvajSimulator.Coordinates;



/**
 * Created by dcornea on 6/7/17.
 */


public class Balloon extends Aircraft implements Flyable {


    private WeatherTower weatherTower;

    Balloon(String name, Coordinates coordinates) {
        super(name, coordinates);
        weatherTower = new WeatherTower();

    }


    public void updateConditions() {

        if (this.coordinates.getHeight() > 0) {


            String weather = weatherTower.getWeather(this.coordinates);
            if (weather.equals("SUN")) {
                this.coordinates.setLatitude(this.coordinates.getLatitude() + 2);
                this.coordinates.setHeight(this.coordinates.getHeight() + 4);
                if (this.coordinates.getHeight() > 100){
                    this.coordinates.setHeight(100);

                }
            } else if (weather.equals("RAIN")) {
                this.coordinates.setHeight(this.coordinates.getHeight() - 5);
            } else if (weather.equals("FOG")) {
                this.coordinates.setHeight(this.coordinates.getHeight() - 3);

            } else {
                this.coordinates.setHeight(this.coordinates.getHeight() - 15);
            }


            weather = (String) weatherTower.getWeather(this.coordinates);
            if (this.coordinates.getHeight() <= 0) {
                weatherTower.unregister(this);
                Writer.writeToFile("Baloon with the glorious name " + this.name + " and with magnificient ID " + this.id + " has landed " + "at  H:" +  " LONG:" +
                        this.coordinates.getLongitude() + " LAT:" + this.coordinates.getLatitude() + "\n");
            } else {

                if (weather.equals("SUN")) {
                    Writer.writeToFile("Baloon#" + this.name + " (" + this.id + ") : My baloon shining, they hatin " + "\n");
                }
                if (weather.equals("RAIN")) {
                    Writer.writeToFile("Baloon#" + this.name + " (" + this.id + ") : I can see baloon melting with rain " + "\n");
                }
                if (weather.equals("FOG")) {
                    Writer.writeToFile("Baloon#" + this.name + " (" + this.id + ") : me ballooon see noting cuz of da  FOG " + "\n");
                }
                if (weather.equals("SNOW")) {
                    Writer.writeToFile("Baloon#" + this.name + " (" + this.id + ") Ze winter for ze glorius baloon iz caming  " + "\n");
                }
            }

        }
    }
    public void registerTower(WeatherTower weatherTower) {

        Writer.writeToFile("The Balloon with #" + this.id + " with the glorius name of " + this.name + " is registered to the tower" + "\n");
    }
}
