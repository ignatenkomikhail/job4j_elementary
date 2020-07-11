package ru.job4j.stream;

import java.util.Objects;

public class Student {
    private int score;
    private String surname;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    public Student(String surname, int score) {
        this.score = score;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return this.score == student.score
                && this.surname.equals(student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.score, this.surname);
    }

    @Override
    public String toString() {
        return "Student{"
                + "score=" + score
                + ", surname='" + surname + '\''
                + '}';
    }
}
