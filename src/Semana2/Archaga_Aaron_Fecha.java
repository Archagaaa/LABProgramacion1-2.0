package Semana2;

import java.util.Scanner;

public class Archaga_Aaron_Fecha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String fecha1, fecha2;

        System.out.println("AVISO: El mes solamente tiene 30 dias ");
        System.out.println("Ingrese la primer fecha (DD/MM/AAAA): ");
        fecha1 = entrada.nextLine();
        System.out.println("Ingrese la segunda fecha (DD/MM/AAAA): ");
        fecha2 = entrada.nextLine();

        // Hacer que solo lea los numeros de la primer fecha
        int linea1_fecha1 = fecha1.indexOf("/");
        int linea2_fecha1 = fecha1.indexOf("/", linea1_fecha1 + 1);

        // Leer primer fecha
        int dia1 = Integer.parseInt(fecha1.substring(0, linea1_fecha1));
        int mes1 = Integer.parseInt(fecha1.substring(linea1_fecha1 + 1, linea2_fecha1));
        int anio1 = Integer.parseInt(fecha1.substring(linea2_fecha1 + 1));


        // Hacer que solo lea los numeros de la segunda fecha
        int linea1_fecha2 = fecha2.indexOf("/");
        int linea2_fecha2 = fecha2.indexOf("/", linea1_fecha2 + 1);

        // Leer la segunda fecha
        int dia2 = Integer.parseInt(fecha2.substring(0, linea1_fecha2));
        int mes2 = Integer.parseInt(fecha2.substring(linea1_fecha2 + 1, linea2_fecha2));
        int anio2 = Integer.parseInt(fecha2.substring(linea2_fecha2 + 1));

        // Hacer los calculos
        int resultadofecha1 = anio1 * 360 + mes1 * 30 + dia1;
        int resultadofecha2 = anio2 * 360 + mes2 * 30 + dia2;
        int diferencia = resultadofecha2 - resultadofecha1;

        // Salidas
        System.out.println("Fecha 1: " + fecha1);
        System.out.println("Fecha 2: " + fecha2);
        System.out.println("La diferencia de dias es: " + diferencia);
    }
}