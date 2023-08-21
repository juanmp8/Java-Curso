package estrutura_sequencial;

import java.util.Scanner;

public class entrada_dados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, person;
		int idade;
		char sexo;
		double saldo;
		System.out.println("Digite seu nome:");
		name = sc.next();
		System.out.println("Digite sua idade:");
		idade = sc.nextInt();
		System.out.println("Digite seu sexo:");
		sexo = sc.next().charAt(0);
		System.out.println("Digite seu saldo:");
		saldo = sc.nextDouble();
		sc.nextLine();
		System.out.printf("nome: %s%n", name);
		System.out.printf("idade: %d%n", idade);
		System.out.printf("sexo: %c%n", sexo);
		System.out.printf("saldo: %.2f%n", saldo);
		
		System.out.println("Fale um pouco sobre você:");
		person = sc.nextLine();
		System.out.printf("Personalidade: %s%n", person);
		sc.close();
	}
}
