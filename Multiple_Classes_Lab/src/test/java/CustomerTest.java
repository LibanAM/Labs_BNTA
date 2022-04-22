import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    Customer customer;
    Gallery gallery;
    Artwork picasso;
    Artwork vanGogh;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Mr.Customer", 500);
        gallery = new Gallery("London Gallery", 0);
        picasso = new Artwork("Picasso 1", "Picasso", 100, 32);
        vanGogh = new Artwork("Van Gogh 1", "Van Gogh", 200, 16);
        gallery.addArtwork(picasso);
        gallery.addArtwork(vanGogh);
    }

    @Test
    public void hasName(){
        assertThat(customer.getName()).isEqualTo("Mr.Customer");
    }

    @Test
    public void hasWallet(){
        assertThat(customer.getWallet()).isEqualTo(500);
    }

//    @Test
//    public void hasWallet(){
//        assertThat(customer.getWallet()).isEqualTo(200);
//    }

    @Test
    public void hasEnoughInWallet(){
        assertThat(customer.getWallet()).isGreaterThanOrEqualTo(300);
    }


    @Test
    public void canPurchaseArtwork(){
        customer.purchaseArtworks(gallery);
        assertThat(customer.getWallet()).isEqualTo(200);
    }

}
