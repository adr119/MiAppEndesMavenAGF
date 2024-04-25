import org.example.Calculadora.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCalculadora {

    @Test
    public void testRestar() {
        Assertions.assertEquals(5, Calculadora.restar(10, 5));
        assertEquals(1, Calculadora.restar(6, 5));
        assertEquals(6, Calculadora.restar(8, 2));
    }
}