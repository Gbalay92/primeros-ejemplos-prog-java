package com.liceolapaz.des.gbl;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		
		int salir=0;
		
		
		while(salir==0) {
		System.out.print("CALCULADORA \n1.Suma \n2.Resta \n3.Producto "
				+ "\n4.Divison \n0.Salir \nEscoja una opción: ");
			int opcion=opcion();
				if(opcion==1){
					System.out.print("Introduzca el valor del primer operando: ");
					int valor1=operando1();
					System.out.print("Introduzca el valor del segundo operando: ");
					int valor2=operando2();
					int resultado=valor1+valor2;
					System.out.println("El resultado de " +valor1+ " + " +valor2+ " es: "
					+ resultado ) ;
				
				
			
			}	else if(opcion==2){
					System.out.print("Introduzca el valor del primer operando: ");
					int valor1=operando1();
					System.out.print("Introduzca el valor del segundo operando: ");
					int valor2=operando2();
					int resultado=valor1-valor2;
					System.out.println("El resultado de " +valor1+ " - " +valor2+ " es: "
					+ resultado );}
				else if(opcion==3) {
					System.out.print("Introduzca el valor del primer operando: ");
					int valor1=operando1();
					System.out.print("Introduzca el valor del segundo operando: ");
					int valor2=operando2();
					int resultado=valor1*valor2;
					System.out.println("El resultado de " +valor1+ " x " +valor2+ " es: "
					+ resultado );}
				else if(opcion==4) {
					System.out.print("Introduzca el valor del primer operando: ");
					int valor1=operando1();
					System.out.print("Introduzca el valor del segundo operando: ");
					int valor2=operando2();
					int resultado=valor1/valor2;
					System.out.println("El resultado de " +valor1+ " / " +valor2+ " es: "
					+ resultado );}
				else if(opcion>4) {
					System.out.println("La opción introducida no es correcta.");
				}
				else if(opcion==0) {
					salir++;
					System.out.println("Vuelva cuando quiera :)");break;
				}

			
		}
			}
	

	private static int operando2() {
		Scanner numero3=new Scanner(System.in);
		return numero3.nextInt();
		
	}

	private static int opcion() {
		Scanner numero=new Scanner(System.in);
		return numero.nextInt();
		
	}

	private static int operando1() {
		Scanner numero2=new Scanner(System.in);
		return numero2.nextInt();
		
	}

}
