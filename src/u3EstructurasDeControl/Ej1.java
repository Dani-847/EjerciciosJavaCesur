package u3EstructurasDeControl;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indica tu año de nacimiento: ");
        int anyo = sc.nextInt();
        sc.close();

        System.out.println("Tienes " + (2024-anyo) + " años.");

    }
}