import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GalleryTest {
    Gallery gallery;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("London Gallery",400);
    }

    @Test
    public void hasName(){
        assertThat(gallery.getName()).isEqualTo("London Gallery");
    }

    @Test
    public void hasTill(){
        assertThat(gallery.getTill()).isEqualTo(400);
    }

}
