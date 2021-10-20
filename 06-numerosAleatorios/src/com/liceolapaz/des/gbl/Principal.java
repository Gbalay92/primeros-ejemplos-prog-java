package com.liceolapaz.des.gbl;

import java.util.Random;
import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {
		//Pedimos al usuario el numero a buscar
		pedirNumeroBuscar();
		// leemos el numero y lo almacenamos
		int numeroBuscar = leerNumeroBuscar();
		// Declaramos variable para almacenar el numero maximo de intentos
		pedirMaximoIntentos();
		//leemos el numero maximo de intentos y lo almacenamos
		int maximoIntentos = leerNumeroBuscar();
		//Generamos numero aleatorio
		int numeroIntentos = 0;
		while (numeroIntentos < maximoIntentos) {
		int numeroAleatorio = (int) generarNumeroAleatorio(1,10);
		//SUmar 1 a los intento
		System.out.println("El numero generado fue: " + numeroAleatorio);
		//Comprobar si el numero geneado es igual al numero a buscar
		numeroIntentos++;
		comprobarNumero(numeroBuscar, numeroAleatorio, numeroIntentos, maximoIntentos);
		
		//si lo es, imprimir por pantalla 
		//si no lo es y hay as intentos habria que repetir desde punto 4
		//si no hay mas intentos escribir otro mensaje.
		if (numeroAleatorio==numeroBuscar){break;
		//si encontramos numero salir de bucle
		}
		}

	}

	private static void comprobarNumero(int numeroBuscar, int numeroAleatorio, int numeroIntentos, int maximoIntentos) {
		if (numeroBuscar == numeroAleatorio) {
			System.out.println("Numero encontrado en " + numeroIntentos + "intentos");		
		}
		else if (numeroIntentos < maximoIntentos) 
			return;{
		
			System.out.println("no se ha podido encontrar el numero en " + maximoIntentos + " intentos");
					}	
	}
	private static Object generarNumeroAleatorio(int min, int max) {
		Random random = new Random();
		return random.nextInt(max-min)+ min;
	}

	private static void pedirMaximoIntentos() {
		// TODO Auto-generated method stub
		System.out.print("Escriba el numero maximo de intentos: ");
	}

	private static int leerNumeroBuscar() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
		
	}

	private static void pedirNumeroBuscar() {
		// TODO Auto-generated method stub
		System.out.print("Escriba el numero a buscar(entre 1 y 10): ");
	}

}
