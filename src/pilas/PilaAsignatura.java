package pilas;

public class PilaAsignatura {
	
	NodoAsignatura top;

	public void push(Asignatura asignatura) {
		NodoAsignatura nuevoNodo=new NodoAsignatura();
		nuevoNodo.asignatura=asignatura;
		
		if (top==null) {
			top=nuevoNodo;
		}
		else {
			nuevoNodo.next=top;
			top=nuevoNodo;
		}
	}
	public Asignatura pop() {
		if (top==null) {
			return null;
		}
		NodoAsignatura element = top;
		top=top.next;
		return element.asignatura;
	}
	public boolean estavacia() {
		if (top==null) {
			return true;
		}
		return false;
	}
}
