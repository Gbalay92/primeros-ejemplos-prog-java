package com.liceolapaz.des.GBL;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		escribirMenu();
		int opcion=leerEntero();
		
		switch(opcion) {
		case 0:
			System.exit(0);
			
		case 1:
			int i=pedirfilas();
			int j=pedirColumnas();
			Matriz[][] MiMatriz = new Matriz[i][j];
			for(int g=0; g<i; g++) {
				for (int h=0; h<j; h++) {
					
					System.out.print("Introduzca el valor de la posición [" + g + "]["+ h +"]: ");
					MiMatriz[g][h]=new Matriz(pedirValor());
					
				}
			
			}
			for(int l=0; l<i; l++) {
				System.out.println(" ");
				for (int m=0; m<j; m++) {
					
					System.out.print(MiMatriz[l][m].getValor() + " ");
				
					
				}
			
			}
				
			}
			

			}
			
		
		
		
	
	private static int pedirValor() {
		Scanner scaner= new Scanner(System.in);
		return scaner.nextInt();
	}



	private static int pedirColumnas() {
		System.out.print("Introduce número de columnas: ");
		Scanner columna = new Scanner(System.in);
		return columna.nextInt();
	}



	private static int pedirfilas() {
		System.out.print("Introduce número de filas: ");
		Scanner fila = new Scanner(System.in);
		return fila.nextInt();
	}



	private static int leerEntero() {
		Scanner scaner = new Scanner(System.in);
		return scaner.nextInt();
	}

	private static void escribirMenu() {
		System.out.print("MIS MATRICES\r\n"
				+ "1. Sumar\r\n"
				+ "2. Multiplicar\r\n"
				+ "3. Determinante\r\n"
				+ "4. Invertir\r\n"
				+ "5. Traspuesta\r\n"
				+ "0. Salir\r\n"
				+ "Elija una opcion: ");
	}

	
}
