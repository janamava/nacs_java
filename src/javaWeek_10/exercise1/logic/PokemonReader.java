package javaWeek_10.exercise1.logic;

import fileReader.FileReader;
import javaWeek_10.exercise1.model.Pokemon;

import java.util.List;
import java.util.stream.Collectors;

public class PokemonReader {

    public List<Pokemon> convertToPokemon() {
        return new FileReader().asStream("javaWeek_10/exercise1/data/pokemon.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Pokemon(e[1], e[2], e[4], e[5], e[6], e[7], e[10], e[11], e[12]))
                .collect(Collectors.toList());
    }
}
