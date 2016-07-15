package com.cursojava.aula15;

import java.util.Scanner;

public class Exercicio9 {
    
    private static Scanner scanner;

    public static void main(String[] args) {

	scanner = new Scanner(System.in);

	System.out.println("Digite a letra correspondente ao seu turno, sendo M - matutino, V - vespertino ou N - noturno");
	String turno = scanner.next();
		
	if(turno.equals("M")){
	    System.out.println("Bom dia!!");
	}else if(turno.equals("V")){
	    System.out.println("Boa tarde!!");
	}else if(turno.equals("N")){
	    System.out.println("Boa noite!!");
	}else{
	    System.out.println("Valor inválido!");
	}
			
    }

}
