//Hallar el MCD de 2 números (Recomendación, es recomendable utilizar el método de Euclides).
package ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int dato;
        Scanner Entrada = new Scanner(System.in);
         MCD Obj = new MCD();
         
         System.out.println("Sacar el MCD de dos numeros");
         
         System.out.print("Dijite el primer numero: ");
         dato = Integer.parseInt(Entrada.nextLine());
         Obj.setNum1(dato);
         
         System.out.print("Dijite el segundo numero: ");
         dato = Integer.parseInt(Entrada.nextLine());
         Obj.setNum2(dato);
         
         System.out.println("El MCD de " + Obj.getNum1() + " y " + Obj.getNum2() + " es: " + Obj.MCD());
         
         
    }
    
}
