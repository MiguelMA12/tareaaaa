/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SUMA;

import java.util.Scanner;

public class ProgramaSuma {
// Declaración de la función suma
    // Definición de la función suma

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, resultado;

        System.out.println("Bienvenido al programa de suma");

        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();

        // Llamada a la función suma
        resultado = suma(num1, num2);

        System.out.println("El resultado de la suma es: " + resultado);

        input.close();
    }

    // Prototipo de la función suma
    // public static int suma(int num1, int num2);
}
