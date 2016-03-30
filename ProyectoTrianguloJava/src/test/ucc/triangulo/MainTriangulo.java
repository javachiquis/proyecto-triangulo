package test.ucc.triangulo;

import java.util.Scanner;

public class MainTriangulo {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Triangulo triangulo = new Triangulo();		
		
		System.out.println("Digite el valor del lado 1 en cm: ");
		int lado1 = teclado.nextInt();
		triangulo.setLado1(lado1);
		
		System.out.println("Digite el valor del lado 2 en cm: ");
		int lado2 = Integer.parseInt(teclado.next());
		triangulo.setLado2(lado2);
		
		System.out.println("Digite el valor de la base en cm: ");
		int base = Integer.parseInt(teclado.next());
		triangulo.setBase(base);
		
		System.out.println("Digite el valor de la altura en cm: ");
		int altura = Integer.parseInt(teclado.next());
		triangulo.setAltura(altura);
		
		System.out.println("Digite el valor del angulo 1: ");
		int angulo1 = Integer.parseInt(teclado.next());
		triangulo.setAngulo1(angulo1);
		
		System.out.println("Digite el valor del angulo 2: ");
		int angulo2 = Integer.parseInt(teclado.next());
		triangulo.setAngulo2(angulo2);
		
		System.out.println("Digite el valor del angulo 3: ");
		int angulo3 = Integer.parseInt(teclado.next());
		triangulo.setAngulo3(angulo3);
		
		teclado.close();
		
		System.out.println(triangulo.mostrarDatos());
		
	}
}
