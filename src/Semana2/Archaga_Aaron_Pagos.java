package Semana2;

import java.util.Scanner;

public class Archaga_Aaron_Pagos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("--- PAGOS ---");
        System.out.println("Ingrese su codigo de empleado: ");
        int codigoempleado = entrada.nextInt();
        System.out.println("Ingrese su Nombre y Apellido: ");
        String nombre = entrada.next();
        System.out.println("Ingrese las horas trabajadas en el mes: ");
        int horas = entrada.nextInt();
        System.out.println("Ingrese su categoria 1-4: ");
        int categoria = entrada.nextInt();
        System.out.println("==========================");
        System.out.println("Informacion de Categorias:");
        System.out.println("Categoria 1 - $40 por hora extra");
        System.out.println("Categoria 2 - $50 por hora extra");
        System.out.println("Categoria 3 - $85 por hora extra");
        System.out.println("Categoria 4 - $0 (No recibe pago por horas extra)");
        System.out.println("==========================");
        
        double pagonormal = 0;
        double pagoextra = 0;
        double preciohoraextra = 0;
        double preciohoranormal = 35.99;
        int horasnormales = Math.min(horas, 40);
        int horasextra = Math.max(0, horas - 40);
        int maxhorasextra = 15;
        double pagohorasextra = Math.min(horasextra,maxhorasextra);
        
        //Pago de horas normales con su tarifa normal
        pagonormal = horasnormales * preciohoranormal;
        
        if (categoria <= 4 && horasextra > 0) {
            switch (categoria){
            case 1:
                preciohoraextra = 40;
                break;
            case 2:
                preciohoraextra = 50;
                break;
            case 3:
                preciohoraextra = 85;
                break;
            case 4:
                preciohoraextra = 0;
                break;
            default:
                System.out.println("Categiria invalida");
                break;
            }
            
        pagoextra = pagohorasextra * preciohoraextra;
            
        double pagototal = pagonormal + pagoextra;
        
        //Salidas
        System.out.println("Nombre: "+nombre);
        System.out.println("Codigo: "+codigoempleado);
        System.out.println("Horas trabajadas: "+horas);
        System.out.println("Horas extra: "+horasextra);
        System.out.println("Categoria: "+categoria);
        System.out.println("Tarifa de hora normal: "+preciohoranormal);
        System.out.println("Tarifa de hora extra: "+preciohoraextra);
        System.out.println("Pago horas normales: "+String.format("%.2f",pagonormal));
        System.out.println("Pago horas extra: "+pagoextra);
        System.out.println("Total a pagar: "+String.format("%.2f",pagototal));
        }
        
        else{
            System.out.println("Categoria no valida.");
        }
    }
}
