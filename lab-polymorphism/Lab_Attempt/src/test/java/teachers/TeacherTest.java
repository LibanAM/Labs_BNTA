package teachers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import schools.School;
import subjects.Languages;
import subjects.Maths;
import subjects.Physics;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TeacherTest {
    School school;
    Teacher teacher1;


    @BeforeEach
    public void setUp(){
        school = new School();
        school.addTeacher(new Maths("Mike Myers", 32, 10, 32000, "Maths", school));
        school.addTeacher(new Languages("Jason Vorhees", 40, 20, 41000, "Languages", school));
        school.addTeacher(new Physics("Freddy Krueger", 38, 30, 45000, "Physics", school));
        teacher1 = school.getTeachers().get(0);
    }

    @Test
    public void hasName(){
//        Teacher teacher1 = school.getTeachers().get(0);
        assertThat(teacher1.getName()).isEqualTo("Mike Myers");
    }

    @Test
    public void hasAge(){
//        Teacher teacher1 = school.getTeachers().get(0);
        assertThat(teacher1.getAge()).isEqualTo(32);
    }

    @Test
    public void hasTeacherId(){
//        Teacher teacher1 = school.getTeachers().get(0);
        assertThat(teacher1.getTeacherId()).isEqualTo(10);
    }

    @Test
    public void hasSalary(){
//        Teacher teacher1 = school.getTeachers().get(0);
        assertThat(teacher1.getSalary()).isEqualTo(32000);
    }

    @Test
    public void canAddTeachers(){
        assertThat(school.getTeachers().size()).isEqualTo(3);
    }

}
