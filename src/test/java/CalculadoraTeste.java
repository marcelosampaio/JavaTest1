import br.com.estudos.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
    @Test
    public void testSomar() {
        Calculadora calculadora = new Calculadora();
        Assertions.assertEquals(2, calculadora.somar(1, 1));
        System.out.println("testSomar passed!");
    }
}
