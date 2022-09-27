package sobreescrituraMetodos;

public class EjemploSobreescritura {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Juan",2300);
        System.out.println(e1.toString());

        Gerente g1 = new Gerente("Carlos",8000,"finanzas");
        System.out.println("g1.toString() = " + g1.toString());

    }
}
