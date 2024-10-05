package JavaTest;

public class Ejemplo_Métodos {

	public static void main(String[] args) {
		int resultado = suma(25,49);
		System.out.println(resultado);
		
		System.out.println(carro(1));
		System.out.println(carro(2));
		
		int resultado2 = suma(25,49,100);
		System.out.println(resultado2);

	}
	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static int suma(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
	
	public static String carro(int a) {
		String [] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		return cars [a];
	}
}
  