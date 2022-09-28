package clasesAbstractas.domain;

public class Circulo extends FiguraGeometrica{
    public Circulo(String tipoDeFigura){
        super(tipoDeFigura);

    }
    public void dibujar(){
        //agregamos el comportamiento del metodo abstracto
        System.out.println("aqui deberiamos dibujar"+this.getClass().getSimpleName());
    }
}
