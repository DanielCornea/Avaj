package AvajSimulator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


/**
 * Created by dcornea on 6/13/17.
 */
public class Writer {
    private static final String FILENAME = "filename.txt";

    private   static BufferedWriter bw = null;
    private static FileWriter fw = null;
    public static void writeToFile(String string) {
        File f = new File(FILENAME);

        if(f.exists()) {
            try {
                Files.write(Paths.get(FILENAME), string.getBytes(), StandardOpenOption.APPEND);
            }catch (IOException e) {
                System.out.println("Could not write in file");
            }
        }else{
            try {
                f.createNewFile();
                try {
                    Files.write(Paths.get(FILENAME), string.getBytes(), StandardOpenOption.APPEND);
                }catch (IOException e) {
                    System.out.println("Could not write in file");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}



