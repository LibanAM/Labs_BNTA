import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtistTest {
    Artist artist;
    Artwork picasso;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Mr.Painter");
        picasso = new Artwork("Painting 1", "Mr.Painter", 400, 32);
    }

    @Test
    public void hasName(){
        assertThat(artist.getName()).isEqualTo("Mr.Painter");
    }

    @Test
    public void canAddArtworksToArtist(){
        artist.addArtwork(picasso);
        assertThat(artist.getArtworks().size()).isEqualTo(1);
    }




}
