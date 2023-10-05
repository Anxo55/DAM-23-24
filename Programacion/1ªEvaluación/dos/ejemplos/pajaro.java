package dos.ejemplos;

public class pajaro {

     //*** atributos o propiedades ****
        private char color; //propiedad o atributo color 
        private int edad; //propiedad o atributo edad 
        private String nombre; //propiedad o atributo nombre;

       /*  public pajaro(char color, int edad, String nombre) {
            this.color = color;
            this.edad = edad;
            this.nombre = nombre;
        }*/

        //*** métodos de la clase **** 
        public void setNombre(String n) {
            this.nombre = n;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setEdad(int e){
            this.edad = e;
        } 

        public int getEdad() {
            return this.edad;
        }

        public void setColor(char c){
            this.color=c;
        } 

        public char getColor() {
            return this.color;
        }
        

        public void imprimecolor(){ 

        switch(color){

        //Los pájaros son verdes, amarillos, grises, negros o blancos 
        //No existen pájaros de otros colores
        case 'v': 
        System.out.println("verde");
        break; 

        case 'a': 
        System.out.println("amarillo");
        break; 

        case 'g': 
        System.out.println("gris");
        break;
        
        case 'n': 
        System.out.println("negro");
        break; 

        case 'b': 
        System.out.println("blanco");
        break; 

        default:
        System.out.println("color no establecido");
    
            }
        }

        public void imprimenombre() {
            System.out.println(nombre);
        }

        public void imprimeedad() {
            System.out.println(edad);

        }
    }
