package subjects;

import schools.School;
import teachers.Teacher;

public class Physics extends Teacher {

    public Physics(String name, int age, int teacherId, int salary, String mainSubject, School employer) {
        super(name, age, teacherId, salary, mainSubject, employer);
    }

    public String physicsWork() {
        return "Teaching physics...";
    }

    public String physicsWork(String marking) {
        marking = "Marking physics...";
        return marking;

    }
}
