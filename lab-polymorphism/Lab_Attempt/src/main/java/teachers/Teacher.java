package teachers;

import schools.School;

import java.util.ArrayList;
import java.util.List;

public abstract class Teacher {
    private String name;
    private int teacherId;
    private int age;
    private int salary;
    protected School school;
    List<Teacher> teachers;

    public Teacher(String name, int age, int teacherId, int salary, School employer) {
        this.name = name;
        this.age = age;
        this.teacherId = teacherId;
        this.salary = salary;
        this.setSchool(employer);

    }

    public void setSchool(School employer){
        this.school = employer;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public int getAge() {
        return age;
    }



}
