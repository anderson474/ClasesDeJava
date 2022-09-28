package claseObject.dominio;

import java.util.Objects;

public class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo){
        this.nombre=nombre;
        this.sueldo=sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Double.compare(empleado.sueldo, sueldo) == 0 && Objects.equals(nombre, empleado.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, sueldo);
    }
}
