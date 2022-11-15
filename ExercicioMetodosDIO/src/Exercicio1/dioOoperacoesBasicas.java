package Exercicio1;

import java.util.Scanner;

//Exercicio 1 proposto pelo curso de Metodos em Java da DIO//

public class dioOoperacoesBasicas {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print ("Digite um número: ");
		double a= scan.nextDouble();
		System.out.print ("Agora, digite outro número: ");
		double b= scan.nextDouble();
		
		double resultado = a + b;
		
	 System.out.println ("A soma dos números "+a + " com "+b + "é igual a " + resultado);
	}
	
	
	}
