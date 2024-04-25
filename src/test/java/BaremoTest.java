import org.example.Baremo.Baremo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaremoTest {
    public String NO_VALIDO = "Dato no valido";
    public String ADJUDICADA = "Adjudicada";
    public String NO_ADJ = "No adjudicada";
    @Test
    void testAdjudicadoONo() {
        String dni = "1234567A";
        Assertions.assertEquals(NO_ADJ, Baremo.comprobarBaremo(dni, 4));
        assertEquals(ADJUDICADA, Baremo.comprobarBaremo(dni, 9));
    }
    @Test
    void testNoValidos (){
        assertEquals(NO_VALIDO, Baremo.comprobarBaremo("123456A", 2));
        assertEquals(NO_VALIDO, Baremo.comprobarBaremo("1234567890A", 2));
        assertEquals(NO_VALIDO, Baremo.comprobarBaremo("1234ABC5", 2));
        assertEquals(NO_VALIDO, Baremo.comprobarBaremo("ABCD12345", 6));
        assertEquals(NO_VALIDO, Baremo.comprobarBaremo("1234567A", -5));
        assertEquals(NO_VALIDO, Baremo.comprobarBaremo("1234567A", 20));
    }

}