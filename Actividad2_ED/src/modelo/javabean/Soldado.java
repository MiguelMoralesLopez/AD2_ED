package modelo.javabean;
	/**
	 * Creacción Clase soldado con atributos privados
	 * @author Juanjo
	 * @version 1.0
	 */
	public class Soldado {
		private boolean estaMuerto;
	    private int numeroBalas;
	    
	    // Constructor
	    public Soldado() {
			super();
		}
	    //Getter&Setter
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
		/**
	     * Método propio puedeDisparar, el cual nos dirá si el soldado tiene balas
	     * para poder disparar
	     * @return Opción True el número de balas será mayor de 0
	     * 		   Opción False el número de balas será menor a 0
	     */
	    public boolean puedeDisparar() {
	    	if(this.numeroBalas > 0) {
	    		return true;
	    	}                          
	    	return false;
	    }
	    /**
	     * Método propio disparar, Permite que un soldado dispara al otro, restando el número de
	     * balas(restando) y cambiando el valor del atributo (estaMuerto) en el soldado objeto
	     * @param sol objeto de tipo Soldado  
	     */
	    
	    public void disparar(Soldado sol) {
	    	this.numeroBalas--;
	    	sol.estaMuerto = true;
	}
	}

