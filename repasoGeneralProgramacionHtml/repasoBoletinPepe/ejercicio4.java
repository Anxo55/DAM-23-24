package repasoBoletinPepe;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 0;

        do {
            
        System.out.println("Dame un numero entero: ");
        numero = sc.nextInt();

        if(numero > 0) {
            contador++;
        }else if(numero < 0) {
            System.out.println("Sacaste un numero negativo, cerrando el programa.");
        }

        } while (numero > 0);

        System.out.println("El total de numeros positivos que salieron fue: "+contador);

    }
    
}
