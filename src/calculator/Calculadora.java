package calculator;

import java.util.Scanner;

public class Calculadora {
	int numero1;
	int numero2;
	
	public Calculadora(int numero1, int numero2) {
		this.numero1 = numero1;
	}
	
	public int somar(int numero1, int numero2) {
		int soma = numero1 + numero2;
		return soma;
	}
	
	public int subtrair(int numero1, int numero2) {
		int subtracao = numero1 - numero2;
		return subtracao;
	}
	
	public int dividir(int numero1, int numero2) {
		int divisao = numero1 / numero2;
		return divisao;
	}
	
	public int multiplicar(int numero1, int numero2) {
		int multiplicacao = numero1 * numero2;
		return multiplicacao;
	}
	
	public static void main(String[] args) {
		int numero1;
		int numero2;
		
		Scanner sc = new Scanner(System.in);
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		Calculadora calculadora = new Calculadora(numero1, numero2);
//		calculadora.numero1 = numero1;
//		calculadora.numero2 = numero2;
		
		int soma  = calculadora.somar(numero1, numero2);
		int subtracao = calculadora.subtrair(numero1, numero2);
		int divisao = calculadora.dividir(numero1, numero2);
		int multiplicacao = calculadora.multiplicar(numero1, numero2);
		
		System.out.println("O resultado da soma eh: " + soma + "\nO resultado da subtracao eh: " + subtracao + "\nO resultado da divisao eh: " + divisao + "\nO resultado da multiplicacao eh: " + multiplicacao);
		
		
		
		
	}
	
	

}
