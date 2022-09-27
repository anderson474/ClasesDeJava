package argumentosvariables;

public class EjemploVarArgs {
    public static void main(String[] args) {
        variosParametros("Juan", true, 10, 20, 30);
    }
    public static void variosParametros(String nombre, boolean valido, int... numeros){
        System.out.println("nombre: "+ nombre);
        System.out.println("valido: "+ valido);
        //usamos el for each
        for(int numero : numeros){
            System.out.println("el numero es: "+ numero);
        }
        //System.out.println(numeros[0]);

    }
}
