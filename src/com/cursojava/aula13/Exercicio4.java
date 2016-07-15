package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio4 {

    private static Scanner scanner;

    public static void main(String[] args) {
		
	System.out.println("Digite suas 4 notas bimestrais separadas por espaço: ");
	scanner = new Scanner(System.in);
	double nota1 = scanner.nextDouble();
	double nota2 = scanner.nextDouble();
	double nota3 = scanner.nextDouble();
	double nota4 = scanner.nextDouble();
	
	double media = (nota1 + nota2 + nota3 + nota4) / 4;
	
	System.out.println("Sua média foi: " + media);

    }

}
