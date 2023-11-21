package cuatro.ejemplos;

import uno.rectangulo;

public class Rectangulo implements Cloneable{
    
    private int ancho = 0;
    private int alto = 0;
    private String nombre;

    Rectangulo(int ancho, int alto, String nombre) {
        this.ancho = ancho; //se puede omitir el this
        this.alto = alto;
        this.nombre=nombre;
    }

    //Constructor de copia
    Rectangulo(Rectangulo rectangulo) {
        this.ancho=rectangulo.ancho;
        this.alto=rectangulo.alto;
        this.nombre = rectangulo.nombre;
    }

   public Rectangulo Clone() {
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
        // Rectangulo fake = new Rectangulo(4, 4);
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Rectangulo [ancho=" + ancho + ", alto=" + alto + ", nombre=" + nombre + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        // // TODO Auto-generated method stub
        // return super.equals(obj);
        Rectangulo r = (Rectangulo) obj;
        if(this.alto==r.alto && this.ancho == r.ancho && this.nombre == r.nombre) {
            return true;
        }else{
            return false;
        }
        
    }
    
}
