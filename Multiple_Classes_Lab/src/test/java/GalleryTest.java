import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GalleryTest {
    Gallery gallery;
    Artwork picasso;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("London Gallery");
        picasso = new Artwork("Painting 1","Mr.Painter", 100, 32);
    }

    @Test
    public void hasName(){
        assertThat(gallery.getName()).isEqualTo("London Gallery");
    }

    @Test
    public void hasTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void canAddArtworksToGallery(){
        gallery.addArtwork(picasso);
        assertThat(gallery.getArtworks().size()).isEqualTo(1);
    }

    @Test
    public void canSetTill(){
        gallery.setTill(100);
        assertThat(gallery.getTill()).isEqualTo(100);
    }

//    @Test
//    public void canAddArtwork(){
//        assertThat(gallery.getGalleries().size()).isEqualTo(2);
//    }
}
