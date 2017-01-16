package fecha;

import java.util.Scanner;

public class Calculofechas {

	public static void main(String[] args) {
		
        Scanner teclado = new Scanner(System.in);
		Fecha fech, fech1, fech2, fech3, fechAux;
		int resultado;
		System.out.println("- Calculo de fechas -\nIntroduce el numero de la opcion que quieras seleccionar:\n1- Diferencia de dias.\n2- Suma de dias.\n3- Dia de la semana de una fecha.");
		fechAux=new Fecha();
		fech=new Fecha();
		fech1=new Fecha();
		fech1=fech.validador();
		fech2=new Fecha();
		fech2=fech.validador();
		resultado=fech1.diferencia(fech2);
		
		System.out.println("- Calculo de fechas -\nIntroduce el numero de la opcion que quieras seleccionar\n1- Diferencia de dias.\n2- Suma de dias.\n3- Dia de la semana de una fecha.");
		
		//crear el menu con las 3 opciones
		//diferencia fechas +
		//dia de la semana
		//suma de dia
		// 1-1-1 jueves
		//aqui llamamos a los metodos que pondremos en fecha
		//con get y set pasamos y leemos atributos
		
		System.out.println(""+fech1.getDia()+" "+fech1.getMes()+" "+fech1.getAnio());
		System.out.println(""+fech2.getDia()+" "+fech2.getMes()+" "+fech2.getAnio());
		System.out.println("Hay "+resultado+" dias de diferencia.");
		
	}

}
