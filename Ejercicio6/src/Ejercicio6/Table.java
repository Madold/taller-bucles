package Ejercicio6;

public class Table {
    public void calcTables() {
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            System.out.println("***********TABLA DEL " + i + "***********");
            for (int p = 1; p <= 10; p++) {
                System.out.println(i + " * " + p + " = " + i * p);
            }
        }
    }         
}
