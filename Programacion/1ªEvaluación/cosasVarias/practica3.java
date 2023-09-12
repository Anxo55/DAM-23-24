package cosasVarias;

// Clase donde vamos a introducir varios metodos, en el cual escogeremos el que vamos a usar.
// Utilizaremos un metodo switch donde incluiremos los metodos de suma, resta, multiplicacion y division.

public class practica3 {
    
    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;
        char operacion = '+'; // Cambia este carácter para seleccionar la operación: +, -, *

        double resultado = calcular(num1, num2, operacion);
        System.out.println("Resultado: " + resultado);
    }

    public static double calcular(double num1, double num2, char operacion) {
        double resultado = 0.0;

        switch (operacion) {
            case '+':
                resultado = sumar(num1, num2);
                break;
            case '-':
                resultado = restar(num1, num2);
                break;
            case '*':
                resultado = multiplicar(num1, num2);
                break;
                case'/':
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Operación no válida");
        }

        return resultado;
    }

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2; 
    }
}
    

