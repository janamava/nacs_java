package javaWeek_4.exercise12;

public class GotApplication {
    public static void main(String[] args) {
        CharacterReader reader = new CharacterReader();
        reader.getCharacters("files/got-characters.csv");




    }
}
//Create the GotApplication class that has a main method that uses the CharacterReader
// to read the got-characters.csv
// and performs the code that answers the previously given questions.

//How many characters appear in the books in total?
//How many characters died?
//Display the overall percentage of men and women that died in all books.
//Which book has the biggest death count with how many?
//Who died in that book?

/*
Number of characters: 917
Number of dead characters: 307
Dead men: 271 | Dead women: 36
Dead men: 88% | Dead women: 11%
Book: 3 | Deaths: 97
Book: 2 | Deaths: 73
Book: 5 | Deaths: 61
Book: 1 | Deaths: 49
Book: 4 | Deaths: 27
Book with the most dead counts is book 3 with 97 deaths
Characters who died in book number 3:
{name : Aegon Frey (Jinglebell) | book of death : 3 | gender : man}
{name : Alyn | book of death : 3 | gender : man}
{name : Anvil Ryn | book of death : 3 | gender : man}
{name : Bannen | book of death : 3 | gender : man}
{name : Becca the Baker | book of death : 3 | gender : woman}

 */