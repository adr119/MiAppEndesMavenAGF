package org.example.CajaBlanca;

public class Ejercicios {
    public static int ejercicio2(int a, int b, int c) {
        int x = 0;
        if (a > 1 && (b > 5) && (c < 2)) {
            x = x + 1;
        } else
            x = x - 1;
        return x;
    }

    public static int ejercicio3(int x, int y, int z) {
        int max = x;
        if (x > y && x > z)
            max = x;
        else if (z > y)
            max = z;
        else
            max = y;
        return max;
    }

    public static int ejercicio4(char[] cadena, char letra) {
        int contador, n, lon;
        n = 0;
        contador = 0;
        lon = cadena.length;
        if (lon > 0) {
            do {
                if (cadena[contador] == letra)
                    n++;
                contador++;
                lon--;
            } while (lon > 0);
        }
        return n;
    }

}
