package sobreescrituraMetodos;

public class Empleado {
    protected String nombre;
    protected double sueldo;

    protected Empleado(String nombre, double sueldo){
        this.nombre=nombre;
        this.sueldo=sueldo;
    }
    public String toString(){
        return "nombre: "+this.nombre+", sueldo: "+this.sueldo;
    }

}
