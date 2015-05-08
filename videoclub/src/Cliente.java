import java.util.Vector;


public class Cliente {
	
	// Variables de instancia
	
	private String _nombre;
	private Vector _alquileres = new Vector();
	
	// Constructor
	
	public Cliente(String nombre){
		this._nombre = nombre;
	}
	
	// Acceso a las variables de instancia
	
	public String getNombre(){
		return _nombre;
	}
	
	// Registrar alquiler
	public void nuevoAlquiler(Alquiler alquiler){
		_alquileres.add(alquiler);
	}
	
	/*
	// Emitir un informe del cliente
	
	public String informe(){
		
		
		double    total;
		double    importe;
		int       puntos;
		int       i;
		Alquiler  alquiler;
		String    salida;
		
		total = 0;
		puntos = 0;
		salida = "Informe para " + getNombre() + "\n";
	
	
	// Recorrido del vector de alquileres
	
	for (i=0; i<_alquileres.size(); i++){
		importe = 0;
		alquiler = (Alquiler) _alquileres.get(i);
		
		// Importe del alquiler
		
		switch (alquiler.getDVD().getTipo()){
		case DVD.NORMAL:
			importe +=2;
			if (alquiler.getTiempo() > 2)
				importe += (alquiler.getTiempo()-2)*1.5;
			break;
		case DVD.NOVEDAD:
			importe
		}
	}*/
	
}
