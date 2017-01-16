package Pregs;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int dia, mes, a�o, diaActual, mesActual, a�oActual, diasTotales=0;
		
		System.out.println("Introduce el dia de tu fecha de nacimiento");
		dia=teclado.nextInt();
		System.out.println("Introduce el mes de tu fecha de nacimiento");
		mes=teclado.nextInt();
		System.out.println("Introduce el a�o de tu fecha de nacimiento");
		a�o=teclado.nextInt();
		
		System.out.println("Introduce el dia actual");
		diaActual=teclado.nextInt();
		diasTotales+=diaActual-1;
		System.out.println("Introduce el mes actual");
		mesActual=teclado.nextInt();
		System.out.println("Introduce el a�o actual");
		a�oActual=teclado.nextInt();
		
		//Meses 31: Enero , Marzo, Mayo, Julio, Agosto, Octubre y Diciembre
		//Meses 30: Abril 4, Junio 6, Septiembre 9, Noviembre 11.
		
		for(int i=a�o+1;i<a�oActual;i++)
			diasTotales +=((i%4==0)? 366 :365);
		
		for(int i=mes+1;i<=12;i++)
		{
			switch(i)
			{
			case 4: case 6: case 9: case 11:
				diasTotales+=30;
				break;
			case 2:
				diasTotales +=((a�o%4==0)? 29 : 28);
				break;
			default:
				diasTotales += 31;
			}
		}
		
		switch(mes)
		{
		case 4: case 6: case 9: case 11:
			diasTotales+=30-dia;
			break;
		case 2:
			diasTotales +=((a�oActual%4==0)? 29-dia : 28-dia);
			break;
		default:
			diasTotales += 31-dia;
		}
		
		for(int i=mesActual-1;i<=1;i--)
		{
			switch(i)
			{
			case 4: case 6: case 9: case 11:
				diasTotales += 30;
				break;
			case 2:
				diasTotales +=((a�oActual%4==0)? 29 : 28);
				break;
			default:
				diasTotales += 31;
			}
		}
		
		System.out.println("Han pasado " + diasTotales+" dias.");
		
	}

}
