package clase17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain3 {

	public static void main(String[] args) {
		
		Collection<String> nombres = new ArrayList<>();
		
		nombres.add("brenda");
		nombres.add("walter");
		nombres.add("nicolas");
		
		ArrayList<String> nombresPasados = new ArrayList<>();

		
		Iterator<String> itNombres = nombres.iterator();
		while(itNombres.hasNext()) {
			String nombreActual = itNombres.next();
			System.out.println("eliminando:" + nombreActual);
			nombresPasados.add(nombreActual);
			itNombres.remove();
			
		}
		
		itNombres = nombresPasados.iterator();
		while (itNombres.hasNext()) {
			System.out.println(itNombres.next());
		}
		
		boolean vacio = nombres.isEmpty();
		boolean vacioNombresPasados = nombresPasados.isEmpty();
		
		
		
	}

}
