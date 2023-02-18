package modelo.javabean;

/**
 * La clase jugador sirve para asignar un número de dorsal a un jugador, y por otro lado, 
 * ver que numero de tarjetas amarillas y rojas tiene para comprobar si está expulsado.
 * 
 * @author Grupo 02
 * @version 2.0
 */
public class Jugador {
	//ATRIBUTOS DE CLASE
	/**
	 * Atributo numérico privado de tipo int. Identifica el número que aparece en el dorsal del jugador.
	 */
	private int dorsal;
	/**
	 * Atributo numérico privado de tipo int. Establece el número de tarjetas amarillas del jugador.
	 */
    private int numeroTarjetasAmarillas;
    /**
     * Atributo numérico privado de tipo int. Establece el número de tarjetas rojas del jugador.
     */
    private int numeroTarjetasRojas;
    
    //CONSTRUCTOR
    
    public Jugador() {
		super();
	}
    
    
    //GETTERS Y SETTERS
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
  	
  	// *****MÉTODOS PROPIOS*****
  	
  	//PONER DORSAL
  	/**
  	 * Método para establecer el número de dorsal del jugador. 
  	 * Se debe introducir un número entre 1 y 30, 
  	 * de lo contrario establece el valor -1.
  	 * @param dorsal dato numérico tipo int
  	 */
  	public void ponerDorsal(int dorsal) {
      	if(dorsal >= 1 && dorsal <= 30) {
      		this.dorsal = dorsal;
      	}else {
      		this.dorsal = -1;
      	}
      }
  	
  	//ESTÁ EXPULSADO
  	/**
	 * Método que comprueba si el jugador está expulsado en base a sus 
	 * tarjetas (amarillas y rojas).
	 * @return Devuelve una variable de tipo boolean. 
	 * 		   True si tiene 2 tarjetas amarillas.
	 * 		   True si tiene 1 tarjeta roja.
	 * 		   False si ninguna de las anteriores se cumple.
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








