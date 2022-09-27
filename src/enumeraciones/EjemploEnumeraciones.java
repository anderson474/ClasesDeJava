package enumeraciones;

public class EjemploEnumeraciones {
    public static void main(String[] args) {
        System.out.println("dia: "+Dias.LUNES);

        //vamos a acceder a la enumeracion de contienetes
        System.out.println("continente No. 1: "+Continentes.AFRICA);
        System.out.println("numero de paises: "+ Continentes.AFRICA.getPaises());

        indicarDias(Dias.DOMINGO);

    }
    public static void indicarDias(Dias dia){
        switch (dia){
            case LUNES -> System.out.println("primer dia de la semana");
            case DOMINGO -> System.out.println("ultimo dia de la semana");
        }
    }


}
