package com.cursojava.aula15;

import java.util.Scanner;

public class Exercicio5 {
    
    private static Scanner scanner;

    public static void main(String[] args) {

	scanner = new Scanner(System.in);

	System.out.println("Digite a primeira nota");
	double nota1 = scanner.nextDouble();
	
	System.out.println("Digite a segunda nota");
	double nota2 = scanner.nextDouble();
	
	double media = (nota1 + nota2)/2;
	
	if(media == 10){
	    System.out.println(media + " - APROVADO com distinção");
	}else if(media < 7){
	    System.out.println(media + " - REPROVADO...");
	}else if(media >= 7){
	    System.out.println(media + " - APROVADO!!");
	}

	
    }

}
