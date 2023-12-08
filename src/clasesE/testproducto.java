package clasesE;

public class testproducto {
	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		productoA.nombre = "Ibuprofeno";
		productoA.descripcion = "Impedir que el cuerpo elabore sustancias que causan inflamación";
		productoA.precio = (float) 0.65;
		productoA.stock = 100;
		productoB.nombre = "Diclofenaco";
		productoB.descripcion = "Se usa para tratar los síntomas de la artritis reumatoide";
		productoB.precio = (float) 0.50;
		productoB.stock = 80;
		productoB.nombre = "Neogripal";
		productoB.descripcion = "Cápsulas para el alivio de los síntomas de la gripe y otras afecciones respiratorias";
		productoB.precio = (float) 0.70;
		productoB.stock = 70;
		System.out.println("Nombre: "+ productoA.nombre + "\nDescripcion: " + productoA.descripcion
				+ "\nprecio: " + productoA.precio + "\nStock: "+productoA.stock);
		System.out.println("Nombre: "+ productoB.nombre + "\nDescripcion: " + productoB.descripcion
				+ "\nprecio: " + productoB.precio + "\nStock: "+productoB.stock);
		System.out.println("Nombre: "+ productoB.nombre + "\nDescripcion: " + productoB.descripcion
				+ "\nprecio: " + productoB.precio + "\nStock: "+productoB.stock);
	}
}
