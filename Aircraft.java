package AvajSimulator;
import AvajSimulator.*;

/**
 * Created by dcornea on 6/7/17.
 */
public abstract class Aircraft {
    protected long id = 0;
    protected String name;
    protected Coordinates coordinates;
    private static long idCounter;

    protected Aircraft(String name, Coordinates coordinates){
        this.name = name;
        this.coordinates = coordinates;
        this.id = nextId();

    }

    private long nextId(){
        return ++idCounter;
    }




}
