import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int numeroIf = 10;
        int numeroWhile = 0;
        String strEstacion = "verano";
        comparacion(numeroIf);
        cicloWhile(numeroWhile);
        cicloDoWhile(numeroWhile);
        cicloFor(numeroWhile);
        estaciones(strEstacion);

    }
    public static void comparacion(int numero){
        if (numero > 0) {
            System.out.println("Es positivo");
        } else if (numero < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero");
        }
    }
    public static void cicloWhile(int numero){
        while( numero < 3){
            System.out.println(numero);
            numero++;
        }
    }
    public static void cicloDoWhile(int numero){
        do{
            System.out.println(numero);
            numero++;
        }while( numero == 1000);
    }
    public static void cicloFor(int numero){
        for (int i = 0; i<= 3; i++){
            System.out.println(i);
        }
    }
    public static void estaciones(String estacion){
        switch(estacion) {
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No estoy seguro...");
                break;
        }
    }
}