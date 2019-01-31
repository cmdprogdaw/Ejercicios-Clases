
public class PruebaLibro {
	
	public static void main(String[] args) {
		Autor autor = new Autor("Carlos", "a@gmail.com", "masculino");
		Libro unLibro = new Libro("AC", autor, 40, 30);
		Libro otroLibro = new Libro("ET", new Autor("Pepe", "deaoc@gmail.com", "masculino"), 47, 20);
		System.out.println(otroLibro.getAutor().getMail());
		System.out.println(otroLibro.getMailAutor());
	}
}
