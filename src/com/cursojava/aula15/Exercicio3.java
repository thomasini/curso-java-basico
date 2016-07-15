package com.cursojava.aula15;

import java.util.Scanner;

public class Exercicio3 {
    
    private static Scanner scanner;

    public static void main(String[] args) {

	scanner = new Scanner(System.in);

	System.out.println("Digite F ou M");
	String letra = scanner.next();
	
	if(letra.equals("F")){
	    System.out.println(letra + " - Feminino");
	}else if(letra.equals("M")){
	    System.out.println(letra + " - Masculino");
	}else{
	    System.out.println("Sexo inválido!");
	}

	
    }

}
