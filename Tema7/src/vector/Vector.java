package vector;

public class Vector {

	private int[] vectores;

	public Vector(int n){
	
	vectores=new int[n];
	
}
	public Vector(int n, int m){
		
		vectores=new int[n];
		for (int i=0;i<n;i++)
			vectores[i]=m;
		
	}
	public Vector(int n, int desde, int hasta){
		
		vectores=new int[n];
		for (int i=0;i<n;i++)
			vectores[i]= (int)(Math.random()*(hasta-desde+1)+desde);
		
	}


		public int media(){
			int media=0;
			
			return media;
		}
		public void mostrar(int n){
			for (int i=0;i<n;i++)
				System.out.println(vectores[i]);
			
		}
}
