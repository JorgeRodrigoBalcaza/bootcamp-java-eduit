package pruebas;

public abstract class Saludo {
	
	protected String nombre;
	
	public Saludo(String nombre) {
		this.nombre = nombre;
	}
	
	
	protected abstract void saludar();
	
	

}
