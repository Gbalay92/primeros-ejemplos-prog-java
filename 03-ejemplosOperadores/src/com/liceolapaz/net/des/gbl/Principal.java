package com.liceolapaz.net.des.gbl;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//pedir numero a usuario
		pedirNumero();
		//leer numero y guardar en variable 
		int numeroUsuario = leerNumero();
		//escribir si numero es par o impar
		escribirMensaje(numeroUsuario);
		
		

	}

	private static void escribirMensaje(int numeroUsuario) {
		//almacenar mensaje en variable
		String mensaje = 
				(numeroUsuario == 0) ?
						"el numero no es par ni impar":
				(numeroUsuario % 2 == 0) ? 
				"El numero introducido es par":
					"El numero intrduciodo es impar";
		//escribir por pantalla el mensaje
		System.out.println(mensaje);
	}

	private static int leerNumero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirNumero() {
		System.out.print("Escriba un numero entero: ");
	}

}
