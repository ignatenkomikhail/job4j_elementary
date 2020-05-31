package ru.job4j.oop;

public class Builder extends Engineer {
    private Plan plan;

    public Builder(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Wall construction(Brick brick, Grout grout) {
        return null;
    }
    public Roof make(Wood wood) {
        return null;
    }
}
