package clasesAbstractas.domain;

public abstract class FiguraGeometrica {
    protected String tipoDeFigura;

    protected FiguraGeometrica(String tipoDeFigura){
        this.tipoDeFigura=tipoDeFigura;

    }
    //la clase abstracta no define los metodos, son las clases hijas
    public abstract void dibujar();

    public String getTipoDeFigura() {
        return tipoDeFigura;
    }

    public void setTipoDeFigura(String tipoDeFigura) {
        this.tipoDeFigura = tipoDeFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "tipoDeFigura='" + tipoDeFigura + '\'' +
                '}';
    }
}
