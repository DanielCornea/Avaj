package AvajSimulator;

import java.util.ArrayList;

/**
 * Created by dcornea on 6/7/17.
 *
 * Tower este interfata pentru subiect, aici conform paradigmei trebuie sa avem:
 *
 *                                  O lista de observeri
 *                                  metoda pentru inregistrare
 *                                  metoda pentru de inregistrare
 *                                  metoda pentru notificare de schimbare
 *
 */
public abstract class Tower {

    private ArrayList<Flyable> observers = new ArrayList<>(); //lista de observeri
    /**
     *
     * @param flyable
     */
    public void register(Flyable flyable){
        observers.add(flyable);
        flyable.registerTower((WeatherTower) this);
    }



    /**
     * metoda de notificare  a schimbarilor
     */
    protected  void conditionsChanged (){
        for (Flyable i : observers
             ) {
            i.updateConditions();
        }
       // System.out.println("conditions Changed");
    }
    /**
     *
     * @param flyable
     * Metoda de de-inregistrare
     */
    public  void unregister (Flyable flyable) {
        observers.remove(flyable);
    }

}
