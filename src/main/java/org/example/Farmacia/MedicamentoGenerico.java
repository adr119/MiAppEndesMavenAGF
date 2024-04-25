package org.example.Farmacia;

public class MedicamentoGenerico {

    private String nombre;
    private double precio;

    /**
     * Constructor del MedicamentoGenerico
     * @param nombre nombre del medicamento
     * @param precio precio del medicamento
     */
    public MedicamentoGenerico(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo toString
     * @return String toString del MedicamentoGenerico
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentoGenerico{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}

