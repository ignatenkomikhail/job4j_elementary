package ru.job4j.oop;

public class Engineer extends Profession {

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Scheme development(Task task) {
        return null;
    }

    public boolean realisation(Scheme scheme) {
        return false;
    }
}
