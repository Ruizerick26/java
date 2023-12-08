package clasesE;

public class testauto {
	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		auto1.marca = "Ferrari";
		auto1.anio = 2017;
		auto1.precio = (float) 25000.200;
		auto2.marca = "Chevrolet";
		auto2.anio = 2019;
		auto2.precio = (float) 15000.200;
		System.out.println("Marca: "+auto1.marca+"\nAñio: "+ auto1.anio + "\nPrecio: "+ auto1.precio);
		System.out.println("********************");
		System.out.println("Marca: "+auto2.marca+"\nAñio: "+ auto2.anio + "\nPrecio: "+ auto2.precio);
	}	
}	
