package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio7 {

    private static Scanner scanner;

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	System.out.println("C�lculo de �rea de um quadrado. Informe um valor:");
	
	scanner = new Scanner(System.in);
	double valor = scanner.nextDouble();
	
	double area = valor * valor; //ou Math.pow(lado,2);
	
	System.out.println("�rea do quadrado �: " + area);
	System.out.println("O dobro da �rea �: " + area * 2);

    }

}
