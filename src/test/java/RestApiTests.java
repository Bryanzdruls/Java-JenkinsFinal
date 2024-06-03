import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class RestApiTests {

    @Test
    void contextLoads() {
        Assert.hasText("chimbo","peludo");
    }

}