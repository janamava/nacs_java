package javaWeek_10.exercise1.model;

public class Pokemon {

    private String name;
    private String type1;
    private String total;
    private String HP;
    private String attack;
    private String defense;
    private String speed;
    private String generation;
    private String legendary;

    public Pokemon(String name, String type1, String total, String HP, String attack,
                   String defense, String speed, String generation, String legendary) {
        this.name = name;
        this.type1 = type1;
        this.total = total;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;
    }

    public String getName() {
        return name;
    }

    public String getType1() {
        return type1;
    }

    public String getTotal() {
        return total;
    }

    public String getHP() {
        return HP;
    }

    public String getAttack() {
        return attack;
    }

    public String getDefense() {
        return defense;
    }

    public String getSpeed() {
        return speed;
    }

    public String getGeneration() {
        return generation;
    }

    public String getLegendary() {
        return legendary;
    }
}
//#	Name	Type 1	Type 2	Total	HP	Attack	Defense	Sp. Atk	Sp. Def	Speed	Generation	Legendary
//1	Bulbasaur	Grass	Poison	318	45	49	49	65	65	45	1	False