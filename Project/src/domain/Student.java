package domain;

import enums.Gender;

import javax.persistence.*;
import java.util.ArrayList;

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String birthDate;
    private String Address;
    private Gender gender;

    @ManyToMany
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(String name, String birthDate, String address, Gender gender) {
        this.name = name;
        this.birthDate = birthDate;
        Address = address;
        this.gender = gender;
    }
}
