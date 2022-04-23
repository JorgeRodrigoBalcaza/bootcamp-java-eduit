package pruebas;

public class SaludoIngles extends Saludo {

	public SaludoIngles(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void saludar() {
		System.out.println("Hi " + nombre + "!!!");
		
	}

}
