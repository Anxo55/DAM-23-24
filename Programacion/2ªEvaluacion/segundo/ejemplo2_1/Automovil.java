package segundo.ejemplo2_1;

public class Automovil {

    private String marca;
    private int modelo;
    private int motor;
    private int numeroPuertas;
    private int cantidadAsientos;
    private int velocidadMaxima;
    private tipoColor color;
    private int velocidadActual;

    enum tipoColor{
        BLANCO, NEGRO, ROJO,NARANJA, AMARILLO, VERDE,AZUK,VIOLETA
    }

    enum tipoCombustible{
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }

    enum tipoAutomovil{
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }
    
}
