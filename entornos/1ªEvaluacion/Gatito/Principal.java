package Gatito;

public class Principal {

    public static void main(String[] args) {

        //EJEMPLO
        String mensaje = "Hola, soy el main";
        System.out.println(mensaje);
        
        Gato gato1 = new Gato();
        Gato gato2 = new Gato("Lili", 3);
        

        System.out.println("Hola soy el gato 2 y me llamo: "+gato2.getNombre());
        System.out.println("Hola soy el gato 2 y tengo: "+gato2.getEdad()+ " años");

        System.out.println("");

        Gato.darDefinicionGato();

    }
    
}
