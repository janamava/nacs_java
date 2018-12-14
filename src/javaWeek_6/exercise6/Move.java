package javaWeek_6.exercise6;

import java.util.List;

public abstract class Move {

    public abstract List<String> getDefeats();
    public abstract String getName();

    public Boolean defeats(Move move){
        return getDefeats().contains(move.toString());
    }
}
