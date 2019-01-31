
public class Libro {
	
	private String titulo = "god";
	private Autor autor;
	private float precio;
	private int stock;
		
	public Libro(String titulo, Autor autor, float precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public Libro(String titulo, Autor autor, float precio, int stock) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.stock = stock;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getTitulo() {
		return titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", stock=" + stock + "]";
	}
	
	public String getNombreAutor() {
		return autor.getNombre();
	}
	public String getMailAutor() {
		return autor.getMail();
	}
	public String getGeneroAutor() {
		return autor.getGenero();
	}
	
}
