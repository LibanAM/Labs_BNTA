package teachers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import subjects.Maths;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TeacherTest {
    Teacher teacher;


    @BeforeEach
    public void setUp(){
        teacher = new Maths("Mike Myers", 32, 10, 32000);
    }

    @Test
    public void hasName(){
        assertThat(teacher.getName()).isEqualTo("Mike Myers");
    }

    @Test
    public void hasAge(){
        assertThat(teacher.getAge()).isEqualTo(32);
    }

    @Test
    public void hasTeacherId(){
        assertThat(teacher.getTeacherId()).isEqualTo(10);
    }

    @Test
    public void hasSalary(){
        assertThat(teacher.getSalary()).isEqualTo(32000);
    }
}
