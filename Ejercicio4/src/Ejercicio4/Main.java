
package Ejercicio4;
//Importamos la clase scanner
import java.util.Scanner;

/*

    EJERCICIO4 ENUNCIADO: 
    Realizar el programa en java para: Escribir el resultado de una potencia Utilizando sumas únicamente.

*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Introduzca el valor de la base");
        int base = Integer.parseInt(input.nextLine());
        
        System.out.println("Introduzca el valor del exponente");
        int exponent = Integer.parseInt(input.nextLine());
        
        Potency obj = new Potency(base, exponent);
        
        System.out.println("El resultado es: " + obj.calcPotency());       
    }
}
