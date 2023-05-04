package infinito2;

import java.util.Scanner;

public class cicloinf2 {

    public void menu() {
        Scanner input = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Salir");

            System.out.print("Ingrese una opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido la opción 1");
                    break;
                case 2:
                    System.out.println("Ha elegido la opción 2");
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        cicloinf2 c = new cicloinf2();
        c.menu();

    }
}