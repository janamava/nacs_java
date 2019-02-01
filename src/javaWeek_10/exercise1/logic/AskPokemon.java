package javaWeek_10.exercise1.logic;

import javaWeek_10.exercise1.model.Pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class AskPokemon {

    private List<Pokemon> pokemons = new PokemonReader().convertToPokemon();


    public Integer countTotalPokemons() {
        return pokemons.size();
                //.count();
    }

    public Set<String> getUniqueType1() {
        return pokemons.stream()
                .map(Pokemon::getType1)
                .collect(Collectors.toSet());
    }

    public Optional<String> findPokemonWithLongestName() {
        return pokemons.stream()
                .map(Pokemon::getName)
                .max(Comparator.comparing(String::length));
    }

    public Optional<String> findPokemonWithShortestName() {
        return pokemons.stream()
                .map(Pokemon::getName)
                .max(Comparator.comparing(String::length).reversed());
    }
}


//collect with Collectors.toList
//collect with Collectors.toSet*
//collect with Collectors.grouppingBy and Collectors.counting
//collect with Collectors.grouppingBy and Collectors.toList
//sorted
//sorted with Comparator
//limit
//filter
//count*
//forEach
//findFirst
//noneMatch
//anyMatch
//allMatch
//flatMap
//reduce
