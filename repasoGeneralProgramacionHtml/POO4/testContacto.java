package POO4;

public class testContacto {

    public static void main(String[] args) {

        Contacto contacto1 = new Contacto();
        Contacto contacto2 = new Contacto("Angel", 666777888, "angel@cembem.es", "Gonzalez");

        System.out.println(contacto1.toString());
        System.out.println(contacto2.toString());


        
    }
    
}
