package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio3 {

    private static Scanner scanner;

    public static void main(String[] args) {
	// TODO Auto-generated method stub	

	scanner = new Scanner(System.in);
	System.out.println("Digite o primeiro número:");
	int numero1 = scanner.nextInt();
	
	System.out.println("Digite o segundo número:");
	int numero2 = scanner.nextInt();
	
	int soma = numero1 + numero2;
	
	System.out.println("A soma de " + numero1 + " + " + numero2 + " é igual a: " + soma);
	
	

    }

}
