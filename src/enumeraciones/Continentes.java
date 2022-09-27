package enumeraciones;

public enum Continentes {
    AFRICA(54),
    ASIA(36),
    EUROPA(44),
    AMERICA(10);


    //atributo de paises
    private final int paises;

    //constructor
    Continentes(int paises){
        this.paises = paises;
    }

    public int getPaises() {
        return paises;
    }
}
