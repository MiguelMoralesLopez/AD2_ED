package modelo.javabean;
	/**
	 * Creacción Clase soldado con atributos privados. Tiene métodos para indicarnos
	 * si nuestro Soldado puede disparar 
	 * @author Grupo 02
	 * @version 2.0
	 */
	public class Soldado {
		
		//ATRIBUTOS PRIVADOS
		
		/**
		 * Atributo booleano privado que establece si el Soldado está muerto o no.
		 */
		private boolean estaMuerto;
		/**
		 * Atributo numérico privado de tipo int que establece el número de balas disponibles.
		 */
	    private int numeroBalas;
	    
	    //CONSTRUCTOR
	    
	    public Soldado() {
			super();
		}    
	    
	    //GETTERS Y SETTERS.
	    
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
		
		//*****MÉTODOS PROPIOS*****
		
		//PUEDE DISPARAR
		/**
		 * Método que comprueba si el Soldado tiene balas para disparar.
		 * @return 	True, si el número de balas es superior a 0.
		 * 			False, si el número de balas es igual o inferior a 0.
		 */
		
		public boolean puedeDisparar() {
		    if(this.numeroBalas > 0) {
		    	return true;
		    }                          
		    return false;
		}
		
		//DISPARAR
		/**
		 * Método para que un soldado dispare a otro. Resta el número de balas del soldado que dispara y cambia el valor
		 * del atributo "estaMuerto" en el soldado objetivo.
		 * @param sol Objeto de tipo Soldado.
		 */
		public void disparar(Soldado sol) {
		    	this.numeroBalas--;
		    	sol.estaMuerto = true;
		}
		 
	}