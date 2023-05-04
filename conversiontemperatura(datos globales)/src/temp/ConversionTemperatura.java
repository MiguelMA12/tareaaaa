/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temp;

import java.util.Scanner;

public class ConversionTemperatura {

    // Variable global para almacenar el resultado de la conversión
    static double resultado = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados Celsius:");
        double celsius = scanner.nextDouble();

        // Conversión a grados Fahrenheit
        resultado = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " grados Celsius equivale a " + resultado + " grados Fahrenheit.");
    }
}
