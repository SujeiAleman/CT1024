package JavaTest;

public class Ejemplo_Arreglo {

	public static void main(String[] args) {
		int [] intArray;
		byte [] bytarray;
		byte [] bytarray2;
		boolean [] boolArray;
		
		//Declarar un arrar de strings
		String[] arr;
		
		//Asignar memoria para 5 strings
		arr=new String[5];
		
		//Inicializar el primer elemento del arreglo
		arr[0] = "cero";
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		//System.out.println("Elemento en el índice 1 es: " + arr[1]);
		//System.out.println("Elemento en el índice 2 es: " + arr[2]);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Elemento en el índice " + i + ": " + arr[i]);
		}
			
		//Ejemplo int enteros
		int[] intArray2 = new int [] {1,2,3,4,5,6,7,8,9,0};
		
	}
	
}	
	

