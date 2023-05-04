
package MULTIPLICACION;

import java.util.Scanner;

public class ProgramaMultiplicacion {

    // Declaración de la función multiplicacion
    // Definición de la función multiplicacion
    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, resultado;

        System.out.println("Bienvenido al programa de multiplicación");

        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();

        // Llamada a la función multiplicacion
        resultado = multiplicacion(num1, num2);

        System.out.println("El resultado de la multiplicación es: " + resultado);

        input.close();
    }

    // Prototipo de la función multiplicacion
    // public static int multiplicacion(int num1, int num2);
}
