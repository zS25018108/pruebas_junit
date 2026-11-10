package uv.javc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    void sumarDosMasDosYRetornaCuatro() {
        int resultado = Calculadora.sumar(2, 2);
        assertEquals(4, resultado, "2 + 2 debe ser 4");
    }
}
