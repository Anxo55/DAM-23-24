package dos.resueltos;

public class testCoche {

    //metodo para hacer que si pasa de 120 no puede acelerar y si va a pasar de 0 para abajo decirle que no puede bajar.

public static void main(String[] args) {
    
    coche cochecito= new coche();

    System.out.println(cochecito);

    cochecito.acelear(220);
    System.out.println(cochecito.toString());

    cochecito.frenar(60);
    System.out.println(cochecito.toString());

}
    
}
