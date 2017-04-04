package Entities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Саня on 01.04.2017.
 */
public class Reader {
    public static ArrayList<String> reaedData() throws IOException {
        ArrayList<String> schedule = new ArrayList<>();
        File file = new File("ForJP\\in.txt");


        Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
            schedule.add(scanner.nextLine());
        }
        scanner.close();

        return schedule;
    }

}
