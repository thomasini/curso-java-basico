package com.cursojava.aula15;

import java.util.Scanner;

public class Exercicio1 {

    private static Scanner scanner;

    public static void main(String[] args) {	
	
	scanner = new Scanner(System.in);
	
	System.out.println("Digite um n�mero");	
	int numero1 = scanner.nextInt();
	
	System.out.println("Digite mais um n�mero");
	int numero2 = scanner.nextInt();
	
	if(numero1 > numero2){
	    System.out.println("O primeiro n�mero � maior que o segundo: " + numero1);
	}else if(numero2 > numero1){
	    System.out.println("O segundo n�mero � maior que o primeiro: " + numero2);
	}else{
	    System.out.println("Os n�meros s�o iguais: N�mero 1= " + numero1 + " e N�mero 2=" + numero2);
	}

    }

}
