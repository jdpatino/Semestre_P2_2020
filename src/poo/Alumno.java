package poo;

public class Alumno {
	String nombre;
	Materia m1;
	Materia m2;
	Materia m3;
	
	float calcularPromedio() {
		float prom=0;
		prom=(m1.nota+m2.nota+m3.nota)/3;
		return prom;
		}
	int contarMateriasPerdidas() {
		int materiasKo = 0;
		if (m1.nota<3) {
		materiasKo++;	
		} 
			if(m2.nota<3) {
				materiasKo++;
			}
				if(m3.nota<3) {
					materiasKo++;
				}
			
		
		
	
		
		return materiasKo;
		
	}
	float calcularPagoRecuperacion() {
		float totalRecuperacion = 0;
		if (m1.nota<3) {
			totalRecuperacion = totalRecuperacion + m1.valorPorRecuperacion;	
			} 
				if(m2.nota<3) {
					totalRecuperacion = totalRecuperacion + m2.valorPorRecuperacion;
				}
					if(m3.nota<3) {
						totalRecuperacion = totalRecuperacion + m3.valorPorRecuperacion;
					}
		
		return totalRecuperacion;
	}
	
	int contarMateriasGanadas() {
		int materiasOk = 0;
		if (m1.nota>=3) {
			materiasOk++;	
			} 
				if(m2.nota>=3) {
					materiasOk++;
				}
					if(m3.nota>=3) {
						materiasOk++;
					}
		
		return materiasOk;
	}
}
