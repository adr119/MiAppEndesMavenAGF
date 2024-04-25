package org.example.Calculadora;

public class Calculadora {
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int dividir(int num1, int num2) throws ArithmeticException {
       if (num2 == 0) throw new ArithmeticException();
       return num1 / num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static boolean esPar(int num1) {
        return num1 % 2 == 0 && num1 != 0;
    }
    public static boolean esImpar(int num1) {
        return num1 % 2 == 1;
    }
}
