package ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        String numero;
        Scanner Entrada = new Scanner(System.in);
        invertido Obj = new invertido();
        
        System.out.println("Programa para invertir el numero");
        
        System.out.print("Digite el numero: ");
        numero = Entrada.nextLine();
        Obj.setNumero(numero);
        
        System.out.println("El numero invertido es: " + Obj.InvertirNum());
    }
    
}
