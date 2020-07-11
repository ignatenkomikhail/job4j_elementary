package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullname("Ivan Ivanov");
        student.setGroup("142");
        student.setAdmission(new Date());
        System.out.println(student.getFullname()
                + " is studying in group № " + student.getGroup()
                + ". Date of enrollment " + student.getAdmission() + ".");
    }
}
