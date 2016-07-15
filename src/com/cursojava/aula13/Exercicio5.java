package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio5 {

    private static Scanner scanner;

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	System.out.println("Digite um valor em metros:");
	scanner = new Scanner(System.in);
	double metro = scanner.nextDouble();
	
	double centimetro = metro * 100;
	
	System.out.println("A conversão em centímetros é: " + centimetro);
	
	

    }

}
