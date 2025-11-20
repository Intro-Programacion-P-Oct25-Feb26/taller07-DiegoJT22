package problematica1;

import java.util.Locale;
import java.util.Scanner;

public class Problematica1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int contador = 1;
        double promedad = 0;
        double promesta = 0;
        int edad;
        double estatura;
        boolean bandera = true;
        String salida;
        String posicion;
        String nombre;
        String mensaje = "";
        String lista = "";

        while (bandera) {

            System.out.println("Ingrese nombre de jugador:");
            nombre = entrada.nextLine();

            System.out.println("Ingrese posicion de jugador:");
            posicion = entrada.nextLine();

            System.out.println("Ingrese edad:");
            edad = entrada.nextInt();

            System.out.println("Ingrese estatura:");
            estatura = entrada.nextDouble();

            promedad += edad;
            promesta += estatura;

            mensaje += String.format("%s. %s - %s, edad %d, estatura %.2f\n",
                    contador, nombre, posicion, edad, estatura);

            lista += String.format("%d\n", edad);

            entrada.nextLine(); // Limpia buffer

            System.out.println("Escriba 'si' para terminar o ENTER para continuar:");
            salida = entrada.nextLine();

            if (salida.equalsIgnoreCase("si")) {
                bandera = false;
            }

            contador++;
        }

        int totalJugadores = contador - 1;

        promedad /= totalJugadores;
        promesta /= totalJugadores;

        System.out.printf("\n--- RESULTADOS ---\n" +
                "Lista de jugadores:\n%s\n" +
                "Lista de edades:\n%s\n" +
                "Promedio edad: %.2f\n" +
                "Promedio estatura: %.2f\n",
                mensaje, lista, promedad, promesta);
    }
}

