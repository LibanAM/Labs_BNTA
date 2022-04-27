package subjects;

import schools.School;
import teachers.Teacher;

public class Maths extends Teacher {

    public Maths(String name, int age, int teacherId, int salary, String mainSubject, School employer) {
        super(name, age, teacherId, salary, mainSubject, employer);
    }

    public String mathsWork(){
        return "Teaching maths...";
    }
}
