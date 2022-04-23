package pruebas;

public class SaludoEspanol extends Saludo {

	public SaludoEspanol(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void saludar() {
		System.out.println("Hola " + nombre + "!!!");
	}

}
