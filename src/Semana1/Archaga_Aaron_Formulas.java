package Semana1;

import java.util.Scanner;

public class Archaga_Aaron_Formulas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Ejercicio A
        System.out.println("Ejercicio A");
        System.out.println("Ingrese el numerador 1: ");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el denominador 1: ");
        int dom1 = entrada.nextInt();
        System.out.println("Ingrese el numerador 2: ");
        int num2 = entrada.nextInt();
        System.out.println("Ingrese el denominador 2: ");
        int dom2 = entrada.nextInt();
        
        double resultado = (num1 / dom1) + (num2 / dom2);
        System.out.println("Formula: ("+num1+"/"+dom1+") + ("+num2+"/"+dom2+")");
        System.out.println("El resultado es: "+resultado);
        
        //Ejercicio B
        System.out.println("Ejercicio B");
        System.out.print("Ingresa el valor de x: ");
        double x = entrada.nextDouble();
        System.out.println("Ingrese el numerador 1");
        int num1b = entrada.nextInt();
        System.out.println("Ingrese el denominador 1");
        int dom1b = entrada.nextInt();
        System.out.println("Ingrese el numerador 2");
        int num2b = entrada.nextInt();
        System.out.println("Ingrese el denominador 2");
        int dom2b = entrada.nextInt();
        System.out.print("Ingresa el valor de y: ");
        double y = entrada.nextDouble();

        double parte1 = num1b / (x - dom1b);
        double parte2 = (num2b * x * y) / dom2b;

        double resultadob = parte1 - parte2;
        System.out.println("El resultado es: " + resultado);
        
        //Ejercicio C
        System.out.println("Ejercicio C");
        System.out.println("Ingrese el numerador 1: ");
        int num1c = entrada.nextInt();
        System.out.println("Ingrese el denominador 1: ");
        int dom1c = entrada.nextInt();
        System.out.println("Ingrese el numero entero: ");
        int numc = entrada.nextInt();
        
        double resultadoC = (num1c / dom1c) + numc;
        System.out.println("Formula: (" + num1c + "/" + dom1c + ") + " + numc);
        System.out.println("El resultado es: " + resultadoC);   
        
    }
}
