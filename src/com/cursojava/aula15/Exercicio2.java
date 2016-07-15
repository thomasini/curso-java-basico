package com.cursojava.aula15;

import java.util.Scanner;

public class Exercicio2 {
    
    private static Scanner scanner;

    public static void main(String[] args) {

	scanner = new Scanner(System.in);

	System.out.println("Digite um número");
	int numero = scanner.nextInt();
	
	if(numero >= 0){
	    System.out.println("O número digitado é positivo: " + numero);
	}else{
	    System.out.println("O número digitado é negativo: " + numero);
	}

	
    }

}
