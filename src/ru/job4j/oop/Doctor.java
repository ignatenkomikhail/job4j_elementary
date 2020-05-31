package ru.job4j.oop;

public class Doctor extends Profession {

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Diagnose inspection(Patient patient) {
        return null;
    }

    public boolean heal(Diagnose diagnose) {
        return false;
    }
}
