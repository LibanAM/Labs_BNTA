package interfaces;

import teachers.Teacher;

import java.util.List;

public interface Schoolable {

    void addTeacher(Teacher teacher);
    List<Teacher> getTeachers();
    }

