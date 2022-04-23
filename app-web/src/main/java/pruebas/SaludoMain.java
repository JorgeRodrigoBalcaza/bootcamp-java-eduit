package pruebas;

public class SaludoMain {

	public static void main(String[] args) {
		
		Saludo s1 = new SaludoEspanol("Juan");
		Saludo s2 = new SaludoIngles("Jhon");
		Saludo s3 = new SaludoItaliano("Pepe");
		
		s1.saludar();
		s2.saludar();
		s3.saludar();
		
		Pers[] pers = new Pers[2];
		
	}
	
}
