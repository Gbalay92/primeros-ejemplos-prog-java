package com.liceolapaz.des.gbl;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Pedir numeros al usuario
		pedirNumeros();
		// Crear variable para almacenar los numeros
		int[] numeros = new int [10];
		// Leer numeros
		int contador = 0;
		do {
			numeros[contador] = leerNumero();
			contador++;
		}while (contador< 10);
		// Calcular suma y almacenar en una variable
		int sumaTotal= calcularSuma(numeros);
		// Escribir el resultado por pantalla 
		escribrirResultado(sumaTotal);
		
		
	}

	private static void escribrirResultado(int sumaTotal) {
		System.out.println("La suma de los numeros es " + sumaTotal);
		
	}

	private static int calcularSuma(int[] numeros) {
		int total = 0;
		for (int i = 0; i < numeros.length; i++) {
			total += numeros[i]; 
		}
		return total;
	}

	private static int leerNumero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirNumeros() {
		System.out.println("Escriba 10 números enteros: ");
		
	}

}
