package cortepilas;

public class ProgramProductos {

	public static void main(String[] args) {
		
		PilaProducto conjuntoA = new PilaProducto();
		Producto p1 = new Producto();
		p1.nombre = "Arroz";
		p1.codigo = 22;
		p1.impuesto = 15;
		p1.precio = 5000;
		conjuntoA.push(p1);
		
		Producto p2 = new Producto();
		p2.nombre = "Carne";
		p2.codigo = 45;
		p2.impuesto = 15;
		p2.precio = 9000;
		conjuntoA.push(p2);
		
		Producto p3 = new Producto();
		p3.nombre = "Atun";
		p3.codigo = 18;
		p3.impuesto = 15;
		p3.precio = 2500;
		conjuntoA.push(p3);
		
		PilaProducto conjuntoB = new PilaProducto();
		Producto p4 = new Producto();
		p4.nombre = "Papa";
		p4.codigo = 19;
		p4.impuesto = 15;
		p4.precio = 8000;
		conjuntoB.push(p4);
		
		Producto p5 = new Producto();
		p5.nombre = "Cerveza";
		p5.codigo = 34;
		p5.impuesto = 19;
		p5.precio = 13500;
		conjuntoB.push(p1);
		
		Producto p6 = new Producto();
		p6.nombre = "Arroz";
		p6.codigo = 22;
		p6.impuesto = 15;
		p6.precio = 5000;
		conjuntoB.push(p6);
		PilaProducto unionPilas = new PilaProducto();
		unionPilas.union(p1);
		unionPilas.union(p2);
		unionPilas.union(p3);
		unionPilas.union(p4);
		unionPilas.union(p5);
		unionPilas.union(p6);
		conjuntoB.union(conjuntoB.pop());
		
		System.out.println(unionPilas.top.producto.codigo);

			}
	
}