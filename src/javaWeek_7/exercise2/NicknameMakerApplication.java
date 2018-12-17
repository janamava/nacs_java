package javaWeek_7.exercise2;

import java.util.List;

public class NicknameMakerApplication {

    public static void main(String[] args) {

        List<String> nicknames = new NicknameMaker().createNicknames(Nicknames.words);
        System.out.println(nicknames);

    }
}
