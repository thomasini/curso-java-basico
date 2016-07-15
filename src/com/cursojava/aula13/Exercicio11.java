package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio11 {

    private static Scanner scanner;

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.out.println("Digite 2 números inteiros e 1 numero real, na sequência e com espaço:");
	scanner = new Scanner(System.in);
	int inteiro1 = scanner.nextInt();
	int inteiro2 = scanner.nextInt();
	double numero3 = scanner.nextDouble();
	
	double a = (inteiro1*2) * (inteiro2/2);
	double b = (3*inteiro1) + numero3;
	double c = numero3*numero3*numero3; //ou Math.pow(numero3,3);
	
	System.out.println("A - o produto do dobro do primeiro com metade do segundo: " + a);
	System.out.println("B - a soma  do triplo do primeiro com o terceiro :" + b);
	System.out.println("C - o terceiro elevado ao cubo :" + c);
	
	
    }

}
