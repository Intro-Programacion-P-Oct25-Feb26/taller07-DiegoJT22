/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

/**
 *
 * @author daigo
 */
public class Problema4 {

    public static void main(String[] args) {

    int contador = 1;
    int limite = 15;
    int denominador = 3;
    String mensaje = "1";
    double suma = 1;

    boolean bandera = false;

    while (contador < limite) {

        if (bandera) {
            mensaje = String.format("%s + 1/%d", mensaje, denominador);
            suma = suma + (1.0 / denominador);
        } else {
            mensaje = String.format("%s - 1/%d", mensaje, denominador);
            suma = suma - (1.0 / denominador);
        }

        bandera =! bandera; 
        denominador = denominador + 2;
        contador = contador + 1;
    }

    System.out.printf("%s\nSuma de fracciones = %.5f\n", mensaje, suma);
}
}
