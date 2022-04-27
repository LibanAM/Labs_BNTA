package schools;

import interfaces.Schoolable;
import teachers.Teacher;

import java.util.ArrayList;
import java.util.List;

public class School implements Schoolable {
    List<Teacher> teachers;

    public School(){
        teachers = new ArrayList<>();
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public List<Teacher> getTeachers() {
        return teachers;
    }

}
