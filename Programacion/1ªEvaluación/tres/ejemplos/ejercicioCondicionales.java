package tres.ejemplos;

// Se quiere determinar el importe a facturar a los clientes de unos grande almacenes segun estos criterios;
// Si pagan con tarjeta oro tendran un 15% descuento
// Si pagan con tarjeta club tendran un 5% descuento
// Si la tarjeta (oro o club) es modalidad joven, tedran un 5% de descuento.
// Los descuentos son acumulables.

import java.util.Scanner;

public class ejercicioCondicionales {

public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

        double precioTotal;  
        boolean tieneTarjetaOro = true;
        boolean tieneTarjetaClub = true;
        boolean esModalidadJoven = true;

        System.out.println("Dame el precio total: ");
        precioTotal = sc.nextDouble();
        
        
        double descuento = 0.0;
        
        if (tieneTarjetaOro) {
            descuento += 0.15; 
        }
        
        if (tieneTarjetaClub) {
            descuento += 0.05; 
        }
        
        if (esModalidadJoven) {
            descuento += 0.05; 
        }
        
       
        double importeFactura = precioTotal - (precioTotal * descuento);
        
        System.out.println("Importe a facturar: " + importeFactura);
    }
}
