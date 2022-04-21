import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    Customer customer;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Mr.Customer", 200);
    }

    @Test
    public void hasName(){
        assertThat(customer.getName()).isEqualTo("Mr.Customer");
    }

    @Test
    public void hasWallet(){
        assertThat(customer.getWallet()).isEqualTo(200);
    }

}
