package cortepilas;


public class PilaProducto {
	
	NodoProducto top;
	
	public void push(Producto producto) {
		NodoProducto nuevoNodo=new NodoProducto();
		nuevoNodo.producto=producto;
		
		if (top==null) {
			top=nuevoNodo;
		}
		else {
			nuevoNodo.next=top;
			top=nuevoNodo;
		}
	}
	public Producto pop() {
		if (top==null) {
			return null;
		}
		NodoProducto element = top;
		top=top.next;
		return element.producto;
	}
	public void union(Producto producto) {
		NodoProducto nuevoNodo=new NodoProducto();
		nuevoNodo.producto=producto;
		int cod=0;
		if (nuevoNodo.producto.codigo==cod) {
			top=nuevoNodo;
			
		}
		else {
			nuevoNodo.next=top;
			top=nuevoNodo;
			cod=nuevoNodo.producto.codigo;
		}
	}

	public boolean estavacia() {
		if (top==null) {
			return true;
		}
		return false;
	}

}
