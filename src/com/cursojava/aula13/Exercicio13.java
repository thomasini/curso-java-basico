package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio13 {

    private static Scanner scanner;

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	scanner = new Scanner(System.in);
	System.out.println("Altura e sexo: ");	
	double altura = scanner.nextDouble();
	String sexo = scanner.nextLine();
	
	if(sexo.contains("masculino")){	    
	    double pesoIdealH = (72.7*altura) - 58;
	    System.out.println("Peso ideal: " + pesoIdealH);
	}
	
	if(sexo.contains("feminino")){
	    double pesoIdealM = (62.1*altura) - 44.7;
	    System.out.println("Peso ideal: " + pesoIdealM);
	     
	}
	
	

    }

}
