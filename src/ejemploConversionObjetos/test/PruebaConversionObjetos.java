package ejemploConversionObjetos.test;

import ejemploConversionObjetos.Empleado;
import ejemploConversionObjetos.Escritor;
import ejemploConversionObjetos.TipoEscritura;

public class PruebaConversionObjetos {
    public static void main(String[] args) {
        Empleado emp;
        emp= new Escritor("Roy",2500, TipoEscritura.CLASICO);//castup
        System.out.println(emp.getNombre());//se pueden llamar metodos de la clase padre
        System.out.println(emp.toString());// y metodos de la clase hija que esten sobreescritos
        System.out.println(emp.getSueldo());
        //System.out.println(emp.getTipoEscritura());
        //podemos convertir la variable de tipo empleado a tipo escritor
        Escritor escritor= (Escritor) emp;// y se realiza un castdown
        System.out.println(escritor.getTipoEscritura());
        System.out.println(escritor.getDescripcion());


    }
}
