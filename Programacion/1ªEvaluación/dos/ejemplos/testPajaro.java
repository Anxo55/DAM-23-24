package dos.ejemplos;

public class testPajaro {

    public static void main(String[] args) { 

        //declara el nombre de una referencia
        //para manipular, apuntar a un objeto pajaro.
        pajaro p1; 

        //Crea un objeto pajaro con new pajaro
        //y lo asigna a la referencia p

        p1=new pajaro(); 
        p1.setEdad(5); 

        int numero = p1.getEdad();
        
        System.out.println("Este pajaro tiene: "+numero+ " años");

        pajaro p2 = new pajaro('F', 2343, "disecado");
        pajaro p3 = new pajaro("Pepe");

        System.out.println(p2.toString());
        System.out.println(p3.toString());

        

        }
   }
    

