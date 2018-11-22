package groupProjects.romeEncryption;

public class Letter {

    private String name;
    private Integer number;

    public Letter(String name, Integer position) {
        this.name = name;
        this.number = position;
    }

    public String getName() {
        return name;
    }

    public Integer getPosition() {
        return number;
    }
}
