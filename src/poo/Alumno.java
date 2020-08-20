package poo;

public class Alumno {
	String nombre;
	int MAX_CREDITOS=12;
	static final int MAX_MATERIAS= 15;
	Materia[] materias = new Materia[Alumno.MAX_MATERIAS];
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
	
	 public void validacionInscripcionMaterias(Materia a) throws Exception {
		 for (int i = 0; i<cantidadMaterias; i++) {
			 if (cantidadMaterias==MAX_MATERIAS) {
					throw new Exception ("El estudiante ya tiene inscritas el maximo de materias permitidas");
				}
			 if(MAX_CREDITOS<materias[i].nroDeCreditos) {
				 throw new Exception("Has excedido el Numero maximo de creditos");
			 }
		 }
		 materias[cantidadMaterias]= a;
			cantidadMaterias++;
	 }
	
}
