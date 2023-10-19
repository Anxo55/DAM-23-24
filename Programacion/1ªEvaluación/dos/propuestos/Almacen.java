package dos.propuestos;

// 12. Modifica el programa anterior creando una clase que permita almacenar los kilos de papas y chocos del 
// restaurante. Implementa los siguientes métodos:

// public void addChocos(int x). Añade x kilos de chocos a los ya existentes.
// public void addPapas(int x). Añade x kilos de papas a los ya existentes.
// public int getComensales(). Devuelve el número de clientes que puede atender el restaurante (este es el 
// método anterior).

// public void showChocos(). Muestra por pantalla los kilos de chocos que hay en el almacén. 
// public void showPapas(). Añade Muestra por pantalla los kilos de papas que hay en el almacén.

public class Almacen {

    //atributos
    double patatas;
    double chocos;

    Almacen() {
        
    }

    Almacen(double patatas, double chocos) {
        this.patatas = patatas;
        this.chocos = chocos;
        
    }

    public double getPatatas() {
        return patatas;
    }

    public void setPatatas(double patatas) {
        this.patatas = patatas;
    }

    public double getChocos() {
        return chocos;
    }

    public void setChocos(double chocos) {
        this.chocos = chocos;
    }


    @Override
    public String toString() {
        return "Almacen [patatas=" + patatas + ", chocos=" + chocos + "]";
    }

    //cuando creo un metodo almacen no puede ser statico al recorrer cuantos comensales entran diariamente
    public int getComensales() {
        int comensales = 0;

        //sobran patatas, FALTAN chocos
        if (patatas >= chocos*2) {
            comensales = 3 * (int) (chocos / 0.5);
            //como actualizo el almacen
        } 
        //SOBRAN CHOCOS, FALTAN patatas
        else {
            comensales = 3 * (int) (patatas / 1);
            //ponme al dia las patatas y los chocos
        }
        return comensales;
    }
    
}
