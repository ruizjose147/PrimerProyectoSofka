package proyect;

import java.util.Scanner;

public class ProyectOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido!");
        System.out.println("Digite su nombre de usuario.");
        String nombre = scanner.nextLine();
        System.out.println("Digite su numero de celular.");
        String celular = scanner.nextLine();
        System.out.println("Que edad tienes?");
        String edad = scanner.nextLine();

        System.out.println("Bienvenido señor " + nombre + ", es un placer para nosotros contar con una persona de " + edad + " años.\n"
        + "Proximamente nos comunicaremos con usted al numero " + celular + "." +
        "\nFeliz dia.");
    }
}
