package estrutura_sequencial;
import java.util.Scanner;

//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, r;
		
		System.out.println("Digite quatro valores inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
			
		r = formDiference(a, b, c, d);
		System.out.printf("A diferença do produto A e B pelo produto C e D é: %d%n", r);
		
		sc.close();
	}
	
	static int formDiference(int a, int b, int c, int d) {
		return a * b - c * d;
	}
}
