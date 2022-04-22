import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtworkTest {
    Artwork artwork;


    @BeforeEach
    public void setUp(){
        artwork = new Artwork("Painting 1", "Mr.Painter", 100, 32);
    }

    @Test
    public void hasName(){
        assertThat(artwork.getTitle()).isEqualTo("Painting 1");
    }

    @Test
    public void hasArtist(){
        assertThat(artwork.getArtist()).isEqualTo("Mr.Painter");
    }

    @Test
    public void hasPrice(){
        assertThat(artwork.getPrice()).isEqualTo(100);
    }

    @Test
    public void hasNFT(){
        assertThat(artwork.getNft()).isEqualTo(32);
    }

}
