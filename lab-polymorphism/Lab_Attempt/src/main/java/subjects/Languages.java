package subjects;

import schools.School;
import teachers.Teacher;

import java.util.List;

public class Languages extends Teacher {
    List<String> languages;

    public Languages(String name, int age, int teacherId, int salary, String mainSubject, School employer) {
        super(name, age, teacherId, salary, mainSubject, employer);
    }

    public String languagesWork() {
        return "Teaching languages...";
    }

    public void addLanguage(String language) {
        this.languages.add(language);
    }
}
