package dos.resueltos;

// Añade a la clase coche los siguientes métodos:
// int getVelocidad(). Este método devuelve la velocidad actual.
// uoid acelera(int mas). Este método actualiza la velocidad a mas kilómetros más.
// void frenafint menos). Este método actualiza la velocidad a menos kilómetros menos

public class coche {

private int velocidad; 

coche () {
    velocidad=0;
}

public int getVelocidad() {
    return this.velocidad;
}

public void setVelocidad(int velocidad) {
    this.velocidad = velocidad;
}

public void acelear(int mas) {
    velocidad +=mas;
}

public void  frenar(int menos) {
    velocidad -=menos;
}

@Override
public String toString() {
    return "coche [velocidad=" + velocidad + "]";
}

}
