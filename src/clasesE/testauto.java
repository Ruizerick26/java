package clasesE;

public class testauto {
	public static void main(String[] args) {
		Auto auto1 = new Auto("a",2,2.9);
		Auto auto2 = new Auto("b",2,2.9);
		auto1.setMarca("Ferrari"); 
		auto1.setAnio(2017);
		auto1.setPrecio(25000.200);
		auto2.setMarca("Chevrolet");
		auto2.setAnio(2019);
		auto2.setPrecio(15000.200);
		System.out.println("Marca: "+auto1.getMarca()+"\nAñio: "+ auto1.getAnio() + "\nPrecio: "+ auto1.getPrecio());
		System.out.println("********************");
		System.out.println("Marca: "+auto2.getMarca()+"\nAñio: "+ auto2.getAnio() + "\nPrecio: "+ auto2.getPrecio());
	}	
}	
