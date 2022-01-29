package Ejercicio1;

/*

    Escribir la serie de Lucas para N términos 2,1,3,4,11,18, 29

*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("¿Cuantos terminos de la serie de lucas desea ver?: ");
        int term = Integer.parseInt(input.nextLine());

        Lucas obj = new Lucas(term);

        obj.detLucas();
    }
}
