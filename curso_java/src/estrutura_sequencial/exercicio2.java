package estrutura_sequencial;
import java.util.Scanner;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float raio;
		double area;
		System.out.println("Digite o valor do raio de um círculo: ");
		raio = sc.nextFloat();
		area = calcRaio(raio);
		System.out.printf("O valor da área deste círculo é: %.4f%n", area);
		sc.close();
	}
	
	static double calcRaio(float raio) {
		final float pi = 3.14159F;
		return pi * Math.pow(raio, 2);
	}
	
}
