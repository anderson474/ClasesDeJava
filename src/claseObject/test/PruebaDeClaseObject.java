package claseObject.test;

import claseObject.dominio.Empleado;

public class PruebaDeClaseObject {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Juan",2500);
        System.out.println("emp = " + emp);
        Empleado emp2 = new Empleado("Juan",2500);
        System.out.println("emp2 = " + emp2);
        compararObjetos(emp,emp2);
    }
    private static void compararObjetos(Empleado emp,Empleado emp2){
        if(emp==emp2){
            System.out.println("Los valores tienen la misma direccion de memoria");
        }
        else{
            System.out.println("Los valores tienen distinta direccion de memoria");
        }
        if(emp.equals(emp2)){
            System.out.println("Los objetos tienen el mismo contenido");

        }
        else{
            System.out.println("Los objetos no tienen el mismo contenido");
        }
        if(emp.hashCode()==emp2.hashCode()){
            System.out.println("Los objetos tienen el mismo codigo hash");

        }
        else{
            System.out.println("Los  objetos NO tienen el mismo codigo hash");
        }
    }
}
