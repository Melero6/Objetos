package Pregs;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int dia1, mes1, anio1, dia2, mes2, anio2, diasTotales=0;
		
		System.out.println("Introduce el dia de tu fecha de nacimiento");
		dia1=teclado.nextInt();
		System.out.println("Introduce el mes de tu fecha de nacimiento");
		mes1=teclado.nextInt();
		System.out.println("Introduce el año de tu fecha de nacimiento");
		anio1=teclado.nextInt();
		
		System.out.println("Introduce el dia actual");
		dia2=teclado.nextInt();
		diasTotales+=dia2-1;
		System.out.println("Introduce el mes actual");
		mes2=teclado.nextInt();
		System.out.println("Introduce el año actual");
		anio2=teclado.nextInt();
		
		//Meses 31: Enero , Marzo, Mayo, Julio, Agosto, Octubre y Diciembre
		//Meses 30: Abril 4, Junio 6, Septiembre 9, Noviembre 11.
		
		for(int i=anio1+1;i<anio2;i++)
			diasTotales +=((i%4==0)? 366 :365);
		
		for(int i=mes1+1;i<=12;i++)
		{
			switch(i)
			{
			case 4: case 6: case 9: case 11:
				diasTotales+=30;
				break;
			case 2:
				diasTotales +=((anio1%4==0)? 29 : 28);
				break;
			default:
				diasTotales += 31;
			}
		}
		
		switch(mes1)
		{
		case 4: case 6: case 9: case 11:
			diasTotales+=30-dia1;
			break;
		case 2:
			diasTotales +=((anio2%4==0)? 29-dia1 : 28-dia1);
			break;
		default:
			diasTotales += 31-dia1;
		}
		
		for(int i=mes2-1;i<=1;i--)
		{
			switch(i)
			{
			case 4: case 6: case 9: case 11:
				diasTotales += 30;
				break;
			case 2:
				diasTotales +=((anio2%4==0)? 29 : 28);
				break;
			default:
				diasTotales += 31;
			}
		}
		
		System.out.println("Han pasado " + diasTotales+" dias.");
		
	}

}
