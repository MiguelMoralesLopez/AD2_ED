package modelo.javabean;

public class Jugador {
	/**
	 * atributo privado que hace referencia al numero de dorsal de nuestro jugador
	 */
	private int dorsal;
	/**
	 * atributo privado que hace referencia al numero de tarjetas amarillas que tiene nuestro jugador
	 */
    private int numeroTarjetasAmarillas;
    /**
     * atributo privado que hace referencia al numero de tarjetas rojas que tiene nuestro jugador

     */
    private int numeroTarjetasRojas;


    
    public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	
	/**
	 * Este método se encarga de poner el dorsal a nuestro jugador
	 * 
	 * @param dorsal hace referencia al dorsal de nuestro jugador. 
	 * El número de dorsal de nuestro jugador será establecido 
	 * siempre y cuando sea un número mayor o igual que 1, o menor o igual que 30.
	 * En cualquier otro caso el numero de dorsal será -1
	 */
	
	public void ponerDorsal(int dorsal) {
    	if(dorsal >= 1 && dorsal <= 30) {
    		this.dorsal = dorsal;
    	}else {
    		this.dorsal = -1;
    	}
    }

	/**
	 * Este método nos indica si nuestro jugador está expulsado o no
	 * 
	 * @return devuelve un atributo booleano, 
	 * true en caso de que nuestro jugador esté expulsado y 
	 * false en caso de que no esté expulsado
	 * 
	 * Si el numero de tarjetas amarillas del jugador es igual a 2, devuelve true
	 * si el numero de tarjetas rojas es igual a 1, devuelve true
	 * En cualquier otro caso devuelve false
	 */
	
    public boolean estaExpulsado() {
    	boolean expulsado = false;                                                  
    	if(numeroTarjetasAmarillas == 2) {
    		expulsado = true;
    	}                          
    	if(numeroTarjetasRojas == 1) {
    		expulsado = true;
    	}                          
    	return expulsado;
    }            
}
