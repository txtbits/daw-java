
public class Cancion {
	
	private String titulo;
	private String autor;
	private int duracion;
	
	// Getters y setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public static int aSegundos(String dura){
		String [] min_seg = dura.split(":");
		return Integer.parseInt(min_seg[0].trim()) * 60 + Integer.parseInt(min_seg[1].trim());
	}
	
	public Cancion(String titulo, String autor, int duracion) {
		this.titulo = titulo;
		this.autor = autor;
		this.duracion = duracion;
	}

	public Cancion(String titulo, String autor, String duracion) {
		// Transforma la cadena duración en formato min:seg a segundos(int)
		this(autor, titulo, aSegundos(duracion));

	}
	
	public String toString(){
		return "Titulo: " + titulo + " -- Autor: " + autor + " -- [" + duracion + "]";
	}
}
