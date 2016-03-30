package test.ucc.triangulo;

public class Triangulo {

	public int lado1;
	public int lado2;
	public int base;
	public int altura;
	public int angulo1;
	public int angulo2;
	public int angulo3;

	public Triangulo() {

	}
	
	/**
	 * @return
	 */
	public boolean validarDatos() {
		
		boolean anguloValido = false;
		boolean ladoValido = false;
		
		if ((angulo1 + angulo2 + angulo3) == 180) {
			anguloValido = true;
		}
		else {
			System.out.println("La suma de los angulos no correpsonde a un triangulo valido");
		}
		
		if (((lado1 + lado2) > base) && ((lado1 + base) > lado2) && ((lado2 + base) > lado1)){
			ladoValido = true;
		} else {
			System.out.println("La medida de uno de los lados debe ser menor que la suma de los otros dos lados");
		}
		
		return anguloValido && ladoValido;
	}
	
	/**
	 * @return
	 */
	public int calcularPerimetro() {
		int perimetro = 0;
		
		if (validarDatos()) {
			perimetro = lado1 + lado2 + base;
		}
		
		return perimetro;
	}
	
	/**
	 * @return
	 */
	public int calcularArea() {
		int area = 0;
		
		if (validarDatos()) {
			area = (base * altura) / 2;
		}
		
		return area;
	}
	
	/**
	 * @return
	 */
	public String calcularTipo() {
		String tipo = "NA";
			
		if (validarDatos()) {
			if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
				tipo = "Triangulo Rectangulo";
			} else if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
				tipo = "Triangulo Acutangulo";
			} else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
				tipo = "Triangulo Obtusangulo";
			}
		}
		return tipo;
	}

	/**
	 * @return
	 */
	public String mostrarDatos() {
		return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", base=" + base + ", altura=" + altura + ", angulo1="
				+ angulo1 + ", angulo2=" + angulo2 + ", angulo3=" + angulo3 + "]\nPerimetro="
				+ calcularPerimetro() + "cm\nArea=" + calcularArea() + "cm2\nTipo de triangulo=" + calcularTipo();
	}

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAngulo1() {
		return angulo1;
	}

	public void setAngulo1(int angulo1) {
		this.angulo1 = angulo1;
	}

	public int getAngulo2() {
		return angulo2;
	}

	public void setAngulo2(int angulo2) {
		this.angulo2 = angulo2;
	}

	public int getAngulo3() {
		return angulo3;
	}

	public void setAngulo3(int angulo3) {
		this.angulo3 = angulo3;
	}

}
