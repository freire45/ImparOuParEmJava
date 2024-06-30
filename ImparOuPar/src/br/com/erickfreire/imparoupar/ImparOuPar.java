package br.com.erickfreire.imparoupar;

import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {
		int numero = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que verifica se um valor é Impar ou Par:");
		System.out.print("Digite um valor inteiro: ");
		numero = entrada.nextInt();
		
		if(numero % 2 == 0) 
			System.out.printf("\nNúmero Par!");
		if(numero % 2 == 1)
			System.out.printf("\nNúmero Ímpar!");	

	}

}
