package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio8 {

    private static Scanner scanner;

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	
	System.out.println("Quanto voc� ganha por hora?");
	scanner = new Scanner(System.in);
	int hora = scanner.nextInt();
	System.out.println("Quantas horas voc� trabalha no m�s?");
	int mes = scanner.nextInt();
	
	int salario = hora * mes;
	System.out.println("Seu sal�rio �: " + salario);
	

    }

}
