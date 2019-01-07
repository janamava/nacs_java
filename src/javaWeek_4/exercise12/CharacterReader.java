package javaWeek_4.exercise12;

import javaWeek_4.exercise9.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CharacterReader {

    private FileReader reader = new FileReader();

    public List<Character> getCharacters(String filePath) {

        List<Character> characters = new ArrayList<>();
        List<String> lines = reader.asLines(filePath);
        characters = transformLinesInCharacters(lines);
        return characters;
    }

    private List<Character> transformLinesInCharacters(List<String> lines) {
        List<Character> characters = new ArrayList<>();
        for (String line : lines) {
            Character character = transformOneLineInCharacter(line);
            characters.add(character);
        }
        return characters;
    }

    private Character transformOneLineInCharacter(String line) {
        String[] splitted = line.split(";");
        return new Character(
                splitted[0],
                splitted[3],
                splitted[6]
        );
    }
}