package vector;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		  
		Scanner teclado = new Scanner(System.in);
		int desde, hasta, nElementos;
		Vector limite;
		System.out.println("Indica la cantidad de elementos que quieres comparar:");
		nElementos=teclado.nextInt();
		System.out.println("Indica desde que numero");
		desde=teclado.nextInt();
		System.out.println("Indica hasta que numero");
		hasta=teclado.nextInt();
		limite=new Vector(nElementos, desde, hasta);
		
		limite.mostrar(nElementos);
		
	}

}
