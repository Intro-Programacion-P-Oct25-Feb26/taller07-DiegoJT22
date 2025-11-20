/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.pkg2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author daigo
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int contador = 1;
        int limite = 10;
        int numero;
        String lista = "";

        while (contador <= limite) {
            numero = contador * (contador + 1);
            lista = String.format("%s%d\n", lista,
                    numero);

            contador = contador + 1;
        }
        System.out.printf("%s", lista);
    }

}
