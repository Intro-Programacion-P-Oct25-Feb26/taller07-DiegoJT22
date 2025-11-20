/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

/**
 *
 * @author daigo
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 1;
        int limite = 6;
        int numero;
        String lista = "";

        while (contador <= limite) {
            numero = (contador * contador) + 1;
            lista = String.format("%s%d\n", lista, numero);
            contador++;
        }

        System.out.printf("%s", lista);
    }
}
