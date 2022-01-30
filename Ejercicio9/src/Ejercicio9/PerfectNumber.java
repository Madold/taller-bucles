package Ejercicio9;

import java.util.Scanner;

public class PerfectNumber {

    public void isPerfectNumber() {
        Scanner input = new Scanner(System.in);

        int num = 0;

        int acum = 0;

        String answer = "y";

        while (answer.equals("y")) {

            System.out.println("Ingrese un numero, le diré si es perfecto o no: ");
            num = Integer.parseInt(input.nextLine());

            for (int i = 1; i < num; i++) {
                if (num % i == 0) { 
                    //Verifico si el modulo del numero con i en el momento del ciclo es cero.
                    //Si es así se le va sumando a la variable acum
                    acum = acum + i;
                }
            }

            if (acum == num) {
                System.out.println("Es un numero perfecto");
            } else {
                System.out.println("No es un numero perfecto");
            }

            acum = 0;

            System.out.println("¿Quieres verificar si otro numero es perfecto?, "
                    + "Escribe 'y' si es así o escribe 'n' para salir del programa: ");

            answer = input.nextLine().trim();

        }

        System.out.println("Gracias por utilizar nuestros servicios!!");
    }

}
