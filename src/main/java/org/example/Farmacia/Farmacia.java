package org.example.Farmacia;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Farmacia {
    private Map<MedicamentoGenerico, Integer> inventario;

    public Farmacia() {
        this.inventario = new HashMap<>();
    }

    public Map<MedicamentoGenerico, Integer> getInventario() {
        return inventario;
    }
    public void setInventario(Map<MedicamentoGenerico, Integer> inventario) {
        this.inventario = inventario;
    }

    // Metodo para agregar medicamento generico //

    /**
     * Agrega un medicamento al inventario de la farmacia, en caso de que ya existiese suma las cantidades (nueva y pasada) de stock
     * @param medicamento medicamento a agregar
     * @param cantidad cantidad a agragar o iniciar en el inventario
     */
    public void agregarMedicamento(MedicamentoGenerico medicamento, int cantidad) {

        if (inventario.containsKey(medicamento)) {
            int cantidadExistente = inventario.get(medicamento);
            inventario.put(medicamento, cantidadExistente + cantidad);
        } else {
            inventario.put(medicamento, cantidad);
        }
    }
    //

    /**
     * Imprime el inventario de la farmacia
     */
    public void imprimirInventario (){
        System.out.println("Inventario de la farmacia:");
        var entradas = getInventario().entrySet();
        for (Map.Entry<MedicamentoGenerico, Integer> entry : entradas) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " unidades");
        }
    }

}