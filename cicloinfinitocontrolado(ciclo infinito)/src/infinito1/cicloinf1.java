package infinito1;

import java.util.Scanner;

public class cicloinf1 {

    public void inf() {
        Scanner input = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Ingrese un número positivo (o cero para salir): ");
            numero = input.nextInt();

            if (numero == 0) {
                System.out.println("Saliendo del programa...");
                break;
            }

            System.out.println("El número ingresado es: " + numero);
        }

        input.close();
    }

    public static void main(String[] args) {
        cicloinf1 i = new cicloinf1();
        i.inf();
    }
}
