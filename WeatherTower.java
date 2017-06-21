package AvajSimulator;

/**
 * Created by dcornea on 6/7/17.
 */
import AvajSimulator.Tower;

public class WeatherTower extends Tower {


    public String getWeather(Coordinates coordinates){

        return WeatherProvider.getProvider().getCurrentWeather(coordinates);
    }


    void changeWeather(){
        super.conditionsChanged();
    }

}
    

