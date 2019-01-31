
public class PruebaAutor {

	public static void main(String[] args) {
		Autor autor = new Autor("Carlos", "carlos@gmail.com", "masculino");
		System.out.println(autor); //System.out.println(autor.toString()); ya se invoca ese metodo toStirng()  
		autor.setMail("Carlos@gmail.com");
		System.out.println(autor);
		System.out.println(autor.getNombre());

	}

}
