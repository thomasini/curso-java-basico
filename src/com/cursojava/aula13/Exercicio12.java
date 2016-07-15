package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio12 {

    private static Scanner scanner;

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.out.println("Qual a sua altura?");
	scanner = new Scanner(System.in);
	double altura = scanner.nextDouble();
	
	double pesoIdeal = (72.7 * altura) - 58;
	
	System.out.println("Seu peso ideal é: " + pesoIdeal);
	
    }

}
