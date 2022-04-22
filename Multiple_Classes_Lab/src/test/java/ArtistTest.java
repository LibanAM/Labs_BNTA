import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtistTest {
    Artist artist;
    Artwork picasso;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Picasso");
        picasso = new Artwork("Picasso 1", "Picasso", 100, 32);
    }

    @Test
    public void hasName(){
        assertThat(artist.getName()).isEqualTo("Picasso");
    }

    @Test
    public void canAddArtworksToArtist(){
        artist.addArtwork(picasso);
        assertThat(picasso.getArtist()).isEqualTo(artist.getName());
        assertThat(artist.getArtworks().size()).isEqualTo(1);
    }




}
