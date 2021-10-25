package com.liceolapaz.des.gbl;

import java.util.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	int salir=0;	
	int numeroIntentos1=3;
	int numeroIntentos2=5;
	while(salir==0) {
	System.out.print("ADIVINA EL NÚMERO: \n1.Del 1 al 10(3 intentos) \n"
			+ "2.Del 1 al 50 (5 intentos) \n0.Salir \nEscoja una opción: ");
	
		int opcion=pedirNumero();
		
		if(opcion==1) {
				
				System.out.print("Escoja un numero del 1 al 10: ");
					while(numeroIntentos1!=0){
						numeroIntentos1--;
						int intento1=pedirIntento();
						int aleatorio1=generarNumeroAleatorio(1, 10);
							if(aleatorio1==intento1) {
								System.out.println("El numero elegido es correcto");
								break;}
							
							
							else if(numeroIntentos1==0) {
								System.out.println("Ha utilizado el numero maximo de intentos, vuelva a empezar");
							}
							
								
							
							else if(aleatorio1!=intento1) {
									System.out.println("Vuelva a intentarlo, le quedan " + numeroIntentos1 + " intentos");
									if (aleatorio1>intento1); {
									System.out.println("El numero es más alto: ");}
								
									if (aleatorio1<intento1); {
										System.out.println("El número es más bajo: ");
										
									}}
								
					
			
	}}
		else if(opcion==2) {
					System.out.print("Escoja un numero del 1 al 50: ");
						while(numeroIntentos2!=0){
							numeroIntentos2--;
							int intento2=pedirIntento2();
							int aleatorio2=generarNumeroAleatorio2(1, 50);
							
								if(aleatorio2==intento2) {
									System.out.println("El numero elegido es correcto");
									break;}
								
								else if(numeroIntentos2==0) {
									System.out.println("Ha utilizado el numero maximo de intentos, vuelva a empezar");
									
								}
								
							
								else if(aleatorio2!=intento2) {
									System.out.println("Vuelva a intentarlo, le quedan " + numeroIntentos2 + " intentos: ");
								};										
						
						
								
						
					
						
					}
			
					
					}
			
	
		else if(opcion==0){
			salir++;
			System.out.println("Vuelva cuando quiera :)");
			
		}
	
	}
	}
	private static int pedirIntento2() {
		Scanner intento2= new Scanner(System.in);
		return intento2.nextInt();
	}


	private static int generarNumeroAleatorio2(int min, int max) {
		Random aleatorio=new Random();
		return aleatorio.nextInt();
	}


	private static int pedirIntento() {
		// TODO Auto-generated method stub
		Scanner intento1= new Scanner(System.in);
		return intento1.nextInt();
	}

	private static int generarNumeroAleatorio(int min, int max) {
		Random aleatorio=new Random();
		return aleatorio.nextInt();
	
		
	}

	private static int pedirNumero() {
		Scanner numero= new Scanner(System.in);
		return numero.nextInt();
		
	}
	
}
