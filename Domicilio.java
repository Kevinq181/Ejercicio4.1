package ejercicio04;

public class Domicilio {

    private String strNombre;
    private String strCalle;
    private String strCiudad;
    private String strEstado;

    public Domicilio(String strNombre, String strCalle, String strCiudad, String strEstado) {
        this.strNombre = strNombre;
        this.strCalle = strCalle;
        this.strCiudad = strCiudad;
        this.strEstado = strEstado;
    }

    @Override
    public String toString() {
        return "----Domicilio----\n" + "Nombre: " + strNombre + "\nCalle: " + strCalle + "\nCiudad: " + strCiudad + "\nEstado: " + strEstado + "\n";
    }
    
    

}
