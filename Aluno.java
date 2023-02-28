package aluno;

import java.util.Arrays;
import java.util.Scanner;

/*Crie uma classe Aluno que possua os atributos nome, idade, curso e notas. Adicione o método calcularMedia() para calcular a média das notas do aluno. 
 *Crie um objeto Aluno e teste o método calcularMedia(). */

public class Aluno {
	private String nome;
	private int idade;
	private String curso;
	private double[] notas;
	
	public Aluno(String nome, int idade, String curso, double[] notas) {
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return Arrays.stream(notas).average().orElse(0.0);

	}
	
	public void lerNotas(Scanner entrada2) {
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
	}
}
