package Ejercicio4;

public class Potency {

    private int base, exponent;

    public Potency(int base, int exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    public int calcPotency() {

        int res = base;

        //Calculo el numero de veces que tengo que sumar la base para obtener la potencia
        int iterations = (int) Math.abs((Math.pow(base, exponent) / base));

        if (exponent == 0) {
            res = 1;
        } else if (exponent == 1) {
            return base;
        } else {
            for (int i = 1; i < iterations; i++) {
                res += base;
            }

        }
        return res;
    }
}
