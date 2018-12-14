package javaWeek_6.exercise6;

import java.util.Arrays;
import java.util.List;

public class Players {

    public static List<Player> getPlayers(){
        return Arrays.asList(new Human(), new Computer());
    }
}
