package com.cursojava.aula15;

import java.util.Scanner;

public class Exercicio4 {
    
    private static Scanner scanner;

    public static void main(String[] args) {

	scanner = new Scanner(System.in);

	System.out.println("Digite uma letra");
	String letra = scanner.next();
	
	if(letra.length() > 1){
	    System.out.println("Nao é uma letra valida");
	    
	}else{
	    if(letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
        	System.out.println(letra + " é vogal");
	    }else{
		System.out.println(letra + " é consoante");
	    }
	}

	//ou
	/*
	 * switch(letra){
	 * case "a":
	 * case "e":
	 * case "i":
	 * case "o":
	 * case "u": System.out.println(letra + " é vogal"); break; 
	 * default: System.out.println(letra + " é consoante");
	 *  
	 */
	
    }

}
