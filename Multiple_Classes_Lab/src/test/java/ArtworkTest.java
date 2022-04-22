import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtworkTest {
    Artwork picasso;


    @BeforeEach
    public void setUp(){
        picasso = new Artwork("Picasso 1", "Picasso", 100, 32);
    }

    @Test
    public void hasName(){
        assertThat(picasso.getTitle()).isEqualTo("Picasso 1");
    }

    @Test
    public void hasArtist(){
        assertThat(picasso.getArtist()).isEqualTo("Picasso");
    }

    @Test
    public void hasPrice(){
        assertThat(picasso.getPrice()).isEqualTo(100);
    }

    @Test
    public void hasNFT(){
        assertThat(picasso.getNft()).isEqualTo(32);
    }

}
