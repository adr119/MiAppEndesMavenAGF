package org.example;

import org.example.Farmacia.Farmacia;
import org.example.Farmacia.MedicamentoEspecializado;
import org.example.Farmacia.MedicamentoGenerico;

import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //se crea una farmacia y un random
        Farmacia farmacia = new Farmacia();
        Random random = new Random();

        //se añaden los medicamentos a la farmacia
        MedicamentoGenerico paracetamol = new MedicamentoGenerico("Paracetamol", 10.0);
        farmacia.agregarMedicamento(paracetamol, 100);

        String nombre1 = "Medicamento1";
        double precio1 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico1 = new MedicamentoGenerico(nombre1, precio1);
        farmacia.agregarMedicamento(medicamentoGenerico1, 100);

        String nombre2 = "Medicamento2";
        double precio2 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico2 = new MedicamentoGenerico(nombre2, precio2);
        farmacia.agregarMedicamento(medicamentoGenerico2, 100);

        String nombre3 = "Medicamento3";
        double precio3 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico3 = new MedicamentoGenerico(nombre3, precio3);
        farmacia.agregarMedicamento(medicamentoGenerico3, 100);

        // Medicamento 4
        String nombre4 = "Medicamento4";
        double precio4 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico4 = new MedicamentoGenerico(nombre4, precio4);
        farmacia.agregarMedicamento(medicamentoGenerico4, 100);

        String nombre5 = "Medicamento5";
        double precio5 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico5 = new MedicamentoGenerico(nombre5, precio5);
        farmacia.agregarMedicamento(medicamentoGenerico5, 100);

        // Medicamento 6
        String nombre6 = "Medicamento6";
        double precio6 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico6 = new MedicamentoGenerico(nombre6, precio6);
        farmacia.agregarMedicamento(medicamentoGenerico6, 100);

        String nombre7 = "Medicamento7";
        double precio7 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico7 = new MedicamentoGenerico(nombre7, precio7);
        farmacia.agregarMedicamento(medicamentoGenerico7, 100);

        String nombre8 = "Medicamento8";
        double precio8 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico8 = new MedicamentoGenerico(nombre8, precio8);
        farmacia.agregarMedicamento(medicamentoGenerico8, 100);

        String nombre9 = "Medicamento9";
        double precio9 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico9 = new MedicamentoGenerico(nombre9, precio9);
        farmacia.agregarMedicamento(medicamentoGenerico9, 100);

        String nombre10 = "Medicamento10";
        double precio10 = random.nextDouble() * 100;
        MedicamentoGenerico medicamentoGenerico10 = new MedicamentoGenerico(nombre10, precio10);
        farmacia.agregarMedicamento(medicamentoGenerico10, 100);

        MedicamentoEspecializado insulina = new MedicamentoEspecializado("Insulina", 50.0, "Diabetes");
        farmacia.agregarMedicamento(insulina, 20);


        String tipo1 = "Tipo1";
        MedicamentoEspecializado medicamentoEspecializado1 = new MedicamentoEspecializado(nombre1, precio1, tipo1);
        farmacia.agregarMedicamento(medicamentoEspecializado1, 20);


        String tipo2 = "Tipo2";
        MedicamentoEspecializado medicamentoEspecializado2 = new MedicamentoEspecializado(nombre2, precio2, tipo2);
        farmacia.agregarMedicamento(medicamentoEspecializado2, 20);


        String tipo3 = "Tipo3";
        MedicamentoEspecializado medicamentoEspecializado3 = new MedicamentoEspecializado(nombre3, precio3, tipo3);
        farmacia.agregarMedicamento(medicamentoEspecializado3, 20);

        String tipo4 = "Tipo4";
        MedicamentoEspecializado medicamentoEspecializado4 = new MedicamentoEspecializado(nombre4, precio4, tipo4);
        farmacia.agregarMedicamento(medicamentoEspecializado4, 20);

        String tipo5 = "Tipo5";
        MedicamentoEspecializado medicamentoEspecializado5 = new MedicamentoEspecializado(nombre5, precio5, tipo5);
        farmacia.agregarMedicamento(medicamentoEspecializado5, 20);

        String tipo6 = "Tipo6";
        MedicamentoEspecializado medicamentoEspecializado6 = new MedicamentoEspecializado(nombre6, precio6, tipo6);
        farmacia.agregarMedicamento(medicamentoEspecializado6, 20);

        String tipo7 = "Tipo7";
        MedicamentoEspecializado medicamentoEspecializado7 = new MedicamentoEspecializado(nombre7, precio7, tipo7);
        farmacia.agregarMedicamento(medicamentoEspecializado7, 20);

        String tipo8 = "Tipo8";
        MedicamentoEspecializado medicamentoEspecializado8 = new MedicamentoEspecializado(nombre8, precio8, tipo8);
        farmacia.agregarMedicamento(medicamentoEspecializado8, 20);
        ;
        String tipo9 = "Tipo9";
        MedicamentoEspecializado medicamentoEspecializado9 = new MedicamentoEspecializado(nombre9, precio9, tipo9);
        farmacia.agregarMedicamento(medicamentoEspecializado9, 20);


        String tipo10 = "Tipo10";
        MedicamentoEspecializado medicamentoEspecializado10 = new MedicamentoEspecializado(nombre10, precio10, tipo10);
        farmacia.agregarMedicamento(medicamentoEspecializado10, 20);

        //Se imprime el inventario de la farmacia
        farmacia.imprimirInventario();
    }


}

