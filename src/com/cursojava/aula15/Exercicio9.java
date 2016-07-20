package com.cursojava.aula15;

import java.util.Scanner;

public class Exercicio9 {
    
    private static Scanner scanner;

    public static void main(String[] args) {

	scanner = new Scanner(System.in);
	
	System.out.println("Digite o primeiro número");
	double numero1 = scanner.nextDouble();
	
	System.out.println("Digite o segundo número");
	double numero2 = scanner.nextDouble();
	
	System.out.println("Digite o terceiro número");
	double numero3 = scanner.nextDouble();
	

	if(numero1 <= numero2 && numero1 <= numero3 && numero2 <= numero3){
	    System.out.println("Sequencia: " + numero3 + " " + numero2 + " " + numero1);
	
	}else if(numero1 <= numero2 && numero1 <= numero3 && numero3 <= numero2){
	    System.out.println("Sequencia: " + numero2 + " " +numero3 + " " + numero1);
	
	}else if(numero2 <= numero1 && numero2 <= numero3 && numero1 <= numero3){
	    System.out.println("Sequencia :" + numero3 + " " + numero1 + " " + numero2 );
	
	}else if(numero2 <= numero1 && numero2 <= numero3 && numero3 <= numero1){
	    System.out.println("Sequencia :" + numero1 + " " + numero2 + " " + numero2 );
	
	}else if(numero3 <= numero1 && numero3 <= numero2 && numero1 <= numero2){
	    System.out.println("Sequencia :" + numero2 + " " + numero1 + " " + numero3 );
	
	}else if(numero3 <= numero1 && numero3 <= numero2 && numero2 <= numero1){
	    System.out.println("Sequencia :" + numero1 + " " + numero2 + " " + numero3 );
	}
		
    }

}
