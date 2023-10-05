package dos.ejemplos;

public class testPajaro {

    public static void main(String[] args) { 

        //declara el nombre de una referencia
        //para manipular, apuntar a un objeto pajaro.
        pajaro p; 

        //Crea un objeto pajaro con new pajaro
        //y lo asigna a la referencia p

        p=new pajaro(); 
        p.setEdad(5); 

        int numero = p.getEdad();
        System.out.println("Este pajaro tiene: "+numero+ " años");
        // p.imprimeedad();
        }
   }
    

