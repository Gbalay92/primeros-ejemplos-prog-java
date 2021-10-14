package com.liceolapaz.des.jprf;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//pedirle nombre usuario
		pedirNombre();
		//Recibir el nombre y almacenarlo
		String nombreUsuario = recibirNombre(); 
		//Escribir el saludo por pantalla
		escribirSaludo(nombreUsuario);

	}

	private static void escribirSaludo(String nombreUsuario) {
		System.out.println("Hola " + nombreUsuario + "!");
		// TODO Auto-generated method stub
		
	}

	private static String recibirNombre() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextLine();
	}

	private static void pedirNombre() {
		System.out.print("Escriba su nombre: ");
		// TODO Auto-generated method stub
	
		
	}

}
