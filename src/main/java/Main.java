import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        iniciador();
    }

    private static void iniciador() {
        String palabra;
        int num;
        do {
            do {
                menu();
                palabra = pregunta();
            } while (opciones(palabra) == false);
            num = Salir();
        }while (num!=1);
    }

    private static int mostrarMayores(double[] doubles) {
        int a=0;
        for (int i =0; i<doubles.length; i++){
            if (doubles[i]>=5){
                a++;
            }
        }
        return a;
    }

    private static double mostrarMayor(double[] doubles) {
        double a=0;
        for (int i =0; i<doubles.length; i++){
            if (doubles[i]>a){
                a=doubles[i];
            }
        }
        return a;
    }

    private static int Salir() {
        int a=3;
        while (a==3){
            System.out.println("Desea Salir?");
            System.out.println("[1] Si");
            System.out.println("[2] No");
            switch (respuesta()){
                case "1":
                    a=1;
                    System.out.println("Gracias por ocupar el programa");
                    break;
                case "2":
                    a=2;
                    System.out.println("Reiniciando");
                    break;
                default:
                    System.out.println("Caracter no Valido");
                    a=3;
                    break;
            }
        }
        return a;
    }

    private static double[] ingresoDatos() {
        double arr[] = arreglo();
        return arr;
    }

    private static double[] arreglo() {
        Random rnum = new Random();
        double arr[] = new double[69];
        for (int i =0; i<arr.length; i++){
            arr[i]= rnum.nextDouble()*9.9;
        }
        return arr;
    }

    private static boolean opciones(String pregunta) {
        boolean a=false;
        switch (pregunta){
            case "1":
                ingresoDatos();
                System.out.println("Datos Ingresados");
                a = true;
                break;
            case "2":
                System.out.println("El mayor sismo es de "+ mostrarMayor(ingresoDatos()));
                a = true;
                break;
            case "3":
                System.out.println("La cantidad de sismos mayores a 5° son: " + mostrarMayores(ingresoDatos()));
                a = true;
                break;
            case "4":
                mensajes(ingresoDatos());
                break;
            default:
                System.out.println("Dato no valido");
                a = false;
                break;
        }
        return a;
    }

    private static void mensajes(double[] doubles) {
            int a=0;
            for (int i =0; i<doubles.length; i++){
                if (doubles[i]>6.9){
                    System.out.println("ALERTA ALEJESE DE ZONA COSTERA");
                }
            }
    }

    private static String pregunta() {
        System.out.println("Que desea hacer");
        return respuesta();
    }

    private static String respuesta() {
        Scanner teclado = new Scanner(System.in);
        return teclado.next();
    }

    public static void menu() {
        System.out.println("                             Sismos                           ");
        System.out.println("[1] Ingresar Datos");
        System.out.println("[2] Ver el mayor Sismo");
        System.out.println("[3] Conteo de Sismos mayores a 5°");
        System.out.println("[4] Enviar SMS por Cada Sismo mayor de 7");
    }

}
