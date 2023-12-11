package clasesE;

public class testproducto {
	public static void main(String[] args) {
		Producto productoA = new Producto("a","b",0.2,1);
		Producto productoB = new Producto("c","d",0.2,1);
		Producto productoC = new Producto("e","f",0.2,1);
		productoA.setNombre("Ibuprofeno");
		productoA.setDescripcion("Impedir que el cuerpo elabore sustancias que causan inflamación");
		productoA.setPrecio(0.65);
		productoA.setStock(100);
		productoB.setNombre("Diclofenaco");
		productoB.setDescripcion("Se usa para tratar los síntomas de la artritis reumatoide");
		productoB.setPrecio(0.50);
		productoB.setStock(80);
		productoB.setNombre("Neogripal");
		productoB.setDescripcion("Cápsulas para el alivio de los síntomas de la gripe y otras afecciones respiratorias");
		productoB.setPrecio(0.70);
		productoB.setStock(70);
		System.out.println("Nombre: "+ productoA.getNombre() + "\nDescripcion: " + productoA.getDescripcion()
				+ "\nprecio: " + productoA.getPrecio() + "\nStock: "+productoA.getStock());
		System.out.println("Nombre: "+ productoB.getNombre() + "\nDescripcion: " + productoB.getDescripcion()
		+ "\nprecio: " + productoB.getPrecio() + "\nStock: "+productoB.getStock());
		System.out.println("Nombre: "+ productoC.getNombre() + "\nDescripcion: " + productoC.getDescripcion()
		+ "\nprecio: " + productoC.getPrecio() + "\nStock: "+productoC.getStock());
		
		
	}
}
