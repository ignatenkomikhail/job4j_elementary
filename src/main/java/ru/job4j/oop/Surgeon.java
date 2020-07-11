package ru.job4j.oop;

public class Surgeon extends Doctor {
    private String speciality;
    private int salary;

    public Surgeon(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Patient operation(Map hospital) {
        return null;
    }
}
