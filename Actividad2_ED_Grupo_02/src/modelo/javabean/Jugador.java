package modelo.javabean;

public class Jugador {
	/**
	 * La clase jugador sirve para asignar un número de dorsal a un jugador, y por otro lado, 
	 * ver que numero de tarjetas amarillas y rojas tiene para comprobar si está expulsado.
	 * 
	 * @author Sheila
	 * @version 1.0
	 */
	
	// ATRIBUTOS PRIVADOS DE LA CLASE JUGADOR
	/**
	 *  Número de dorsal del jugador
	 */
	private int dorsal;
	/**
	 * Total de tarjetas amarillas que ha recibido el jugador
	 */
    private int numeroTarjetasAmarillas;
    /**
	 * Total de tarjetas rojas que ha recibido el jugador
	 */
    private int numeroTarjetasRojas;

    
    // CONSTRUCTORES
    /**
     * Constructor con parámetros
     * @param dorsal Representa el número de dorsal del jugador
     * @param numeroTarjetasAmarillas Representa el número de tarjetas amarillas que ha recibido el jugador
     * @param numeroTarjetasRojas Representa el número de tarjetas rojas que ha recibido el jugador
     */
    public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
    
    /**
     * Constructor sin parámetros
     */
	public Jugador() {
		super();
	}


	// GETTER Y SETTER
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

	
	// REDEFINICION DE OBJETOS
	@Override
	public String toString() {
		return "Jugador [dorsal=" + dorsal + ", numeroTarjetasAmarillas=" + numeroTarjetasAmarillas
				+ ", numeroTarjetasRojas=" + numeroTarjetasRojas + "]";
	}

	
	// *** MÉTODOS PROPIOS DE LA CALSE JUGADOR ***
	// MÉTODO PONERDORSAL
	/**
	 * Este método asignará un dorsal pasado por parametro a la propiedad dorsal del objeto, pero únicamente cuando el dorsal
	 * sea mayor o igual que 1 o menor o igual que 30. En caso contrario, se le asignará el valor "-1".
	 * @param dorsal: número de dorsal del jugador
	 */
	public void ponerDorsal(int dorsal) {
    	if(dorsal >= 1 && dorsal <= 30) {
    		this.dorsal = dorsal;
    	}else {
    		this.dorsal = -1;
    	}
    }

	// MÉTODO ESTAEXPULSADO
	/**
	 * Este método indica si un jugador está expulsado o no. Para ello, primero comprueba el número de tarjetas amarillas,
	 * si estas son igual a 2, el jugador está expulsado.
	 * Por otro lado, comprueba el número de tarjetas rojas, si esta es igual a 1, el jugador está expulsado.
	 * @return expulsado, en el caso de que cumpla alguna de las dos condiciones anteriores
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
