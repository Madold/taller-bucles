package ejercicio7;


public class Division {
    private int divi; //dividendo
    private int div; //divisor

    public int getDivi() {
        return divi;
    }

    public void setDivi(int divi) {
        this.divi = divi;
    }

    public int getDiv() {
        return div;
    }

    public void setDiv(int div) {
        this.div = div;
    }
   
    public int DivisorResta(){
        int contador = 0;
        while(divi > 0){
            contador = contador + 1;
            divi = divi - div;
        }
        return contador;
    }
}
