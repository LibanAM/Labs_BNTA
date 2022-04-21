import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtistTest {
    Artist artist;
    Artwork artwork;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Ben");
        artwork = new Artwork("Painting 1", "Ben", 400, 32);
    }

    @Test
    public void hasName(){
        assertThat(artist.getName()).isEqualTo("Ben");
    }




}
