package clasesAbstractas.domain;

public class Rectangulo extends FiguraGeometrica{
    public Rectangulo(String tipoDeFigura){
        super(tipoDeFigura);

    }
    public void dibujar(){
        //agregamos el comportamiento del metodo abstracto
        System.out.println("aqui deberiamos dibujar"+this.getClass().getSimpleName());
    }
}
