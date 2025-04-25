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
        System.out.println("La formula es: ("+num1+"/"+dom1+") + ("+num2+"/"+dom2+")");
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
        System.out.println("El resultado es: " + resultadob);
        
        //Ejercicio C
        System.out.println("Ejercicio C");
        System.out.println("Ingrese el numerador 1: ");
        int num1c = entrada.nextInt();
        System.out.println("Ingrese el denominador 1: ");
        int dom1c = entrada.nextInt();
        System.out.println("Ingrese el numero entero: ");
        int numeroc = entrada.nextInt();
        
        double resultadoC = (num1c / dom1c) + numeroc;
        System.out.println("La formula es: (" + num1c + "/" + dom1c + ") + " + numeroc);
        System.out.println("El resultado es: " + resultadoC);   
        
        //Ejercicio D
        System.out.println("Ejercicio C");
        System.out.println("Ingrese el numerador 1: ");
        int num1d = entrada.nextInt();
        System.out.println("Ingrese el denominador 1: ");
        int dom1d = entrada.nextInt();
        System.out.println("Ingrese el numero entero: ");
        int numerod = entrada.nextInt();
        
        double resultadod = numerod + (num1d / dom1d);
        System.out.println("Formula: " + numerod + " + (" + num1d + " / " + dom1d + ")");
        System.out.println("El resultado es: " + resultadod);
        
        //Ejercicio E
        System.out.println("Ejercicio E");
        System.out.print("Ingrese el valor de a: ");
        int ae = entrada.nextInt();
        System.out.print("Ingrese el valor de b: ");
        int be = entrada.nextInt();
        System.out.print("Ingrese el valor de c: ");
        int ce = entrada.nextInt();
        System.out.print("Ingrese el valor de d: ");
        int de = entrada.nextInt();
        System.out.print("Ingrese el valor de e: ");
        int ee = entrada.nextInt();
        System.out.print("Ingrese el valor de f: ");
        int fe = entrada.nextInt();
        System.out.print("Ingrese el valor de g: ");
        int ge = entrada.nextInt();
        System.out.print("Ingrese el valor de h: ");
        int he = entrada.nextInt();
        System.out.print("Ingrese el valor de j: ");
        int je = entrada.nextInt();
        
        double parte1e = ((ae*ae)/(be - ce));
        double parte2e = (de - ee) / (fe - ((ge*he)/je));
        System.out.println("Fórmula: ("+ae+"^2/("+be+"-"+ce+"))+(("+de+"-"+ee+")/(("+fe+"-"+ge+"*"+he+")/"+je+"))");
        double resultadoe = parte1e + parte2e;
        System.out.println("El resultado es: "+resultadoe);
        
        //Ejercicio F
        System.out.println("Ejercico F");
        System.out.println("Ingrese el valor de m: ");
        int mf = entrada.nextInt();
        System.out.println("Ingrese el valor de n: ");
        int nf = entrada.nextInt();
        System.out.println("Ingrese el valor de p: ");
        int pf = entrada.nextInt();
        
        double resultadof = (mf/nf) + pf;
        System.out.println("La formula es: ("+mf+"/"+nf+") + "+pf);
        System.out.println("El resultado es: "+resultadof);

        //Ejercicio G
        System.out.println("Ejercicio G");
        System.out.println("Ingrese el valor de m:");
        int mg = entrada.nextInt();
        System.out.println("Ingrese el valor de n:");
        int ng = entrada.nextInt();
        System.out.println("Ingrese el valor de p: ");
        int pg = entrada.nextInt();
        System.out.println("Ingrese el valor de q:");
        int qg = entrada.nextInt();
        
        double resultadog = mg + (ng / pg - qg);
        System.out.println("La formula es: "+mg+" + ("+ng+"/("+pg+"-"+qg+"))");
        System.out.println("El resultado es: "+resultadog);

        //Ejercicio H
        System.out.println("Ejercicio H");
        System.out.println("Ingrese el valor de a: ");
        int ah = entrada.nextInt();
        System.out.println("Ingrese el valor de b: ");
        int bh = entrada.nextInt();
        System.out.println("Ingrese el valor de c: ");
        int ch = entrada.nextInt();
        System.out.println("Ingrese el valor de d: ");
        int dh = entrada.nextInt();
        
        double resultadoh = ((ah * ah)/(bh * bh)) +  ((ch * ch)/(dh * dh));
        System.out.println("La formula es: ("+ah+"^2 /"+bh+"^2 ) +"+"("+ch+"^2 /"+dh+"^2 )");
        System.out.println("El resultado es: "+resultadoh);
    }
}
