package evaluations.week10;

import java.util.List;

public class StatisticianApp {

    public static void main(String[] args) {

        Statistician statistician = new Statistician();

        Integer integer = statistician.countTotalWords();
        System.out.println(integer);

        Long unique = statistician.countDistinctWords();
        System.out.println(unique);

        List<String> words = statistician.mostAppearingFiveWords();
        System.out.println(words);

        List<String> letters = statistician.mostAppearingFiveLetters();
        System.out.println(letters);

        Long numberAliceAppears = statistician.countAliceAppears();
        System.out.println(numberAliceAppears);

    }
}
/*
Number of words: 30355
Number of distinct words: 3433
Longest words: [unenforceability]
Most appearing 5 words:
1816 | the
940 | and
805 | to
690 | a
628 | of
Most appearing 5 letters:
15396 | e
12204 | t
9804 | a
9480 | o
8634 | i
Alice appearances: 398

 */