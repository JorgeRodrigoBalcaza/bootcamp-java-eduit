package pruebas;

public class SaludoItaliano extends Saludo {

	public SaludoItaliano(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void saludar() {
		System.out.println("Ciao " + nombre + "!!!");
		
	}

}
