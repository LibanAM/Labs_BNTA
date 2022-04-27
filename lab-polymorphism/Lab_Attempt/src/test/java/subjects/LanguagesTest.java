package subjects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import schools.School;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LanguagesTest {
    Languages languages;
    School school;
    private String marking;

    @BeforeEach
    public void setUp(){
        school = new School();
        languages = new Languages("Mike", 27, 21, 29000, "Language", school);
        languages.addLanguage("French");
    }

    @Test
    public void teachingLanguages(){
        assertThat(languages.languagesWork()).isEqualTo("Teaching languages...");
    }

    @Test
    public void markingLanguagesWork(){
        assertThat(languages.languagesWork(marking)).isEqualTo("Marking languages work...");
    }

    @Test
    public void canAddLanguages(){
        assertThat(languages.getLanguages().size()).isEqualTo(1);
    }
}
