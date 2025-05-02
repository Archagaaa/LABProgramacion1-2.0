package Semana2;

import java.util.Scanner;

public class Archaga_Aaron_Tiempo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese el numero en segundos: ");
        int segundos = entrada.nextInt();
        String resultado;

        // Operador ternario
        resultado = (segundos >= 0)?
                    ((segundos / 3600) + " horas, " 
                    + (segundos % 3600) / 60 + " minutos, " 
                    + (segundos % 60) + " segundos"): "numero no permitido";

        System.out.println(resultado);
    }
}
