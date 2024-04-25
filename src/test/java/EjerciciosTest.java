import org.example.CajaBlanca.Ejercicios;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjerciciosTest {
    @Test
    public void testEjercicio2(){
        Assertions.assertEquals(-1, Ejercicios.ejercicio2(-1,2,3));
        assertEquals(-1, Ejercicios.ejercicio2(2,3,1));
        assertEquals(-1, Ejercicios.ejercicio2(2,6,3));
        assertEquals(1, Ejercicios.ejercicio2(2,6,1));
    }
    @Test
    public void testEjercicio3(){
        assertEquals(1, Ejercicios.ejercicio3(1,0,0));
        assertEquals(2, Ejercicios.ejercicio3(1,0,2));
        assertEquals(2, Ejercicios.ejercicio3(1,2,0));
        assertEquals(1, Ejercicios.ejercicio3(1,1,1));
    }
    @Test
    public void testEjercicio4(){
        assertEquals(0, Ejercicios.ejercicio4(new char[0], 'a'));
        assertEquals(0, Ejercicios.ejercicio4(new char[]{'a'}, 'b'));
        assertEquals(1, Ejercicios.ejercicio4(new char[]{'a'}, 'a'));
        assertEquals(1, Ejercicios.ejercicio4(new char[]{'a','b'}, 'a'));
    }
}