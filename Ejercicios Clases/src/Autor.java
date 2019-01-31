
public class Autor {
	
	private  String nombre;
	private  String mail;
	private  String genero;
	
	public Autor(String nombre, String mail, String genero) {
		this.nombre = nombre;
		this.mail = mail;
		this.genero = genero;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getMail() {
		return mail;
	}

	public String getGenero() {
		return genero;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return  nombre + " (" + genero + ") "  + mail;
	} 
}
