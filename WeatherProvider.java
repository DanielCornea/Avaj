package AvajSimulator;

/**
 * Created by dcornea on 6/7/17.
 */

import AvajSimulator.WeatherProvider;
import AvajSimulator.Aircraft;
import AvajSimulator.*;
public class WeatherProvider {
    private static WeatherProvider weatherProvider = new WeatherProvider();
    public static String[] weather = {"SUN", "FOG", "RAIN", "COLD"};



    private void WeatherProvider(){

    }

    public static WeatherProvider getProvider(){

                return weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates){
        int height = coordinates.getHeight();
        int latitude = coordinates.getLatitude();
       // System.out.println("inaltieme : " + height);
        //System.out.println("latitudine :" + latitude);

        if ((height <= 10 && height > 0) && ((latitude > 0) && (latitude <= 50))){
            return weather[0];
        }else if ((height <= 20 && height > 10) && ((latitude > 0) && (latitude <= 50)))
        { return weather[1];}
        else if ((height <= 30 && height > 20) && ((latitude > 0) && (latitude <= 50)))
        {return weather[2];}
        else if ((height <= 40 && height > 30) && ((latitude > 0) && (latitude <= 50)))
        {return weather[3];}
        else if ((height <= 50 && height > 40) && ((latitude > 0) && (latitude <= 50)))
        {return weather[0];}
        else if ((height <= 60 && height > 50) && ((latitude > 0) && (latitude <= 50)))
        {return weather[1];}
        else if ((height <= 70 && height > 60) && ((latitude > 0) && (latitude <= 50)))
        {return weather[2];}
        else if ((height <= 80 && height > 70) && ((latitude > 0) && (latitude <= 50)))
        {return weather[3];}
        else if ((height <= 90 && height > 80) && ((latitude > 0) && (latitude <= 50)))
        {return weather[0];}
        else if ((height <= 100 && height > 90) && ((latitude > 0) && (latitude <= 50)))
        {return weather[1];}
        else if ((height <= 10 && height > 0) && ((latitude > 50) && (latitude <= 100))){
            return weather[2];}
        else if ((height <= 20 && height > 10) && ((latitude > 50) && (latitude <= 100))){
            return weather[3];}
        else if ((height <= 30 && height > 20) && ((latitude > 50) && (latitude <= 100))){
            return weather[0];}
        else if ((height <= 40 && height > 30) && ((latitude > 50) && (latitude <= 100))){
            return weather[1];}
        else if ((height <= 50 && height > 40) && ((latitude > 50) && (latitude <= 100))){
            return weather[2];}
        else if ((height <= 60 && height > 50) && ((latitude > 50) && (latitude <= 100))){
            return weather[3];}
        else if ((height <= 70 && height > 60) && ((latitude > 50) && (latitude <= 100))){
            return weather[0];}
        else if ((height <= 80 && height > 90) && ((latitude > 50) && (latitude <= 100))){
            return weather[1];}
        else
            return weather[0];
            //((height <= 90 && height > 100) && ((latitude > 50) && (latitude <= 100))){

        //return null;
        }

}






