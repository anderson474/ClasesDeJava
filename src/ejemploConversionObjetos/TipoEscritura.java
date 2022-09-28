package ejemploConversionObjetos;

public enum TipoEscritura {
    CLASICO("Escritura a mano"),
    MODERNO("Escritura por computador");

    private final String descripcion;


    private TipoEscritura(String descripcion){
        this.descripcion=descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
