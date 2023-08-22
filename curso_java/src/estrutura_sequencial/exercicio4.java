package estrutura_sequencial;
import java.util.Scanner;

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod, hr;
		double valor, result;
		
		System.out.println("Digite seu código de trabalho: ");
		cod = sc.nextInt();
		System.out.println("Digite sua quantidade de horas (valor cheio): ");
		hr = sc.nextInt();
		System.out.println("Digite o quanto você recebe por hora: ");
		valor = sc.nextDouble();
		result = calcSalario(hr, valor);
		System.out.printf("Código: %d%n", cod);
		System.out.printf("Salário: R$%.2f%n", result);
		sc.close();
	}
	
	static double calcSalario(int hr, double valor) {
		return hr * valor;
	}

}
