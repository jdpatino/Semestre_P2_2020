package poo;

import java.util.Arrays;

public class Alumno {
	String nombre;
	int MAX_CREDITOS=15;
    int MAX_MATERIAS= 3;
	Materia[] materias = new Materia[MAX_MATERIAS];
	Materia[] materiasTemp = new Materia[MAX_MATERIAS];
	int cantidadMaterias = 0;
	String nombreVal=" ";
	
	float calcularPromedio() {
		float prom=0;
		for (int i=0;i < cantidadMaterias;i++) {
		prom= prom + materias[i].nota;
	}
		return prom/cantidadMaterias;
		}
	int contarMateriasPerdidas() {
		int materiasKo = 0;
		for (int i = 0; i<cantidadMaterias; i++) {
		if (materias[i].nota<3) {
			materiasKo++;
			}
		
		}
		return materiasKo;
		
		
	}
	float calcularPagoRecuperacion() {
		float totalRecuperacion = 0;
		for (int i = 0; i<cantidadMaterias; i++) {
			if (materias[i].nota<3) {
				totalRecuperacion = totalRecuperacion + materias[i].valorPorRecuperacion;
				}
			
			}
			return totalRecuperacion;
			
			
		}
		
	
	int contarMateriasGanadas() {
		int materiasOk = 0;
		for (int i = 0; i<cantidadMaterias; i++) {
			if (materias[i].nota>=3) {
				materiasOk++;
				}
			
			}
			return materiasOk;
	}
	public void llenarArregloTemp() {
	materiasTemp=Arrays.copyOf(materias,materiasTemp.length);
	
	}
	public void llenarArregloDefinitivo() {
	
		materias=Arrays.copyOf(materiasTemp,materiasTemp.length);
		
	}
		
	
	 public void validacionInscripcionMaterias(Materia a) throws Exception {
		 for (int i = 0; i<cantidadMaterias; i++) {
			 if (cantidadMaterias==MAX_MATERIAS) {
				 MAX_MATERIAS=MAX_MATERIAS*2;
				 llenarArregloTemp();
				 Materia[] materias = new Materia[materiasTemp.length];
				 llenarArregloDefinitivo();
				 //System.out.println("tamaño arreglo" +materias.length); Prueba tamaño arreglo
				}
			 if(MAX_CREDITOS<materias[i].nroDeCreditos) {
				 throw new Exception("Has excedido el Numero maximo de creditos");
			 }
			 MAX_CREDITOS=MAX_CREDITOS-materias[i].nroDeCreditos;			 
		 }
		 materias[cantidadMaterias]= a;
			cantidadMaterias++;
	 }
	
}
