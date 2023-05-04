/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Area;

import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el radio del círculo: ");
        double radio = entrada.nextDouble();

        double area = calcularAreaCirculo(radio);

        System.out.println("El área del círculo es: " + area);
    }

    /**
     * Calcula el área de un círculo dado su radio.
     * El área de un círculo se calcula como pi multiplicado por el radio al cuadrado.
     * @param radio el radio del círculo
     * @return el área del círculo
     */
    public static double calcularAreaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
}
