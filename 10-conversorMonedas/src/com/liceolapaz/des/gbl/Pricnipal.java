package com.liceolapaz.des.gbl;
import java.util.*;
public class Pricnipal {

	public static void main(String[] args) {
		
		int salir = 0;
		while(salir==0) {
			System.out.print("CONVERSOR DE MONEDAS \n1.Dolares \n2.Libras \n3.Yenes"
					+ " \n0.Salir \nEscoja una opción: ");
			double opcion=elegirOpcion();
			double dollar=0.86;
			double libra=1.19;
			double yen=0.0075;
			if(opcion==1) {
				System.out.print("Escriba la cantidad: ");
				double moneda=introduzcaMoneda();
				double resultado=moneda/dollar;
				System.out.println("La cantidad en euros es " + resultado);
			}else if(opcion==2) {
				System.out.print("Escriba la cantidad: ");
				double moneda=introduzcaMoneda();
				double resultado=moneda/libra;
				System.out.print("La cantidad en euros es " + resultado);
			}else if(opcion==3) {
				System.out.print("Escriba la cantidad: ");
				double moneda=introduzcaMoneda();
				double resultado=moneda/yen;
				System.out.println("La cantidad en euros es " + resultado);
			} else if(opcion==0) {
				System.out.println("Vuelva cuando quiera :)");
				System.exit(0);
			}else if (opcion>3) {
				System.out.println("La clave intorducida no es correcta, vuelva a intentarlo: ");
			}
		}
	}
	private static double introduzcaMoneda() {
		Scanner moneda= new Scanner(System.in);
		return moneda.nextDouble();
	}
	private static double elegirOpcion() {
		Scanner numero=new Scanner(System.in);
		return numero.nextDouble();	
	}
}