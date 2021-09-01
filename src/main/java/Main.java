import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        iniciador();
    }

    private static void iniciador() {
        String palabra;
        do {
            do {
                menu();
                palabra = pregunta();
            }while (validacion(palabra)==false);
            opciones(palabra);
        }while(palabra=="4");
    }

    private static void opciones(String a) {            //i. Ingresar datos
                                                       // ii. Mostrar sismo de mayor magnitud
                                                        // iii. Contar sismos mayores o iguales a 5.0
                                                       // iv. Enviar SMS por cada sismo mayor o igual a 7.0
                                                        // v.  Salir (S/N)
            if (a == "1"){
                ingresoDatos();
            }
            if (a == "2"){
                mostrarMayor();
            }
            if (a == "3"){
                mostrarMayores();
            }
            if (a == "4"){
                Salir();
            }
    }

    private static void mostrarMayores() {
    }

    private static void mostrarMayor() {

    }

    private static void Salir() {
        System.out.println("Gracias por ocupar el programa");
    }

    private static double[] ingresoDatos() {
        System.out.println("Ingresando Datos");
        double arr[] = arreglo();
        System.out.println("Datos ingresados");
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

    private static boolean validacion(String pregunta) {
        boolean a;
        switch (pregunta){
            case "1":
                a = true;
                break;
            case "2":
                a = true;
                break;
            case "3":
                a = true;
                break;
            case "4":
                a = true;
                break;
            default:
                System.out.println("Dato no valido");
                a = false;
                break;
        }
        return a;
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
        System.out.println("                             Bienvenido a la carrera                           ");
        System.out.println("[1] Comprar"); // Lista de productos a vender con sus valores
        System.out.println("[2] Vender"); // opciones de ingreso de datos (nombre y valor de algun producto)
        System.out.println("[3] Datos del negocio");// Ventas, inventario, y numero de ventas
        System.out.println("[4] Salir");
    }

}
