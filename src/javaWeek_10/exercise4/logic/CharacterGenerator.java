package javaWeek_10.exercise4.logic;

import fileReader.FileReader;
import javaWeek_10.exercise4.model.Character;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterGenerator {

    public List<Character> generateCharacters(){
        return new FileReader().asStream("javaWeek_10/exercise4/data/got-characters.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(convertToCharacter())
                .collect(Collectors.toList());
    }

    private Function<String[], Character> convertToCharacter() {
        return e -> new Character(e[0], e[2], e[6], e[3],
                e[1], e[7], e[5], e[4]);

    }
}
