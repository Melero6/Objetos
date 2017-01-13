package fecha;

import java.util.Scanner;

public class Calculofechas {

	public static void main(String[] args) {
		
        Scanner teclado = new Scanner(System.in);
		Fecha fech, fech1, fech2;

		fech=new Fecha();
		fech1=new Fecha();
		fech1=fech.validador();
		//crear el menu con las 3 opciones
		//diferencia fechas
		//dia de la semana
		//suma de dia
		
		
		System.out.println(""+fech1.getDia()+" "+fech1.getMes()+" "+fech1.getAnio());
		

		
	}

}
