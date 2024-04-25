import org.example.Arrays.MisArrays;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MisArraysTest {
    @Order(1)
    @Test
    void testDecrementar() {
        MisArrays arra = new MisArrays();
        arra.decrementar(array1, 1);
        assertArrayEquals(array1, new int[]{1, 3, 4});
    }
    @Order(3)
    @Test
    void testSumar() {
        MisArrays arra = new MisArrays();
        assertArrayEquals(resul, arra.sumar(array1, array2));
    }
    @Order(2)
    @Test
    void testSumar2() {
        MisArrays arra = new MisArrays();
        assertArrayEquals(resul2, arra.sumar(array3, array4));
    }

    @BeforeAll
    static void iniciar() {
        array1 = new int[]{2, 4, 5};
        array2 = new int[]{1, 1, 1};
        resul = new int[]{3, 5, 6};
        array3 = new int[]{2, 4, 5, 1, 1};
        array4 = new int[]{1, 1, 1, 1, 1};
        resul2 = new int[]{3, 5, 6, 2, 2};
    }

    static int[] array1, array2, resul, array3, array4, resul2;


    @BeforeEach
    void iniciar2() {
        array1= new int[]{2,4,5};
        array2= new int[]{1,1,1};
        resul= new int[]{3,5,6};
    }
    @AfterAll
    static void finalizar(){
        System.out.println("Fin de los test");
    }
    @AfterEach
    void finalizar2(){
        System.out.println("Fin de un test");
    }


}