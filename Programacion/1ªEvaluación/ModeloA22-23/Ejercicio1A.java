//package ModeloA22-23;

import java.util.Scanner;

public class Ejercicio1A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el precio inicial: ");
        double precioInicial = sc.nextDouble();

        System.out.println("Tienes tarjeta Oro? true/false");
        boolean tarjetaOro = sc.nextBoolean();

        System.out.println("Tienes tarjeta Plata? true/false");
        boolean tarjetaPlata = sc.nextBoolean();

        System.out.println("Tienes tarjeta Bronce? true/false");
        boolean tarjetaBronce = sc.nextBoolean();

        System.out.println("La tarjeta es de tipo Star? treu/false");
        boolean tipoStar = sc.nextBoolean();

        double precioFinal = claseTarjeta(precioInicial, tarjetaOro, tarjetaPlata, tarjetaBronce, tipoStar);
        System.out.println("El precio final es: "+precioFinal);
    }

    public static double claseTarjeta(double precioInicial, boolean tarjetaOro, boolean tarjetaPlata, boolean tarjetaBronce, boolean tipoStar) {

        if(tarjetaOro) {
            precioInicial*=0.80;
        }

        if(tarjetaPlata) {
            precioInicial*=0.90;
        }

        if (tarjetaBronce) {
            precioInicial*=0.95;
        }

        if (tipoStar) {
            precioInicial*=0.95;
        }

        return precioInicial;

    }
    
}
