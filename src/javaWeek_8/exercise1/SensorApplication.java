package javaWeek_8.exercise1;

import fileReader.FileReader;
import java.util.List;

public class SensorApplication {

    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        Sensor sensor = new Sensor();
        Archive archive = new Archive();

        List<String> lines = fileReader.asLines("files/robomime.txt");
        List<String> decrypted = sensor.decryptManyLines(lines);
        archive.display(decrypted);
    }
}
