package modelo.javabean;

/**
 * Esta clase se encarga de indicaros si nuestro jugador está muerto y almacenar balas. Tiene métodos para indicarnos
 * si nuestro Soldado puede disparar 
 * @author space
 *
 */
public class Soldado {
	/**
	 * atributo privado booleano que nos indica si nuestro soldado está vivo o muerto
	 */
	private boolean estaMuerto;
	/**
	 * atributo privado que nos indica el número de balas de nuestro soldado
	 */
    private int numeroBalas;
    

    
    public boolean getEstaMuerto() {
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
	 * Este método nos indica si nuestro soldado puede disparar o no
	 * 
	 * @return devuelve un atributo booleano, true si puede disparar y 
	 * false si no puede disparar 
	 * si el número de balas es mayor que 0, devuelve true
	 * si el número de balas es menor o igual que 0, devuelve false
	 */
	
	public boolean puedeDisparar() {
    	if(this.numeroBalas > 0) {
    		return true;
    	}                          
    	return false;
    }

	/**
	 * Este método hace que nuestro soldado dispare a cambio de perder una bala 
	 * y matar al Soldado que le pasamos por parámetro
	 * @param sol hace referencia al soldado que va a morir  
	 */
    public void disparar(Soldado sol) {
    	this.numeroBalas--;
    	sol.estaMuerto = true;
    }
}
