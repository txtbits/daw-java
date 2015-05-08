
public class Alquiler {
	private DVD _dvd;
	private int _tiempo;
	
	public Alquiler(DVD dvd, int tiempo){
		_dvd = dvd;
		_tiempo = tiempo;
	}

	public DVD get_dvd() {
		return _dvd;
	}

	public int get_tiempo() {
		return _tiempo;
	}
}
