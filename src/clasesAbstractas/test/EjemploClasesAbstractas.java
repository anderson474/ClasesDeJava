package clasesAbstractas.test;

import clasesAbstractas.domain.Circulo;
import clasesAbstractas.domain.FiguraGeometrica;
import clasesAbstractas.domain.Rectangulo;

public class EjemploClasesAbstractas {
    public static void main(String[] args) {
        //FiguraGeometrica fig1 = new FiguraGeometrica();
        //no se pueden instanciar
        FiguraGeometrica fig1=new Rectangulo("Rectangulo");
        System.out.println("fig1 = " + fig1);
        fig1.dibujar();

    }
}
