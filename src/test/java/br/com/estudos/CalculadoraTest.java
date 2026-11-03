import br.com.estudos.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void somarTeste() {
        // Given
        Calculadora calculadora = new Calculadora();
        // When
        int resultado = calculadora.somar(1, 1);
        // Then
        Assertions.assertEquals(2, resultado);
    }
}
