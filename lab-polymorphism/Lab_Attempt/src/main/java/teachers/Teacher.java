package teachers;

import java.util.ArrayList;
import java.util.List;

public abstract class Teacher {
    private String name;
    private int teacherId;
    private int age;
    private int salary;
    List<Teacher> teachers;

    public Teacher(String name, int age, int teacherId, int salary) {
        this.name = name;
        this.age = age;
        this.teacherId = teacherId;
        this.salary = salary;
        teachers = new ArrayList<>();
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

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

}
