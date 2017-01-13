package fecha;

import java.util.Scanner;

public class Fecha {
	
	int dia;
	int mes;
	int anio;
	
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public Fecha() {
		
		this.dia = 1;
		this.mes = 1;
		this.anio = 1;
	}	
	public Fecha(int dia, int mes, int anio) {
		
		boolean fechaValida=false;
		int febrero=28;

		if(anio>0&&mes>0&&dia>0){
			
			if(anio%400==0)
				febrero=29;
			
			else{
			if(anio%4==0&&anio%100!=0)
				febrero=29;
			
			else
				febrero=28;
			
			}
			switch(mes){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if(dia<=31)
					fechaValida=true;
				break;

			case 2:
				if(dia<=febrero)
					fechaValida=true;
				break;

			case 4: case 6: case 9: case 11:
				if(dia<=30)
					fechaValida=true;
				break;

			default:
				fechaValida=false;
			}
		}
		
		if(fechaValida)
		{
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		}
		else{
		this.dia = 0;
		this.mes = 0;
		this.anio = 0;
		}
		
	}
	public Fecha validador(){
		Scanner teclado = new Scanner(System.in);
		int dia, mes, anio;
		Fecha fech;
		do{
			System.out.println("Dia");
			dia=teclado.nextInt();
			System.out.println("Mes");
			mes=teclado.nextInt();
			System.out.println("Año");
			anio=teclado.nextInt();
			fech=new Fecha(dia, mes, anio);
			
		}while(fech.getDia()==0&&fech.getMes()==0&&fech.getAnio()==0);
	return fech;
	}
	
	
	
	
}


