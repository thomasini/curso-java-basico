package com.cursojava.aula15;

import java.util.Scanner;

public class Exercicio6 {
    
    private static Scanner scanner;

    public static void main(String[] args) {

	scanner = new Scanner(System.in);

	System.out.println("Digite o primeiro número");
	double numero1 = scanner.nextDouble();
	
	System.out.println("Digite o segundo número");
	double numero2 = scanner.nextDouble();
	
	System.out.println("Digite o terceiro número");
	double numero3 = scanner.nextDouble();
	
	if(numero1 >= numero2 && numero1 >= numero3){
	    System.out.println("O primeiro é o maior");
	}else if(numero2 >= numero1 && numero2 >= numero3){
	    System.out.println("O segundo é o maior");
	}else if(numero3 >= numero1 || numero3 >= numero2){
	    System.out.println("O terceiro é o maior");
	}
	
    }

}
