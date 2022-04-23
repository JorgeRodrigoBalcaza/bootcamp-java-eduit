package clase20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Vendedores {

	private Collection<String> vendores;
	
	public Vendedores() {
		vendores = new HashSet<String>();
		
		//primera liena del archivo 
		vendores.add("id|nombre|sucursal");
		
		//cada vendedor
		vendores.add("1|juan|1");
		vendores.add("2|pedro|1");
		vendores.add("3|nico|2");
		vendores.add("4|santiago|3");
	}
	
	//necesito un metodo publico
	public Collection<Vendedor> getVendedores() {
		//¿que necesito hacer?
		//parsear
		for(int i = 1;i < this.vendores.size();i++) {
			
		}
		
		Collection<Vendedor> vendedores = new HashSet<>();
		
		
		
		//otra forma
		Iterator<String> itVendedores = this.vendores.iterator();
		if(itVendedores.hasNext()) {
			String primerLinea = itVendedores.next();//id|nombre|sucursal
			while(itVendedores.hasNext()) {
				String siguienteLinea = itVendedores.next();//1|juan|1
				String[] arrayVendedor = siguienteLinea.split("\\|");
				
				
				
			}
		}
		return null;
		 
	}
}
