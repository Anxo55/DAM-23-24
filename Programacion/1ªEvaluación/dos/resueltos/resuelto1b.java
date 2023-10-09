package dos.resueltos;

import java.util.Scanner;

public class resuelto1b {

    
    public static double celsiusToFarenheit(double celsius) {
        return (1.8) * celsius + 32;
    }

    public static double farenheitToCelsius(double fahr) {
        return (fahr - 32)/1.8;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valor;
        char letra;

        System.out.println("Dame el valor en grados centigrados: ");
        valor = sc.nextDouble();

        System.out.println("Pulsa C para pasar de celsius a farenheit");
        System.out.println("");
        System.out.println("Pulsa F para pasar de farenheit a celsius");
        System.out.println("");

        letra = sc.next().charAt(0);

        switch (letra) {
            case 'C':
                System.out.println("Los grados de celsius a farenheit son: "+celsiusToFarenheit(valor));
                break;

            case 'F':
                System.out.println("Los grados de farenheit a celsius son: "+farenheitToCelsius(valor));    
                break;
        
            default:
                System.out.println("Opcion no valida...");
                break;
        }
        
    }
    
}
