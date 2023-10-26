package practicas2;

import java.util.Scanner;

// Define una clase llamada Persona con atributos nombre y edad. Agrega un método saludar que imprima un saludo personalizado.

public class Persona2 {

    private String nombre;
    private int edad;   

    Persona2() {
        super();
        this.nombre = "Angel";
        this.edad = 20;
    }

    Persona2(String nombre, int edad) {
        super();
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona2 [edad=" + edad + ", nombre=" + nombre + "]";
    }

    public void saludar() {
        System.out.println("Hola me llamo "+nombre+ " tengo "+edad+ " años es un placer conoceros a todos.");
    }

    public static Persona2 nuevaPersona() {
        Scanner sc = new Scanner(System.in);
        
        String nombrePersona;
        int edadPersona;

        System.out.println("Dame el nombre de la persona: ");
        nombrePersona = sc.nextLine();

        System.out.println("Dame la edad de la persoana;");
        edadPersona = sc.nextInt();

        Persona2 persona = nuevaPersona();

        return persona;
    }

    public static void main(String[] args) {

        Persona2 persona1 = new Persona2();
        Persona2 persona2 = new Persona2( "Pepe", 19);
        Persona2 persona3 = nuevaPersona();

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

        System.out.println("");

        persona1.saludar();
        persona2.saludar();
        
    }
    
}
