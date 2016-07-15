package com.cursojava.aula15;

import java.util.Scanner;

public class Exercicio1 {

    private static Scanner scanner;

    public static void main(String[] args) {	
	
	scanner = new Scanner(System.in);
	
	System.out.println("Digite um número");	
	int numero1 = scanner.nextInt();
	
	System.out.println("Digite mais um número");
	int numero2 = scanner.nextInt();
	
	if(numero1 > numero2){
	    System.out.println("O primeiro número é maior que o segundo: " + numero1);
	}else if(numero2 > numero1){
	    System.out.println("O segundo número é maior que o primeiro: " + numero2);
	}else{
	    System.out.println("Os números são iguais: Número 1= " + numero1 + " e Número 2=" + numero2);
	}

    }

}
