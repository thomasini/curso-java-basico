package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio2 {
    
    private static Scanner scanner;

    public static void main(String[] args){
		
	System.out.println("Digite um número: " );
	scanner = new Scanner(System.in);
	int numero = scanner.nextInt();
	System.out.println("O número informado foi: " + numero);
    }
    
   
}
