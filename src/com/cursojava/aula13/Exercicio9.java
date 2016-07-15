package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio9 {

    private static Scanner scanner;
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	System.out.println("Digite um valor em Farenheit:");
	scanner = new Scanner(System.in);
	double farenheit = scanner.nextDouble();
	
	double celcius = (5*(farenheit-32)/9);

	System.out.println("O valor em Celcius é: " + celcius);
	
	
    }

}
