package Semana3;

import java.util.Random;
import java.util.Scanner;

public class Archaga_Aaron_Estructuras_Control {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int contreves = 0, contperfecto = 0, contprimos = 0, contvotaciones = 0;
        int opcion;
        
        do {
            
            System.out.println("=== MENU ===");
            System.out.println("1. Palabras alreves");
            System.out.println("2. Numero Perfecto");
            System.out.println("3. Numeros Primos");
            System.out.println("4. Votaciones");
            System.out.println("5. Salir");
            System.out.print("Ingrese un numero: ");
            opcion = entrada.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("=== PALABRA ALREVES ===");
                
                    contreves++;
                    break;
                case 2:
                    System.out.println("=== NUMERO PERFECTO ===");
                
                    contperfecto++;
                    break;
                
                case 3:
                    System.out.println("=== NUMEROS PRIMOS ===");
                    Random random = new Random(); //Libreria para generar numeros aleatorios
                    int numrandom = random.nextInt(100); //Genera el numero aleatorio del 0-100
                    int divisores = 0;
                   
                    
                    for (int i = 1; i <= numrandom; i++) {
                        //Verifica si el numero generado es divisor del numero random
                        if(numrandom % i == 0){
                            divisores++;
                        }
                    }
                    
                    //Si es primo lo despliega
                    if (divisores == 2){
                        System.out.println("Primo: " + numrandom + " porque solo tiene dos divisores");
                        System.out.println("Divisores de " + numrandom + " son: 1 y " + numrandom);
                    } 
                    else {
                        System.out.println("El "+numrandom+ " no es primo");
                    }
                    contprimos++; //contador para mostrar al salir del programa
                    break;

                case 4:
                    System.out.println("=== VOTACIONES ===");

                    contvotaciones++;
                    break;
                case 5:
                    System.out.println("Entro "+contreves+" veces a palabras alreves");
                    System.out.println("Entro "+contperfecto+" veces a numero perfecto");
                    System.out.println("Entro "+contprimos+" veces a numeros primos");
                    System.out.println("Entro "+contvotaciones+" veces a votaciones");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 5);
        
    }
}
