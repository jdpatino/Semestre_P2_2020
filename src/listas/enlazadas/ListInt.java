package listas.enlazadas;

public class ListInt {
	NodoInt head;
	
	public void insert(int value) {
		NodoInt newNodo = new NodoInt();
		newNodo.data= value;
		if (head==null) {
			head=newNodo;
		}else {
			NodoInt tmp = head;
			while(tmp.next != null) {
				tmp=tmp.next;
			}
			tmp.next=newNodo;
		}
				}
	
	public void Printlist() {
		if (head==null) {
			System.out.println("La lista esta vacia");
		}else {
			NodoInt tmp = head;
			while(tmp != null){
				System.out.print(tmp.data + ", ");
				tmp = tmp.next;
			}
				
			}
		}

	public void insert(int value, int p){
		NodoInt nuevo = new NodoInt();
		 nuevo.data = value; 
		 
		
		if(head==null && p==0) {
			head=nuevo;
		}else {
			int count=0;
			NodoInt tmp=head;
			while(tmp!= null) {
				if(count == p-1) {
					nuevo.next=tmp.next;
					tmp.next=nuevo;
					break;
				}
				count++;
				tmp=tmp.next;
			}
			}
		
		}
	public int sumarElementos() {
		int sum=0;
		if (head== null) {
			return sum;
		}
		NodoInt tmp = head;
		while(tmp!= null) {
			sum= sum + tmp.data;
			tmp= tmp.next;
		}
		return sum;
	}
	public int contadorPares() {
		int cont=0;
		if (head== null) {
			return cont;
		}else {
		NodoInt tmp = head;
		if((tmp.data % 2)==0) {
			cont++;
			}else {
		tmp= tmp.next;
	}
		}
		return cont;
	}
	public boolean buscar(int value) {
		NodoInt tmp = head;
		boolean encontrado= false;
		while(tmp!=null&&encontrado!=true) {
			if(value==tmp.data) {
				encontrado=true;
			}else {
				tmp=tmp.next;
				}
		}
		return encontrado;
	}
	public int busquedaPorPosicion(int valor) throws Exception{
		if(buscar(valor)) {
		NodoInt tmp = head;
		int pos=0;
		while(valor!=tmp.data) {
			pos++;
			tmp=tmp.next;
		}
		return pos;
	  		}else {
		throw new Exception("Valor Inexistente en la lista");
	  }
	}
	public void eliminacion(int value) {
		if (buscar(value)) {
			if(head.data==value) {
				head=head.next;
			}else {
				NodoInt tmp = head;
				while(tmp.next.data!= value) {
					tmp=tmp.next;
				}
				 NodoInt reemplazo= tmp.next.next;
				 tmp.next=reemplazo;
				
			}
		}
	}
	}
