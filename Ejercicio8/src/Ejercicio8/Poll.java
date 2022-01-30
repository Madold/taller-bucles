//Poll es encuesta del inglés
package Ejercicio8;

import java.util.Scanner;

public class Poll {

    private int carPreference = 0, trainPreference = 0, boatPreference = 0, planePreference = 0;

    public void setPlanePreference(int planePreference) {
        this.planePreference = planePreference;
    }

    public int getCarPreference() {
        return carPreference;
    }

    public void setCarPreference(int carPreference) {
        this.carPreference = carPreference;
    }

    public int getTrainPreference() {
        return trainPreference;
    }

    public void setTrainPreference(int trainPreference) {
        this.trainPreference = trainPreference;
    }

    public int getBoatPreference() {
        return boatPreference;
    }

    public void setBoatPreference(int boatPreference) {
        this.boatPreference = boatPreference;
    }

    public int getPlanePreference() {
        return planePreference;
    }

    //Metodo para iniciar la encuesta
    public void startSurvey() {
        Scanner input = new Scanner(System.in);
        String answer = "y";

        System.out.println("Bienvenid@ a la encuesta sobre el medio preferido de transporte, sr@!");
        System.out.println("********************************************************************");        
        while (answer.equals("y")) {

            System.out.print("¿Cual es su medio de transporte preferido?, "
                    + "Posibles respuestas: Carro, tren, barco, avión: ");

            String transport = input.nextLine().trim().toLowerCase();

            if (transport.equals("carro")) {
                carPreference++;
            } else if (transport.equals("tren")) {
                trainPreference++;
            } else if (transport.equals("barco")) {
                boatPreference++;
            } else if (transport.equals("avión") || transport.equals("avion")) {
                planePreference++;
            } else {
                System.out.println("Transporte no valido!");
            }

            System.out.print("Guardado!, encuestará a alguien más? | Escriba: Y si es así o"
                    + " Escriba: N para terminar la encuesta: ");

            answer = input.nextLine().trim().toLowerCase();
        }

        System.out.println("Gracias por participar en la encuesta sr@!");
        System.out.println();
    }

    public void calcSurveyResults() {
        double participants = carPreference + trainPreference + boatPreference + planePreference;
        
        System.out.println("********************************************************************");
        System.out.println("El total de los encuestados fueron : " + participants);

        double carPreferencePercentage = (carPreference / participants) * 100;
        System.out.println(carPreferencePercentage + "% de los encuestados, prefirieron irse en automovil");

        double trainPreferncePercentage = (float) (trainPreference / participants) * 100;
        System.out.println(trainPreferncePercentage + "% de los encuestados, prefirieron irse en tren");
        
        double boatPreferncePercentage = (float) (boatPreference / participants) * 100;
        System.out.println(boatPreferncePercentage + "% de los encuestados, prefirieron irse en barco");
        
        double planePreferncePercentage = (float) (planePreference / participants) * 100;
        System.out.println(planePreferncePercentage + "% de los encuestados, prefirieron irse en avion");
    }

}
