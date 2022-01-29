/*
Leer un número y escribir si es primo o no
 */
package punto2;
import java.util.Scanner;

public class Punto2 {

    public static void main(String[] args) {
        float dato;
        Scanner Entrada = new Scanner(System.in);
        primo Obj = new primo();
        
        System.out.println("Ver si un numero es primo o no");
        
        System.out.print("Ingrese el numero: ");
        dato = Float.parseFloat(Entrada.nextLine());
        Obj.setNum(dato);
        
        if (Obj.EvaluarNumero()) {
            System.out.println("El numero es Primo");
        }else{
            System.out.println("El numero no es Primo");
        }
    }
    
}
