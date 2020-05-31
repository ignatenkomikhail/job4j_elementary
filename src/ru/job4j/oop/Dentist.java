package ru.job4j.oop;

public class Dentist extends Doctor {
    private String experience;
    private String qualification;

    public Dentist(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Patient appointment(Seal seal) {
        return null;
    }
}
