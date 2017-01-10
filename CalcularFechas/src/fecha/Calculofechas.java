package fecha;

import java.util.Scanner;

public class Calculofechas {

	public static void main(String[] args) {
		
        Scanner teclado = new Scanner(System.in);
		Fecha fech;
		fech=new Fecha();
		
		do{
			System.out.println("Dia");
			fech.dia=teclado.nextInt();
			System.out.println("Mes");
			fech.mes=teclado.nextInt();
			System.out.println("Año");
			fech.anio=teclado.nextInt();

			
		}while(fech.dia==0&&fech.mes==0&&fech.anio==0);
		
		System.out.println("0");

	}

}
