package domain;

import java.util.ArrayList;

public class VisitingResarcher extends Instructor{

    private float hourlySalary;

    public VisitingResarcher( String name, String address, String phoneNumber, Course course, float hourlySalary) {
        super( name, address, phoneNumber, course);
        this.hourlySalary = hourlySalary;
    }

    public VisitingResarcher(String name, String address, String phoneNumber, ArrayList<Course> courses, float hourlySalary) {
        super(name, address, phoneNumber, courses);
        this.hourlySalary = hourlySalary;
    }

    public float getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(float hourlySalary) {
        this.hourlySalary = hourlySalary;
    }
}
