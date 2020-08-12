package poo;

/*Realizar un programa que realice unos calculos con las notas de unas asignaturas
 * pertenecientes a un estudiante calculos:
 * 1. Promedio del Semestre
 * 2. Cuantas materias perdio
 * 3. cuantas materias gano
 * 4. Cada materia tiene una cantidad de creditos se debe indicar cuantos creditos perdio
 * y cuanto debe pagar para recuperar la materia 
 * 
 * /
 */
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno a1= new Alumno();
		a1.nombre= "Juan";
		
		Materia mt1 = new Materia();
		mt1.nombre = "S.O";
		mt1.nota = 3;
		mt1.nroDeCreditos = 2;
		mt1.valorPorRecuperacion = 12000;
		Materia mt2 = new Materia();
		mt2.nombre = "Circuitos";
		mt2.nota = 4;
		mt2.nroDeCreditos = 3;
		mt2.valorPorRecuperacion = 18000;
		Materia mt3 = new Materia();
		mt3.nombre = "Fisica";
		mt3.nota = 2;
		mt3.nroDeCreditos = 2;
		mt3.valorPorRecuperacion = 12000;
		a1.materias[0] = mt1;
		a1.cantidadMaterias++;
		a1.materias[1] = mt2;
		a1.cantidadMaterias++;
		a1.materias[2] = mt3;
		a1.cantidadMaterias++;
		
		float promedioAlumno1 = a1.calcularPromedio();
		System.out.println("Promedio"+" "+a1.nombre + ":" + promedioAlumno1);
		int ganadasAlumno1 = a1.contarMateriasGanadas();
		System.out.println("Materias Ganadas de"+" "+a1.nombre + "=" + ganadasAlumno1);
		int perdidasAlumno1 = a1.contarMateriasPerdidas();
		System.out.println("Materias Perdidas de"+" "+a1.nombre + "=" + perdidasAlumno1);
		float recuperacionAlumno1 = a1.calcularPagoRecuperacion();
		System.out.println("Lo que debe pagar para recuperar"+" "+a1.nombre +" "+ "es = " + recuperacionAlumno1);
		
		Alumno a2= new Alumno();
		a2.nombre= "Carlos";
		
		Materia mt4 = new Materia();
		mt4.nombre = "Algebra Lineal";
		mt4.nota = 4;
		mt4.nroDeCreditos = 2;
		mt4.valorPorRecuperacion = 12000;
		Materia mt5 = new Materia();
		mt5.nombre = "Progrmacion";
		mt5.nota = 5;
		mt5.nroDeCreditos = 3;
		mt5.valorPorRecuperacion = 18000;
		Materia mt6 = new Materia();
		mt6.nombre = "Fisica 2";
		mt6.nota = 4;
		mt6.nroDeCreditos = 3;
		mt6.valorPorRecuperacion = 18000;
		a2.materias[0] = mt4;
		a2.cantidadMaterias++;
		a2.materias[1] = mt5;
		a2.cantidadMaterias++;
		a2.materias[2] = mt6;
		a2.cantidadMaterias++;
		
		float promedioAlumno2 = a2.calcularPromedio();
		System.out.println("Promedio"+" "+a2.nombre + ":" + promedioAlumno2);
		int ganadasAlumno2 = a2.contarMateriasGanadas();
		System.out.println("Materias Ganadas de"+" "+a2.nombre + "=" + ganadasAlumno2);
		int perdidasAlumno2 = a2.contarMateriasPerdidas();
		System.out.println("Materias Perdidas de"+" "+a2.nombre + "=" + perdidasAlumno2);
		float recuperacionAlumno2 = a2.calcularPagoRecuperacion();
		System.out.println("Lo que debe pagar para recuperar"+" "+a2.nombre +" "+ "es = " + recuperacionAlumno2);
		
		
		Alumno a3= new Alumno();
		a3.nombre= "Juana";
		
		
		Materia mt7 = new Materia();
		mt7.nombre = "S.O";
		mt7.nota = 1;
		mt7.nroDeCreditos = 2;
		mt7.valorPorRecuperacion = 12000;
		Materia mt8 = new Materia();
		mt8.nombre = "Fisica 2";
		mt8.nota = 2;
		mt8.nroDeCreditos = 3;
		mt8.valorPorRecuperacion = 18000;
		Materia mt9 = new Materia();
		mt9.nombre = "Calculo";
		mt9.nota = 3;
		mt9.nroDeCreditos = 3;
		mt9.valorPorRecuperacion = 18000;
		a3.materias[0] = mt7;
		a3.cantidadMaterias++;
		a3.materias[1] = mt8;
		a3.cantidadMaterias++;
		a3.materias[2] = mt9;
		a3.cantidadMaterias++;
		
		float promedioAlumno3 = a3.calcularPromedio();
		System.out.println("Promedio"+" "+a3.nombre + ":" + promedioAlumno3);
		int ganadasAlumno3 = a3.contarMateriasGanadas();
		System.out.println("Materias Ganadas de"+" "+a3.nombre + "=" + ganadasAlumno3);
		int perdidasAlumno3 = a3.contarMateriasPerdidas();
		System.out.println("Materias Perdidas de"+" "+a3.nombre + "=" + perdidasAlumno3);
		float recuperacionAlumno3 = a3.calcularPagoRecuperacion();
		System.out.println("Lo que debe pagar para recuperar"+" "+a3.nombre +" "+ "es = " + recuperacionAlumno3);
		
		
		Alumno a4= new Alumno();
		a4.nombre= "Camilo";
		
		Materia mt10 = new Materia();
		mt10.nombre = "Calculo";
		mt10.nota = 3;
		mt10.nroDeCreditos = 3;
		mt10.valorPorRecuperacion = 18000;
		Materia mt11 = new Materia();
		mt11.nombre = "Circuitos";
		mt11.nota = 3;
		mt11.nroDeCreditos = 3;
		mt11.valorPorRecuperacion = 18000;
		Materia mt12 = new Materia();
		mt12.nombre = "Programacion";
		mt12.nota = 3;
		mt12.nroDeCreditos = 3;
		mt12.valorPorRecuperacion = 18000;
		a4.materias[0]= mt10;
		a4.cantidadMaterias++;
		a4.materias[1] = mt11;
		a4.cantidadMaterias++;
		a4.materias[2]= mt12;
		a4.cantidadMaterias++;
		
		float promedioAlumno4 = a4.calcularPromedio();
		System.out.println("Promedio"+" "+a4.nombre + ":" + promedioAlumno4);
		int ganadasAlumno4 = a4.contarMateriasGanadas();
		System.out.println("Materias Ganadas de"+" "+a4.nombre + "=" + ganadasAlumno4);
		int perdidasAlumno4 = a4.contarMateriasPerdidas();
		System.out.println("Materias Perdidas de"+" "+a4.nombre + "=" + perdidasAlumno4);
		float recuperacionAlumno4 = a4.calcularPagoRecuperacion();
		System.out.println("Lo que debe pagar para recuperar"+" "+a4.nombre +" "+ "es = " + recuperacionAlumno4);
		
		Alumno a5= new Alumno();
		a5.nombre= "Sara";
		
		Materia mt13 = new Materia();
		mt13.nombre = "Programacion 3";
		mt13.nota = 0;
		mt13.nroDeCreditos = 4;
		mt13.valorPorRecuperacion = 26000;
		Materia mt14 = new Materia();
		mt14.nombre = "Calculo";
		mt14.nota = 5;
		mt14.nroDeCreditos = 3;
		mt14.valorPorRecuperacion = 18000;
		Materia mt15 = new Materia();
		mt15.nombre = "Fisica";
		mt15.nota = 4;
		mt15.nroDeCreditos = 2;
		mt15.valorPorRecuperacion = 12000;
		a5.materias[0] = mt13;
		a5.cantidadMaterias++;
		a5.materias[1] = mt14;
		a5.cantidadMaterias++;
		a5.materias[2] = mt15;
		a5.cantidadMaterias++;
		
		float promedioAlumno5 = a5.calcularPromedio();
		System.out.println("Promedio"+" "+a5.nombre + ":" + promedioAlumno5);
		int ganadasAlumno5 = a5.contarMateriasGanadas();
		System.out.println("Materias Ganadas de"+" "+a5.nombre + "=" + ganadasAlumno5);
		int perdidasAlumno5 = a5.contarMateriasPerdidas();
		System.out.println("Materias Perdidas de"+" "+a5.nombre + "=" + perdidasAlumno5);
		float recuperacionAlumno5 = a5.calcularPagoRecuperacion();
		System.out.println("Lo que debe pagar para recuperar"+" "+a5.nombre +" "+ "es = " + recuperacionAlumno5);
		
		
	}

}
