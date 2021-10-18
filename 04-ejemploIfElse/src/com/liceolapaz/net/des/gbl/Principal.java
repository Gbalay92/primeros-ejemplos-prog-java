package com.liceolapaz.net.des.gbl;

import java.util.Scanner;

public class Principal {
	
	private static final int ANHO_ACTUAL = 2021 ;

	public static void main(String[] args) {
		//pedir año de nacimiento
		pedirAnho ();
		//leer el año y almacenar en variable
		int anho = leerAnho();
		//escribir mensaje
		escrubirMensaje(anho);

	}

	private static void escrubirMensaje(int anho) {
		//crear una variable para almacenar el mensaje
		String mensaje;
		//comprobar anho y almacenar mensaje en la variable
		if (anho > ANHO_ACTUAL) {
			mensaje = "saludos viajero del tiempo";
		}else if (ANHO_ACTUAL - anho >= 18) { 
			mensaje = "Puedes pasar";
		}else {
			mensaje = "No puedes pasar";
		}
		//imprimir el mensaje por pantalla
		System.out.print(mensaje);
	}

	private static int leerAnho() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();

	}

	private static void pedirAnho() {
		System.out.print("Escriba su año de nacimiento: ");
		
	}

}
