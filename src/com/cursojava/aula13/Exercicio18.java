package com.cursojava.aula13;

import java.util.Scanner;

public class Exercicio18 {

    private static Scanner scanner;
    
    public static void main(String[] args) {
		
	scanner = new Scanner(System.in);
	
	System.out.println("Entre com o tamanho do arquivo:");
	double tamanhoArq = scanner.nextDouble();
	
	System.out.println("Entre com a velocidade da internet:");
	double velocidade = scanner.nextDouble();
	
	double tempo = tamanhoArq / velocidade;
	
	System.out.println("Tempo de download: " + tempo);
    }

}
