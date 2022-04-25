package schools;

import teachers.Teacher;

import java.util.ArrayList;
import java.util.List;

public class School {
    List<Teacher> teachers;

    public School(){
        teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}
