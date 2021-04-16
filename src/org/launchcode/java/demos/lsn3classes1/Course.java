package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Course {

    private int catalogNumber;
    private String title;
    private String instructor;
    private int credits;
    private int classSize;
    private ArrayList<String> classDays;
    private ArrayList<Student> roster;

    public Course (int catalogNumber, String title, String instructor, int credits,
                   int classSize, ArrayList<String> classDays, ArrayList<Student> roster) {
        this.catalogNumber = catalogNumber;
        this.title = title;
        this.instructor = instructor;
        this.credits = credits;
        this.classSize = classSize;
        this.classDays = classDays;
        this.roster = roster;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return title.equals(course.title) && instructor.equals(course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, instructor);
    }

    @Override
    public String toString() {
        return "Course{" +
                "catalogNumber=" + catalogNumber +
                ", title='" + title + '\'' +
                ", instructor='" + instructor + '\'' +
                ", credits=" + credits +
                ", classSize=" + classSize +
                ", classDays=" + classDays +
                ", roster=" + roster +
                '}';
    }
}
