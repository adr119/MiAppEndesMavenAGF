import org.example.Calculadora.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest2 {
    @Test
    public void testRestar1() {
        Assertions.assertEquals(-2, Calculadora.restar(2, 4));
    }

    @Test
    public void testRestar2() {
        assertEquals(0, Calculadora.restar(6, 6));
    }

    @Test
    public void testRestar3() {
        assertEquals(3, Calculadora.restar(5, 2));
    }

    @Test
    public void testDividir1() {
        assertEquals(1, Calculadora.dividir(4, 4));
    }

    @Test
    public void testDividir2() {
        assertEquals(1, Calculadora.dividir(3, 2));
    }

    @Test
    public void testDividir3() {
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir(4, 0));
    }

    @Test
    public void testDividir4() {
        assertAll("Juntado Test",
                () -> assertEquals(1, Calculadora.dividir(4, 4)),
                () -> assertEquals(1, Calculadora.dividir(3, 2))
        );
    }

    @Test
    public void tesDividir5() {
        assertTrue(Calculadora.dividir(6,2) == 3);
    }
}