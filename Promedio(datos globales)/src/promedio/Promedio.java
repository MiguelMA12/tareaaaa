/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promedio;

import java.util.Scanner;

public class Promedio {

    // Variable global para almacenar la suma de los números ingresados
    static double total = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los números que desea promediar. Ingrese '0' para finalizar.");

        int contador = 0; // variable contador para llevar la cuenta de los números ingresados

        // Ciclo para ingresar los números
        while (true) {
            double numero = scanner.nextDouble();
            if (numero == 0) {
                break;
            }
            total += numero;
            contador++;
            System.out.println("Número ingresado: " + numero);
            System.out.println("Total acumulado: " + total);
        }

        System.out.println("Cantidad de números ingresados: " + contador);

        // Cálculo del promedio
        double promedio = total / contador;

        System.out.println("El promedio es: " + promedio);
    }
}


