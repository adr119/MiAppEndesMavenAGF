package org.example.Farmacia;

public class MedicamentoEspecializado extends MedicamentoGenerico {
    private String tipo;

    /**
     * Constructor del MedicamentoEspecializado
     * @param nombre nombre del medicamento
     * @param precio precio del medicamento
     * @param tipo tipo de medicamento especializado
     */
    public MedicamentoEspecializado(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    /**
     * Metodo toString
     * @return String toString con todos los atributos de la clase
     */
    public String toString() {
        return "Nombre: " + getNombre() + ", Precio: " + getPrecio() + ", Tipo: " + tipo;
    }
}
