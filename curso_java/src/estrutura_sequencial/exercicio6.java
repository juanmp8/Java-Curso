package estrutura_sequencial;
import java.util.Scanner;

/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */

public class exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		System.out.println("Digite três valores: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		triangulo = areaTriangulo(a, c);
		circulo = areaCirculo(c);
		trapezio = areaTrapezio(a, b, c);
		quadrado = areaQuadrado(b);
		retangulo = areaRetangulo(a, b);
		System.out.printf("A área do triângulo retângulo é: %.3f%n", triangulo);
		System.out.printf("A área do círculo é: %.3f%n", circulo);
		System.out.printf("A área do trapézio é: %.3f%n", trapezio);
		System.out.printf("A área do quadrado é: %.3f%n", quadrado);
		System.out.printf("A área do retângulo é: %.3f%n", retangulo);
		
		sc.close();

	}
	
	static double areaTriangulo(double a, double c) {
		return (a * c) / 2;
	}
	
	static double areaCirculo(double raio) {
		final float pi = 3.14159F;
		return pi * Math.pow(raio, 2);	
	}
	
	static double areaTrapezio(double a, double b, double altura) {
		return (a + b) / 2 * altura;
	}
	
	static double areaQuadrado(double b) {
		return b * b;
	}
	
	static double areaRetangulo(double a, double b) {
		return a * b;
	}
	

}
