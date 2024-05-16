import com.keyin.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testActiveByDefault(){
        Assertions.assertTrue(new Car().isActive());
    }
}
