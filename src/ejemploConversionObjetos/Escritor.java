package ejemploConversionObjetos;

public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura=tipoEscritura;
    }

    @Override
    public String toString() {
        return "Escritor{" +
                "tipoEscritura=" + tipoEscritura.getDescripcion() +
                "} " + super.toString();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
    public String getDescripcion() {
        return tipoEscritura.getDescripcion();
    }
}
