package ejercicio04;

import java.util.ArrayList;

public class Factura {

    ArrayList<LineItems> listItem = new ArrayList<LineItems>();
    double dblPrecioTotal;
    Domicilio objDomicilio = new Domicilio("San Pedro", "Paraguay", "Loja", "Ecuador");

    public double getCantidadPago() {
        LineItems objlItems = new LineItems(10);
        dblPrecioTotal = objlItems.getPrecioTotal() + (objlItems.getPrecioTotal() * 0.14);
        return dblPrecioTotal;
    }

    @Override
    public String toString() {
        return "\n----Factura----\n" + "Precio Total: " + getCantidadPago() + "\n" + objDomicilio.toString();
    }

}
