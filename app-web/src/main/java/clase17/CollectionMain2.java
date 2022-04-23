package clase17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain2 {

	public static void main(String[] args) {
		
		Collection<String> nombres = new ArrayList<>();
		
		nombres.add("brenda");
		nombres.add("walter");
		nombres.add("nicolas");
		
		Iterator<String> itNombres = nombres.iterator();
		while(itNombres.hasNext()) {
			String nombreActual = itNombres.next();
			System.out.println("eliminando:" + nombreActual);
			itNombres.remove();
			
		}
		
		boolean vacio = nombres.isEmpty();
		
	}

}
