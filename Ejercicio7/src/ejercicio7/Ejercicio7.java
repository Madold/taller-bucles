package ejercicio7;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        int dato;
        Scanner Entrada = new Scanner(System.in);
        Division Obj = new Division();
        
        System.out.println("Programa para Dividir un numero mediante restas");
        
        System.out.print("Ingrese el Dividendo: ");
        dato = Integer.parseInt(Entrada.nextLine());
        Obj.setDivi(dato);
        
        System.out.print("Ingrese el Divisor: ");
        dato = Integer.parseInt(Entrada.nextLine());
        Obj.setDiv(dato);
        
        System.out.println("El resultado de la division por resta es: " + Obj.DivisorResta());
    }
    
}
