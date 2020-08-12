package poo;

public class Alumno {
	String nombre;
	
	Materia[] materias = new Materia[6];
	int cantidadMaterias = 0;
	
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
	
}
