package Semana1;

import java.util.Scanner;

public class Archaga_Aaron_PlanillaDeEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        String nombre;
        double horas, tarifa, salario, salariosemanal;
        
        System.out.println("Ingrese su nombre y apellido: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la cantidad de horas laboradas este mes: ");
        horas = entrada.nextDouble();
        System.out.println("Ingrese la tarifa por hora: ");
        tarifa = entrada.nextDouble();
        
        //Calculos
        salario = horas * tarifa;
        salariosemanal = salario / 4;
                
        //Salida
        System.out.println("---BOLETA DE EMPLEADO---");
        System.out.println("Nombre del Empleado: "+nombre);
        System.out.println("Horas de trabajo mensual: "+horas);
        System.out.println("Tarifa por hora: Lps. "+tarifa);
        System.out.println("Salario de Empleado Semanal: Lps. "+salariosemanal);
    }
}
