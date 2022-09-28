package clasesAbstractas.domain;

public class Triangulo extends FiguraGeometrica{
    public Triangulo(String tipoDeFigura){
        super(tipoDeFigura);

    }
    public void dibujar(){
        //agregamos el comportamiento del metodo abstracto
        System.out.println("aqui deberiamos dibujar"+this.getClass().getSimpleName());
    }
}
