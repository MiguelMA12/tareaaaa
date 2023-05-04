/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nombre_edad;

import java.util.Scanner;

public class NE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        
        saludar(nombre);
        mostrarEdad(edad);
        
        sc.close();
    }
    
    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre + ", ¡bienvenido!");
    }
    
    public static void mostrarEdad(int edad) {
        System.out.println("Tu edad es: " + edad + " años");
    }
}
