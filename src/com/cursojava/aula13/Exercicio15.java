package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio15 {
    
    private static Scanner scanner;

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	

	System.out.println("Quanto voc� ganha por hora?");
	scanner = new Scanner(System.in);
	int hora = scanner.nextInt();
	System.out.println("Quantas horas voc� trabalha no m�s?");
	int mes = scanner.nextInt();
	
	int salarioBruto = hora * mes;
	double inss = (salarioBruto / 100) * 8;
	double sindicato = (salarioBruto / 100) * 5;
	double ir = (salarioBruto / 100) * 11;
	double totalDescontos = inss + sindicato + ir;
	double salarioliquido = salarioBruto - totalDescontos;
	
	System.out.println("Seu sal�rio bruto �: " + salarioBruto);
	System.out.println("INSS: " + inss);
	System.out.println("Sindicato: " + sindicato);
	System.out.println("Imposto de renda: " + ir);
	System.out.println("Total de descontos: " + totalDescontos);
	System.out.println("Seu sal�rio l�quido �: " + salarioliquido);

    }

}
