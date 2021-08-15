package domain;

import java.util.ArrayList;

public class PermanentInstructor extends Instructor{

    private float fixedSalary;

    public PermanentInstructor(String name, String address, String phoneNumber, Course course, float fixedSalary) {
        super(name, address, phoneNumber, course);
        this.fixedSalary = fixedSalary;
    }

    public PermanentInstructor(String name, String address, String phoneNumber, ArrayList<Course> courses, float fixedSalary) {
        super(name, address, phoneNumber, courses);
        this.fixedSalary = fixedSalary;
    }

    public float getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(float fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
}
