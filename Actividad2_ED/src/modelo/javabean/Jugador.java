package modelo.javabean;
/**
 * Se crea la clase Jugador con los atributos privados
 * @author Juanjo
 * @version 1.0
 */
public class Jugador {
	// Indica el número del dorsal del jugador
	private int dorsal;
	// Muestra el número de tarjetas amarillas del jugador
    private int numeroTarjetasAmarillas;
    // Revela el número de tarjetas rojas del jugador
    private int numeroTarjetasRojas;
    
    // Constructores 
    public Jugador() {
		super();
	}
    /**
     * Constructor con parámetros
     * @param dorsal, el número de dorsal del jugador
     * @param numeroTarjetasAmarillas, el número de tarjetas amarillas del jugador 
     * @param numeroTarjetasRojas, el número de tarjetas rojas del jugador 
     */
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	//Getter&Setter
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
	
	//Métodos propios de la clase jugador
	/**
	 * Método ponerDorsal, Designa un dorsal al jugador
	 * Mientras se indique un número entre 1 y 30, será efectivo
	 * fuera de este rango tendrá valor -1
	 * @param dorsal variable tipo int
	 */
	public void ponerDorsal(int dorsal) {
         if(dorsal >= 1 && dorsal <= 30) {
              this.dorsal = dorsal;
         }else {
        	  this.dorsal = -1;

          }
    }
	/**
	 * Método estaExpulsado, muestra las tarjetas amarillas y rojas(expulsión)
	 * @return True si tiene 2 tarjetas amarillas(expulsado) ó 1 roja(expulsado)
	 * 		  
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
