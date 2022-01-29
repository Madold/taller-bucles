package Ejercicio1;

public class Lucas {

    private int term;

    public Lucas(int term) {
        this.term = term;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public void detLucas() {
        int digit1 = 2;
        int digit2 = 1;
        int acum = 0;

        if (term == 1 && term > 0) {
            System.out.println(2);
        } else if (term == 2 && term > 0) {
            System.out.println(digit1 + ", " + digit2);
        } else {
            if (term >= 3) {
                System.out.print(digit1 + ", " + digit2 + ", ");

                for (int i = 0; i < term - 2; i++) {
                    acum = digit1 + digit2;
                    System.out.print(acum + ", ");

                    digit1 = digit2;
                    digit2 = acum;
                }
            } else {
                System.out.println("Valores no validos");
            }
        }
    }
}
