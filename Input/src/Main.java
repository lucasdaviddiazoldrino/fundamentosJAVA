

import java.util.Scanner;

public class Main {

    public static void main (String[]args) {

        //declara variables variable
        String nombre;
        byte edad;

        //creacion del objeto scanner
        Scanner input = new Scanner(System.in);

        //mensaje preguntando el nombre
        System.out.println("Bienvenido\nCuál es tu nombre?");

        nombre = input.nextLine();

        System.out.println("Cuál es tu edad?");

        edad = input.nextByte();

        //mensaje final
        System.out.println("Hola " + nombre + " tu edad es " + edad );
    }

}


