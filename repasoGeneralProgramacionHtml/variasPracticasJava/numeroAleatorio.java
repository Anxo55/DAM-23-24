package variasPracticasJava;

import java.util.Scanner;

public class numeroAleatorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAleatorio;
        int numero;
        int contador = 0;

        numAleatorio = (int) (Math.random()*100);
        System.out.println("Que el usuario ingrese numero del 1 al 100 para adivinar el numero aleatorio.");

        do {

            System.out.println("Dame numeros: ");
            numero = sc.nextInt();
            contador++;

            if (numero > numAleatorio) {
                System.out.println("El numero es mas pequenio");
            }else if(numero < numAleatorio){
                System.out.println("El numero es mas grande");
            }else{
                System.out.println("Felicidades, adivinaste el numero en "+contador+ " intentos");
            }

            if (contador < 10) {
                System.out.println("Llevas "+contador+ " intentos, todavia te quedan.");
            }else if(contador == 10) {
                System.out.println("Ya gastaste los 10 intentos, no te quedan mas.");
            }
            
        } while (numero != numAleatorio && contador <10);

        }
    
}
