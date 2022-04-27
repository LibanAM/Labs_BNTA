package subjects;

import schools.School;
import teachers.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Languages extends Teacher {
    List<String> languages;

    public Languages(String name, int age, int teacherId, int salary, String mainSubject, School employer) {
        super(name, age, teacherId, salary, mainSubject, employer);
        languages = new ArrayList<>();
    }

    public String languagesWork() {
        return "Teaching languages...";
    }

    public String languagesWork(String marking) {
        marking = "Marking languages work...";
        return marking;
    }

    public void addLanguage(String language) {
        this.languages.add(language);
    }

    public List<String> getLanguages() {
        return languages;
    }
}
