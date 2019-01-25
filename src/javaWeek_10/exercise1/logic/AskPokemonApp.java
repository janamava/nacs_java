package javaWeek_10.exercise1.logic;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class AskPokemonApp {

    public static void main(String[] args) {

        AskPokemon askPokemon = new AskPokemon();

        Long totalPokemons = askPokemon.countTotalPokemons();
        System.out.println(totalPokemons);

        Set<String> uniqueType1 = askPokemon.getUniqueType1();
        System.out.println(uniqueType1);

        Optional<String> pokemonWithLongestName = askPokemon.findPokemonWithLongestName();
        if(pokemonWithLongestName.isPresent()){
            System.out.println(pokemonWithLongestName.get());
        }

        Optional<String> pokemonWithShortestName = askPokemon.findPokemonWithLongestName();
        if(pokemonWithShortestName.isPresent()){
            System.out.println(pokemonWithShortestName.get());
        }

    }
}
