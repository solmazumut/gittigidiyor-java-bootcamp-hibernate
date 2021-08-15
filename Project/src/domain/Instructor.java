package domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public  class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    protected String name;
    protected String address;
    protected String phoneNumber;

    @OneToMany(mappedBy = "Instructor")
    protected ArrayList<Course> courses = new ArrayList<>();

    public Instructor(String name, String address, String phoneNumber, Course course) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.courses = new ArrayList<>(Arrays.asList(course));
    }

    public Instructor(String name, String address, String phoneNumber, ArrayList<Course> courses) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.courses = courses;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}