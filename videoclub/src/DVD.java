
public class DVD {
	
	// Constantes simbólicas
	
	public static final int INFANTIL = 2;
	public static final int NORMAL   = 0;
	public static final int NOVEDAD  = 1;
	
	// Variables de instancia
	
	private String _titulo;
	private int _tipo;
	
	// Constructor
	
	public DVD(String titulo, int tipo){
		_titulo = titulo;
		_tipo   = tipo;
	}
	
	// Acceso a las variables de instancia
	
	public int get_tipo() {
		return _tipo;
	}

	public void set_tipo(int _tipo) {
		this._tipo = _tipo;
	}

	public String get_titulo() {
		return _titulo;
	}
	
	

	
}
