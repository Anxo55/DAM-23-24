package cuatro.ejemplos;

import uno.rectangulo;

public class Rectangulo implements Cloneable{
    
    private int ancho = 0;
    private int alto = 0;

    Rectangulo(int ancho, int alto) {
        this.ancho = ancho; //se puede omitir el this
        this.alto = alto;
    }

    //Constructor de copia
    Rectangulo(Rectangulo rectangulo) {
        this.ancho=rectangulo.ancho;
        this.alto=rectangulo.alto;
    }

   public Object Clone() {
    Object objeto = null;
    try {
        objeto = super.clone();
    } catch (CloneNotSupportedException ex) {
        System.out.println("Error al duplicar");
    }
    return (Rectangulo) objeto;
   }

    public int getAncho() {
        return this.ancho;
    }

    public int getAlto() {
        return alto;
    }

    public Rectangulo incrementaAncho() {
        ancho++;
        return this;
    }

    public Rectangulo incrementaAlto() {
        this.alto++;
        Rectangulo fake = new Rectangulo(4, 4);
        return fake;
    }

    @Override
    public String toString() {
        return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
    }
    
}
