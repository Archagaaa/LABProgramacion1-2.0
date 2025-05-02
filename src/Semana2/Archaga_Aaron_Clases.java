package Semana2;

import java.util.Scanner;

public class Archaga_Aaron_Clases {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("----CLASES-----");
        System.out.println("Ingrese la fecha actual dia,DD//MM");
        String fecha = entrada.nextLine();
        String sub = fecha.(0,indexOf(","));
        System.out.println("Fecha"+sub);
    }
}
