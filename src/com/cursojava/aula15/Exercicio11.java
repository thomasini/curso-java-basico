package com.cursojava.aula15;

import java.util.Scanner;

public class Exercicio11 {
    
    private static Scanner scanner;

    public static void main(String[] args) {

	scanner = new Scanner(System.in);

	System.out.println("Digite seu sal�rio");
	double salario = scanner.nextDouble();
	
	int percentual = 0;
	
	if(salario <= 280){
	    percentual = 20;
	}else if(salario > 280 && salario < 700){
	    percentual = 15;
	}else if(salario >= 700 && salario < 1500){
	    percentual = 10;
	}else if(salario >= 1500){
	    percentual = 5;
	}
	
	double aumento = (salario / 100) * percentual;
	double novoSalario = salario + aumento;
	
	System.out.println("Salario: " + salario);
	System.out.println("Percentual: " + percentual);
	System.out.println("Aumento: " + aumento);
	System.out.println("Salario ajustado: " + novoSalario);
    }

}
