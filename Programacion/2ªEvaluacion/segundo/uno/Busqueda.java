package segundo.uno;

import java.util.Scanner;

public class Busqueda {

    public static void mostrarArray(int[] array) {
        

        int n = array.length;

        System.out.println("Elementos del array");

        System.out.print("[ ");
        for(int i=0; i<n;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.print("]");

    }

    public static boolean isInArray(int[] arr, int numero) {

        boolean esta = false;
        return esta;

    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,3,4,4,5,2};
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        mostrarArray(arr);
        
        System.out.println();
        System.out.println("Dame un entero: ");
        int numero = sc.nextInt();
        int contador = 0;

        for(int i=0; i<n; i++) {
            if(arr[i]==numero) 
                contador++;
            
        }

        if(contador==0)
            System.out.println("No aparece");
        else    
            System.out.println("Aparece "+contador+" veces");
        
    }
    
}
