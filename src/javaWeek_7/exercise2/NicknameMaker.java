package javaWeek_7.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NicknameMaker {

    public List<String> createNicknames(List<String> words) {

        List<String> nicknames = new ArrayList<>();
        for (String word : words) {
            Optional<String> nickname = createNickname(word);
            if (nickname.isPresent()){
                nicknames.add(nickname.get());
            }
        }
        return nicknames;
    }

    private Optional<String> createNickname(String word){
        if (word.equals("")){
            return Optional.empty();
        }
        if (word.length() < 2){
            return Optional.of(word);
        }
        Integer lastPosition = word.length() / 2;
        String nickname = word.substring(0, lastPosition);
        return Optional.of(nickname);
    }
}
