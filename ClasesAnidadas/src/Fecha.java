
public class Fecha {
	private Dia di;
	private Mes me;
	private Anyo an;
	
	public Fecha (int d, int m, int a) {
		this.di = new Dia(d);
		this.me = new Mes(m);
		this.an = new Anyo(a);
	}
	
	public String toString() {
		return "Fecha: " + di + "/" + me + "/" + an;
	}
	public void siguienteDia() {
	    di.siguiente();  }

	private class Dia {
	    private int d; 
	    public Dia(int d){
	      this.d = d; }
	    public String toString() {
			return Integer.toString(d);
		}
	    public void siguiente() {
	      d = d + 1;
	      verificar();  }
	    private void verificar() {
	      if (d > me.dias()) {
	         d = 1;
	         me.siguiente();  }
	    }
	  }        // Fin de la clase Dia
	
	
	
	private class Mes {
	    private int m;
	    private final int[] diasDelMes = 
	      {0,31,28,31,30,31,30,31,31,30,31,30,31};
	    public Mes (int m) { this.m = m; }
	    public String toString() {
			return Integer.toString(m);
		}	    
	    public int dias() {
	      int r = diasDelMes[m];
	      if ((m==2)&& an.esBisiesto()) { r = r+1; }
	      return r; }
	    public void siguiente() {
	      m = m + 1;  verificar();  }
	    private void verificar() {
	      if (m>12) { m=1; an.siguiente(); } }
	  }                     // Fin de la clase Mes

	
	private class Anyo {
	    private int a;
	    public Anyo(int a) { this.a = a; }
	    public String toString() {
			return Integer.toString(a);
		}
	    public void siguiente() { a=a+1; }
	    public boolean esBisiesto() {
	      return ((a % 4 == 0) && (a % 100 !=0) || (a % 400 == 0)); }
	  }                    // Fin de la clase Anho
	}                      // Fin de la clase Fecha