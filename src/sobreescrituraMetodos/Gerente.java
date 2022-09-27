package sobreescrituraMetodos;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento=departamento;
    }
    public String toString(){
        return "nombre: "+this.nombre+", sueldo: "+this.sueldo+", departamento: "+this.departamento;
    }
}
