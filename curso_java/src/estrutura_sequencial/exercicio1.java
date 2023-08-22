package estrutura_sequencial;

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		int a, b, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois valores inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		r = somar(a, b);
		System.out.printf("A soma dos valores é: " + r);
		sc.close();
	}
	
	static int somar(int a, int b) {
		return a + b;
	}
	

}
