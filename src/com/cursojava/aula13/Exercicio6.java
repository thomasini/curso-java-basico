package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio6 {

    private static Scanner scanner;

    public static void main(String[] args) {
	/*
	System.out.println("Digite o raio de um c�rculo:");
	scanner = new Scanner(System.in);
	double raio = scanner.nextDouble();
	
	double area = 3.14 * (raio * raio);
	
	System.out.println("O valor da �rea � de: " + area);
	*/
	//OU
	
	   scanner = new Scanner(System.in);
	   System.out.println("Digite o raio de um c�rculo:");	   
	   double raio = scanner.nextDouble();
	
	   double area = Math.PI * Math.pow(raio, 2);
	
	   System.out.println("O valor da �rea � de: " + area);
	  

    }

}
