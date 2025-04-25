package Semana1;

import java.util.Scanner;

public class Archaga_Aaron_Clics {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Variables
        double costoclic60 = 0.30, costoclic100 = 0.25, costoclic20 = 0.80;
        double clic60 = 60, clic100 = 100, clic20 = 20;
        double totalISV, ISV, costopromedio, costototal;
        
        //Calculos
        costopromedio = (costoclic60 * clic60) + (costoclic100 * clic100) +(costoclic20 * clic20) / 180;
        costototal = (costoclic60 * clic60) + (costoclic100 * clic100) +(costoclic20 * clic20);
        ISV = costototal * 0.16;
        totalISV = costototal + ISV;
        
        //Salidas
        System.out.println("Su costo promedio es: "+String.format("%.2f",costopromedio));
        System.out.println("Su ISV es: "+ISV);
        System.out.println("Su total mas ISV es: "+String.format("%.2f",totalISV));
    }
}
