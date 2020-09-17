package listas.enlazadas;

public class ProgramListInt {

	public static void main(String[] args) throws Exception {
		ListInt list = new ListInt();
			list.insert(2);
			list.insert(2);
			list.insert(38);
			list.insert(4);
			list.insert(7,2);
			list.eliminacion(38);
			
			int suma = list.sumarElementos();
			System.out.println("La suma de los Elementos de la lista es: " + suma);
			int pares = list.contadorPares();
			System.out.println("La cantidad de numeros pares en la lista es: " + pares);
			int posicionBusqueda = list.busquedaPorPosicion(7);
			System.out.println("El valor Buscado se encuentra en la posicion numero: " + posicionBusqueda);
			
			list.Printlist();
	}
}
