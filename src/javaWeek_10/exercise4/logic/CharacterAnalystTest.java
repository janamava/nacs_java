package javaWeek_10.exercise4.logic;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class CharacterAnalystTest {

    private CharacterAnalyst characterAnalyst = new CharacterAnalyst();

    @Test
    void countCharacters() {
        long total = characterAnalyst.countCharacters();
        System.out.println(total);

    }

    @Test
    void countDeadCharacters(){
        Long deadCharacters = characterAnalyst.countDeadCharacters();
        System.out.println(deadCharacters);
    }
    @Test
    void countPercentage(){
        characterAnalyst.percentageDeadByGender();
    }

    @Test
    void getBiggestCountDeathsBook(){
        Optional<String> biggestCountDeathBook = characterAnalyst.getBiggestCountDeathBook();
        biggestCountDeathBook.ifPresent(System.out::println);
    }

    @Test
    void getNames(){
        List<String> namesOfDeadCharacters = characterAnalyst.getNamesOfDeadCharacters();
        namesOfDeadCharacters
                .forEach(System.out::println);
    }

    @Test
    void getAllegiances(){
        List<String> biggestDeathsCountAllegiances = characterAnalyst.find2BiggestDeathsCountAllegiances();
        biggestDeathsCountAllegiances
                .forEach(System.out::println);
    }


    @Test
    void getPercentageDeathInNobility() {
        characterAnalyst.getPercentageDeathInNobility();
    }

    @Test
    void getBookDieMostStarks() {

        Optional<String> bookDieMostStarks = characterAnalyst.getBookDieMostStarks();
        bookDieMostStarks.ifPresent(System.out::println);
    }

    @Test
    void getBookDieMostLannisters() {
        Optional<String> bookDieMostLannisters = characterAnalyst.getBookDieMostLannisters();
        bookDieMostLannisters.ifPresent(System.out::println);
    }

    @Test
    void getNumberDeadStarks() {
        Long numberDeadStarks = characterAnalyst.getNumberDeadStarks();
        System.out.println(numberDeadStarks);
    }

    @Test
    void getNumberDeadLannisters() {
        Long numberDeadLannisters = characterAnalyst.getNumberDeadLannisters();
        System.out.println(numberDeadLannisters);
    }

    @Test
    void isAnybodyAlive() {
        boolean anybodyAlive = characterAnalyst.isAnybodyAlive();
        System.out.println(anybodyAlive);
    }
    @Test
    void isIntroAndDeathChaptersSame() {
        boolean introAndDeathChaptersSame = characterAnalyst.isIntroAndDeathChaptersSame();
        System.out.println(introAndDeathChaptersSame);
    }

}
