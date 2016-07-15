package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio14 {
    private static Scanner scanner;

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	scanner = new Scanner(System.in);
	System.out.println("Peso dos peixes: ");	
	double pesoPeixes = scanner.nextDouble();
	
	double excesso = 0;
	double multa = 0;
	
	if(pesoPeixes > 50){
	    excesso = pesoPeixes - 50;
	    multa = excesso*4;
	    System.out.println("O peso ultrapassou o limite de 50kg permitido em: " + excesso + "kg. O valor da multa será de: " + multa + " reais");
	    
	}else{	
	System.out.println("O peso está ok! Excesso: " + excesso + " e multa: " + multa );
	}
    }

}
