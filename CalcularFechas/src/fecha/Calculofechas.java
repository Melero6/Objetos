package fecha;

import java.util.Scanner;

public class Calculofechas {

	public static void main(String[] args) {
		
        Scanner teclado = new Scanner(System.in);
		Fecha fech;
		int dia, mes, anio;
		fech=new Fecha();
		
		do{
			System.out.println("Dia");
			dia=teclado.nextInt();
			System.out.println("Mes");
			mes=teclado.nextInt();
			System.out.println("Año");
			anio=teclado.nextInt();
			fech=new Fecha(dia, mes, anio);
			
		}while(fech.getDia()==0&&fech.getMes()==0&&fech.getAnio()==0);
		
		System.out.println(""+fech.getDia()+" "+fech.getMes()+" "+fech.getAnio());

	}

}
