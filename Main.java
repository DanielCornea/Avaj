package AvajSimulator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by dcornea on 6/6/17.
 */
import AvajSimulator.*;

public class Main {

    private static WeatherTower weatherTower = new WeatherTower();
    private static ArrayList<Flyable> flyables = new ArrayList<>();

    public static void main(String[] args) {

        Flyable flyable;

        //System.out.println("src/AvajSimulator/" + args[0]);
        if (args.length == 0){
            System.out.println("Ze file does not exist");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader("AvajSimulator/" + args[0]))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            String[] words;
            words = new String[5];
            String[] word;
            word = new String[4];
            int numarIteratii;
            try {
                numarIteratii= Integer.parseInt(line);
            }catch (Error e){
                System.out.println("Sorry bro, something wrong with code here!!!!");
                return;
            }


            line = br.readLine();
            while (line != null) {

                word = line.split(" ");
               if (line.matches("(Baloon|JetPlane|Helicopter) [a-zA-z1-9]+ [1-9]?[0-9]{1,2} [1-9]?[0-9]{1,2} [1-9]?[0-9]{1,2}$")) {
                    weatherTower.register(AircraftFactory.newAircraft(word[0].toString(), word[1].toString(), Integer.valueOf(word[2]), Integer.valueOf(word[3]), Integer.valueOf(word[4])));
                    line = br.readLine();

                } else {
                    System.out.println("invalid file, sorry bro ;__( ");
                    break;
                }
            }
            for (int i = 1; i <= numarIteratii; i++) {
                weatherTower.changeWeather();
                weatherTower.conditionsChanged();
            }


        } catch (IOException e) {
            System.out.println("file wrong bro");
            //e.printStackTrace();
        }
    }
}


