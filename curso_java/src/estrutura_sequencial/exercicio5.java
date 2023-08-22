package estrutura_sequencial;
import java.util.Scanner;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c1, qnt1, c2, qnt2;
		double p1, p2, pag;
		
		System.out.println("Digite o código da peça 1: ");
		c1 = sc.nextInt();
		System.out.println("Digite a quantidade de peças no estoque: ");
		qnt1 = sc.nextInt();
		System.out.println("Digite o preço de cada peça: ");
		p1 = sc.nextDouble();
		System.out.println("Digite o código da peça 2: ");
		c2 = sc.nextInt();
		System.out.println("Digite a quantidade de peças no estoque: ");
		qnt2 = sc.nextInt();
		System.out.println("Digite o preço de cada peça: ");
		p2 = sc.nextDouble();
		pag = valorPecas(qnt1, qnt2, p1, p2);
		System.out.printf("O valor a pagar pelas peças é de: R$%.2f%n", pag);
		sc.close();
	}
	
	static double valorPecas(int qntd1, int qnt2, double price1, double price2) {
		return qntd1 * price1 + qnt2 * price2;
	}

}
