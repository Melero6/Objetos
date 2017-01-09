package Pregs;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int anio0, mes0, dia0, anio1, mes1, dia1;//para las fechas
		int total=0, i, dat0, dat1;//total de días, contador y comprobador fechas
		//lectura de las fechas
		System.out.print("Introduce el año desde: ");
		anio0 = teclado.nextInt();
		System.out.print("Introduce el mes desde: ");
		mes0 = teclado.nextInt();
		System.out.print("Introduce el día desde: ");
		dia0 = teclado.nextInt();
		System.out.print("Introduce el año hasta: ");
		anio1 = teclado.nextInt();
		System.out.print("Introduce el mes hasta: ");
		mes1 = teclado.nextInt();
		System.out.print("Introduce el día hasta: ");
		dia1 = teclado.nextInt();
		dat0= anio0*1000+mes0*100+dia0;
		dat1= anio1*1000+mes1*100+dia1;
		if (dat1<dat0) System.out.println("Error. Fecha hasta menor que fecha desde");
		else{		
			if (anio1>anio0){//fechas en años distintos

				for (i=anio0+1 ; i<anio1 ; i++){//suma de años
					total = total + 365;
					if (i%4==0)	total = total + 1;
				}
				for (i=mes0+1; i<13; i++){//suma de meses de año de inicio
					if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31;
					if (i==4 ||i==6||i==9||i==11) total=total+30;
					if (i==2) total=total+28;
					if (i==2 && anio0%4==0) total=total+1;
				}
				for (i=1; i<mes1; i++){//suma de meses de año de fin
					if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31;
					if (i==4 ||i==6||i==9||i==11) total=total+30;
					if (i==2) total=total+28;
					if (i==2 && anio1%4==0) total=total+1;
				}
				i=mes0;//días mes de inicio
				if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31-dia0;
				if (i==4 ||i==6||i==9||i==11) total=total+30-dia0;
				if (i==2) total=total+28-dia0;
				if (i==2 && anio0%4==0) total=total+1;
				total=total+dia1;//días de mes final

			} else{
				if (anio0==anio1){//fechas en el mismo año
					for (i=mes0+1; i<mes1; i++){//suma de meses intermedios
						if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31;
						if (i==4 ||i==6||i==9||i==11) total=total+30;
						if (i==2) total=total+28;
						if (i==2 && anio0%4==0) total=total+1;
					}
					if (mes0==mes1) {//mismo año, mismo mes
						total=dia1-dia0;
					}	else{
						i=mes0;//mes de inicio
						if (i==1 ||i==3||i==5||i==7||i==8||i==10||i==12) total=total+31-dia0;
						if (i==4 ||i==6||i==9||i==11) total=total+30-dia0;
						if (i==2) total=total+28-dia0;
						if (i==2 && anio0%4==0) total=total+1;
						total=total+dia1;//días mes final
					}
				}
			}
			System.out.println("Dias transcurridos "+total);
		}
	}
}
