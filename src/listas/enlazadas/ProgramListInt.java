package listas.enlazadas;

public class ProgramListInt {

	public static void main(String[] args) throws Exception {
		ListInt list = new ListInt();
			list.insert(7);
			list.insert(11);
			list.insert(41);
			list.insert(11);
			list.insert(7,2);
			list.eliminacion(41);
			list.agregarAlFinal(8);
			
			int suma = list.sumarElementos();
			System.out.println("La suma de los Elementos de la lista es: " + suma);
			int resta = list.diferenciaLista();
			System.out.println("La Diferencia entre el valor final e inicial es: " + resta);
			
			float promedio = list.promedioLista();
			System.out.println("El Promedio de la Lista es : " + promedio);
			
			int pares = list.contadorPares();
			System.out.println("La cantidad de numeros pares en la lista es: " + pares);
			int posicionBusqueda = list.busquedaPorPosicion(7);
			System.out.println("El valor Buscado se encuentra en la posicion numero: " + posicionBusqueda);
			
			list.Printlist();
	}
}
