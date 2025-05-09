package Semana3;

import java.util.Random;
import java.util.Scanner;

public class Archaga_Aaron_Estructuras_Control {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int contreves = 0, contperfecto = 0, contprimos = 0, contvotaciones = 0;
        int opcion;
        
        do {
            
            System.out.println("=== MENU ==="+
                            "\n1. Palabras alreves"+
                            "\n2. Numero Perfecto"+
                            "\n3. Numeros Primos"+
                            "\n4. Votaciones"+
                            "\n5. Salir"+
                            "\nIngrese un numero: ");
            opcion = entrada.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("=== PALABRA ALREVES ===");
                    System.out.println("Ingrese la cantidad de palabras: ");
                    int cantidadpalabras = entrada.nextInt();
                    
                    contreves++;
                    
                    break;
                case 2:
                    System.out.println("=== NUMERO PERFECTO ===");
                    System.out.println("Ingrese el numero: ");
                    int numero = entrada.nextInt();
                    int suma = 0;
                    
                    for (int divisores = 1; divisores < numero; divisores++) { //se divide desde 1 hasta el numero ingresado
                        if (numero % divisores == 0) {
                            suma = suma + divisores; //Si es divisor se le suma
                        }
                    }
                    if (suma == numero) { //Si el numero es igual a la suma de sus divisores entonces es perfecto
                        System.out.println("El numero "+numero+" es perfecto");
                    }
                    else {
                        System.out.println("El numero "+numero+" no es pefecto");
                    }
                    
                    contperfecto++; //contador para mostrar al salir del programa
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
                    System.out.print("Ingrese cuantos votantes hay en el pais:");
                    int votantes = entrada.nextInt();
                    int contvotoazul = 0, contvotorojo = 0, contvotonegro = 0, contvotoamarillo = 0, votosvalidos = 0;
                    
                    //Menu para votar hasta que se terminen los votantes
                    for (int contador = 1; contador <= votantes; contador++) {
                        System.out.println("=== PLANILLAS ==="+
                                        "\n 1. AZUL"+
                                        "\n 2. ROJO"+
                                        "\n 3. NEGRO"+
                                        "\n 4. AMARILLO");
                        System.out.println("Escriba por quien votara: ");
                        String voto = entrada.next().toLowerCase();
                        
                        //Switch case para poder contar los votos ingresados
                        switch (voto){
                            case "azul":
                                contvotoazul++;
                                votosvalidos++;
                                break;
                            case "rojo":
                                contvotorojo++;
                                votosvalidos++;
                                break;
                            case "negro":
                                contvotonegro++;
                                votosvalidos++;
                                break;
                            case "amarillo":
                                contvotoamarillo++;
                                votosvalidos++;
                                break;
                            default:
                                System.out.println("Voto no valido");
                        }
                    }
                    
                    //Ver el porcentaje de votos validos
                    double votosvalidostotales = (votosvalidos * 100) / votantes;
                    
                    String ganador = "";
                    int contvotoganador = 0; //contador de votos totales de la planilla ganadora
                    
                    //Votacion fallida si los votos validos son menor al 60%
                    if(votosvalidostotales < 60){
                        System.out.println("VOTACION FALLIDA");
                    }
                    //Si son mayor a 60% se empieza a buscar al ganador
                    else{
                        //Verificar si gano el azul siendo mayor a todos los demas votos
                        if (contvotoazul > contvotorojo && contvotoazul > contvotonegro && contvotoazul > contvotoamarillo) {
                            ganador = "azul";
                            contvotoganador = contvotoazul;
                        }
                        //Verificar si gano el rojo siendo mayor a todos los demas votos
                        if (contvotorojo > contvotoazul && contvotorojo > contvotonegro && contvotorojo > contvotoamarillo) {
                            ganador = "rojo";
                            contvotoganador = contvotorojo;
                        }
                        //Verificar si gano el negro siendo mayor a todos los demas votos
                        if (contvotonegro > contvotoazul && contvotonegro > contvotorojo && contvotonegro > contvotoamarillo) {
                            ganador = "negro";
                            contvotoganador = contvotonegro;
                        }
                        //Verificar si gano el amarillo siendo mayor a todos los demas votos
                        if (contvotoamarillo > contvotoazul && contvotoamarillo > contvotorojo && contvotoamarillo > contvotonegro) {
                            ganador = "amarillo";
                            contvotoganador = contvotoamarillo;
                        }
                    }
                    //Mostrar quien gano
                    System.out.println("Gano la planilla "+ganador);
                    System.out.println("Con la cantidad de "+contvotoganador+" votos");
                    
                    contvotaciones++; //contador para mostrar al salir del programa
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
