package ejercicio04;

import java.util.ArrayList;

public class LineItems {

    public int intCantidad;

    double dblPrecioTotal;

    ArrayList<Producto> listProducto = new ArrayList<Producto>();

    public LineItems(int intCantidad) {
        this.intCantidad = intCantidad;

    }

    public double getPrecioTotal() {
        Producto objProducto = new Producto("Leche", 1.5);
        this.dblPrecioTotal =  objProducto.getDblPrecio() * this.intCantidad;

        return dblPrecioTotal;

    }

    @Override
    public String toString() {
        return "----Items----\n" + "Cantidad: " + intCantidad + "\nPrecio Total: " + getPrecioTotal();
    }

}
