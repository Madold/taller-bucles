package Ejercicio8;


/*

    EJERCICIO 8 ENUNCUADO:
    8. Consolidar el resultado de una encuesta sobre pasajeros y preguntarles en que medio de
    transporte desean viajar (1. Automóvil, 2. Tren, 3. Barco, 4. Avión), el resultado debe
    mostrar el porcentaje por cada uno de los medios de transporte favorito de los
    encuestados

*/


//Se importa la clase Scanner

public class Main {

    //Se instancia con el nombre de input
    public static void main(String[] args) {
        Poll obj = new Poll();
        
        obj.startSurvey();   
        
        obj.calcSurveyResults();
    }
}
