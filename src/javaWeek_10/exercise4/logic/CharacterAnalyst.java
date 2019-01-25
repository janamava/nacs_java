package javaWeek_10.exercise4.logic;

import javaWeek_10.exercise4.model.Character;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CharacterAnalyst {

    private List<Character> characters = new CharacterGenerator().generateCharacters();

    public long countCharacters() {
        return characters.stream()
                .count();
    }

    public Long countDeadCharacters() {
        return characters.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .count();
    }

    public void percentageDeadByGender() {
        characters.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .collect(Collectors.groupingBy(Character::getGender, Collectors.counting()))
                .forEach((key, value) -> System.out.println("Percentage of dead " + defineGender(key) + " characters: "
                        + value * 100 / countDeadCharacters()));
    }

    private String defineGender(String number) {
        if (number.equals("0")) {
            return "female";
        }
        return "male";
    }

    public Optional<String> getBiggestCountDeathBook() {
        return characters.stream()
                .filter(e -> !e.getDeathBook().isEmpty())
                .collect(Collectors.groupingBy(Character::getDeathBook, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "Book " + e.getKey() + " | Deaths: " + e.getValue())
                .findFirst();
    }

    public List<String> getNamesOfDeadCharacters() {
        return characters.stream()
                .filter(e -> e.getDeathBook().equals("3"))
                .map(Character::getName)
                .collect(Collectors.toList());
    }

    public List<String> find2BiggestDeathsCountAllegiances() {
        return characters.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .collect(Collectors.groupingBy(Character::getAllegiance, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(2)
                .map(e -> e.getKey() + " allegiance with " + e.getValue() + " dead characters.")
                .collect(Collectors.toList());
    }

    public void getPercentageDeathInNobility() {
        characters.stream()
                .filter(e -> e.getNobility().equals("1"))
                .filter(e -> !e.getDeathYear().isEmpty())
                .collect(Collectors.groupingBy(Character::getNobility, Collectors.counting()))
                .entrySet().stream()
                .map(e -> e.getValue() * 100 / countDeadCharacters() + "% ")
                .forEach(System.out::println);
    }

    public Optional<String> getBookDieMostStarks() {
        return characters.stream()
                .filter(e -> e.getAllegiance().equals("Stark"))
                .filter(e -> !e.getDeathBook().isEmpty())
                .collect(Collectors.groupingBy(Character::getDeathBook, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();
    }

    public Optional<String> getBookDieMostLannisters() {
        return characters.stream()
                .filter(e -> e.getAllegiance().equals("Lannister"))
                .filter(e -> !e.getDeathBook().isEmpty())
                .collect(Collectors.groupingBy(Character::getDeathBook, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();
    }

    public Long getNumberDeadStarks() {
        return characters.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .filter(e -> e.getAllegiance().equals("Stark"))
                .count();
    }

    public Long getNumberDeadLannisters() {
        return characters.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .filter(e -> e.getAllegiance().equals("Lannister"))
                .count();
    }

    public boolean isAnybodyAlive() {
        return characters.stream()
                .anyMatch(e -> e.getDeathYear().isEmpty());
    }

    public boolean isIntroAndDeathChaptersSame() {
        return characters.stream()
                .anyMatch(e -> e.getDeathChapter().equals(e.getBookIntroChapter()));
    }

}
