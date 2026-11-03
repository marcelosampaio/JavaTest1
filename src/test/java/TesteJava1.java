import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class TesteJava1 {
    @Test
    public void test() {
        Assertions.assertEquals(2, 1 + 1);
        System.out.println("Test passed!");
    }
}