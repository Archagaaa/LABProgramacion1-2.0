package Semana1;

import java.util.Scanner;

public class Archaga_Aaron_Cuotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        double prestamo, totalpagar, interestasa, comisiontasa, comision, porcentaje, interes, cuotamensual, segurotasa, seguro;
        int plazomeses;
        
        System.out.println("Ingrese el monto del prestamo: ");
        prestamo = entrada.nextDouble();
        System.out.println("Ingrese el plazo de meses: ");
        plazomeses = entrada.nextInt();
        System.out.println("Ingrese la tasa de interes mensual: ");
        interestasa = entrada.nextDouble();
        interestasa = interestasa / 100;
        System.out.println("Ingrese la tasa del seguro mensual: ");
        segurotasa = entrada.nextDouble();
        segurotasa = segurotasa / 100;
        System.out.println("Ingrese la comision por cuota: ");
        comisiontasa = entrada.nextDouble();
        comisiontasa = comisiontasa / 100;
        
        //Calculos
        interes = prestamo * interestasa * plazomeses;
        seguro = prestamo * segurotasa * plazomeses;
        comision = prestamo * comisiontasa;
        cuotamensual = interes + seguro + comision + (prestamo/plazomeses);
        totalpagar = cuotamensual * plazomeses;
        
        //Salida
        System.out.println("---CUOTAS MENSUALES---");
        System.out.println("Cuota de Pago Mensual: HNL. "+cuotamensual);
        System.out.println("Total a Pagar: HNL. "+totalpagar);
    }
}
