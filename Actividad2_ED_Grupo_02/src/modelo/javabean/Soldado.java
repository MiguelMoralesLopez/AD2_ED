package modelo.javabean;

public class Soldado {
	/**
	 * La clase soldado será usada para saber si el soldado puede disparar dependiendo del numero de balas, y también para indicar que, cuando 
	 * el soldado dispare, el número de balas se le restarán y el soldado al que dispare estará muerto. 
	 * 
	 * @author Sheila
	 * @version 1.0
	 */
	
	// ATRIBUTOS PRIVADOS DE LA CLASE JUGADOR
	/**
	 * Define si el soldado esta muerto
	 */
	private boolean estaMuerto;
	/**
	 * Define el número de balas
	 */
    private int numeroBalas;
     
    
    //CONSTRUCTORES DE LA CLASE SOLDADO
    /**
     * Constructor con parámetros
     * @param estaMuerto Indica si el soldado está muerto
     * @param numeroBalas Indica el número de balas
     */
    public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}
    
    /**
     * Constructor sin parametros
     */
    public Soldado() {
		super();
	}


	//GETTER Y SETTER
    public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}

	//REDEFINICION DE OBJETOS
	  @Override
		public String toString() {
			return "Soldado [estaMuerto=" + estaMuerto + ", numeroBalas=" + numeroBalas + "]";
		}
	
	// ***MÉTODOS PROPIOS DE LA CLASE SOLDADO***
	// METODO PUEDEDISPARAR
	/**
	 * Este método se utiliza para saber si el soldado puede disparar dependiendo del número de balas que tenga
	 * @return True, si el número de balas en mayor a 0 . False, si el número de balas es 0
	 */
	public boolean puedeDisparar() {
    	if(this.numeroBalas > 0) {
    		return true;
    	}                          
    	return false;
    }

	// METODO DISPARAR
	/**
	 * Este método lo que indica es que al disparar, el número de balas va bajando. 
	 * Tambien indica que: True, el soldado al que está disparando está muerto.
	 * @param sol Indica el soldado al que se le dispara
	 */
	public void disparar(Soldado sol) {
    	this.numeroBalas--;
    	sol.estaMuerto = true;
    }
}
