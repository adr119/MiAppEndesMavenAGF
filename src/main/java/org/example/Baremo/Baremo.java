package org.example.Baremo;

public class Baremo {
    public static final String NO_VALIDO = "Dato no valido";
    public static final String ADJUDICADA = "Adjudicada";
    public static final String NO_ADJ = "No adjudicada";

    public static String comprobarBaremo(String dni, int baremo) {
        for (int i = 0; i < dni.length() - 1; i++) {
            if (!Character.isDigit(dni.charAt(i))) {
                return NO_VALIDO;
            }
        }
        if (!Character.isAlphabetic(dni.charAt(dni.length() - 1))) {
            return NO_VALIDO;
        }
        if (dni.length() > 9 || dni.length() < 8) {
            return NO_VALIDO;
        }
        if (baremo > 10) return NO_VALIDO;
        if (baremo > 5) return ADJUDICADA;
        if (baremo >= 0) return NO_ADJ;
        return NO_VALIDO;
    }
}
