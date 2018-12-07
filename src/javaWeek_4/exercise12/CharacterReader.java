package javaWeek_4.exercise12;

import javaWeek_4.exercise9.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharacterReader {

    public List<Character> getCharacters(String filePath) {
        List<String> fileLines = read(filePath);
        List<Character> characters = transformLinesInCharacters(fileLines);
        return characters;
    }

    public List<String> read(String filePath) {
        List<String> lines = new FileReader().asLines(filePath);
        return lines;
    }

    public List<Character> transformLinesInCharacters(List<String> fileLines) {
        List<Character> characters = new ArrayList<>();
        for (String fileLine : fileLines) {
            Character character = transformLineInCharacter(fileLine);
            characters.add(character);
        }
        return characters;
    }

    public Character transformLineInCharacter(String fileLine) {
        String[] immutableSplitted = fileLine.split(";");
        List<String> mutableSplitted = Arrays.asList(immutableSplitted);

        String name = mutableSplitted.get(0);
        String bookOfDeath = mutableSplitted.get(3);
        String gender = mutableSplitted.get(6);
        return new Character(name, bookOfDeath, gender);
    }
}

//  findGender(mutableSplitted);
//    public String findGender(List<String> mutableSplitted) {
//        String gender;
//
//        if (mutableSplitted.get(6).equals("1")){
//            gender = "man";
//        }
//        if (mutableSplitted.get(6).equals("0")){
//            gender = "woman";
//        }
//        return gender;

//Create the CharacterReader class that has the getCharacters method that receives a filePath,
// uses a FileReader to read its lines, transforms them into Characters and returns them.
