package cuatro.recursos;

import java.util.Scanner;

public class TransformaBaseIterativo {

    public static void muestraCifras(int dat) {
        if(dat<10) {
            System.out.println(dat);
        }else{
            dat-=10;
            char c = (char) ('A' +dat);
            System.out.println(c);
        }
    }

    public static int transformaIter(int dato, int base) {
        int res = 0;
        int d = dato;
        int b = base;
        int i=0;
        do { 
            res += (int) ((d%b) * Math.pow(b, i));//para añadir posiciones a la cifra
            d = d/b;
            i++;
            if(d<b){
                res += (d) * Math.pow(b, i);
            }
        } while  (b <= d);
        return res;

    }

    public static void main(String[] args) {
        // transforma(8, 2);
        // System.out.println("");
        // transforma(12, 16);
        // System.out.println("");
        // transforma(13, 8);
        // System.out.println("");
        int base, dato;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la base: ");
        base = sc.nextInt();

        System.out.println("Dame el dato: ");
        dato = sc.nextInt();

        System.out.println("resultado-----");
        int resultado = transformaIter(dato, base);
        System.out.println(resultado);
        
    }
    
}
