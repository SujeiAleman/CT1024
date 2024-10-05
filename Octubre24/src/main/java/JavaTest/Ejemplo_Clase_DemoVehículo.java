package JavaTest;

public class Ejemplo_Clase_DemoVehículo {

	public static void main(String[] args) {
		Ejemplo_Clase_Vehículo minivan = new Ejemplo_Clase_Vehículo();
		
		int rango;
		
		//Asignando valores para los parámetros de minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//Calcular el rango de km asumiendo un tanque lleno
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + "pasajeros con un rango de " + rango + " km");
		
		Ejemplo_Clase_Vehículo carro = new Ejemplo_Clase_Vehículo();
		carro.pasajeros = 4;
		System.out.println("Número de pasajeros en carro es: " + carro.pasajeros);
		
		
	}

}
