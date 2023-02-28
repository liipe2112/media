package aluno;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Idade: ");
		int idade = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Curso: ");
		String curso = entrada.nextLine();
		
		Aluno aluno = new Aluno("Felipe", 29, "ADS", new double[4]);
		
		aluno.lerNotas(entrada);
		
		double media = aluno.calcularMedia();
		
		System.out.printf("Média: %.2f\n", media);
	}
}
