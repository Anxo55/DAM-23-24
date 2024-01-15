package segundo.ejemplo2_4;

public class TtrianguloRectangulo {

    enum tipoTriangulo{
        EQUILIBRISTA,ESCALENO, ISOSCELES
    }

    tipoTriangulo nombre;

    int base; // Atributo que define la base de un triángulo rectángulo
	int altura; // Atributo que define la altura de un triángulo rectángulo

	public void TrianguloRectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
        setTipoTriangulo();
	}

	double calcularArea() {
		return (base * altura / 2);
	}

	double calcularPerimetro() {
		return (base + altura + calculaHipotenusa());
	}

	public double calculaHipotenusa() {
		return Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
	}

	void setTipoTriangulo() {
		if ((base == altura) && (base == calculaHipotenusa()) && (altura == calculaHipotenusa())){
			System.out.println("Es un triángulo equilátero");
            this.nombre=tipoTriangulo.EQUILIBRISTA;
    }
		else if ((base != altura) && (base != calculaHipotenusa()) && (altura != calculaHipotenusa())){
			System.out.println("Es un triángulo escaleno");
            this.nombre=tipoTriangulo.ESCALENO;
        }else
			System.out.println("Es un triángulo isósceles");
            this.nombre=tipoTriangulo.ISOSCELES;
	}

    public tipoTriangulo getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "TtrianguloRectangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + "]";
    }


}
