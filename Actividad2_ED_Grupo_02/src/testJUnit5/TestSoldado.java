/**
 * 
 */
package testJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.javabean.Soldado;

/**
 * @author Sheila
 *
 */
class TestSoldado {
	
	//ATRIBUTOS 
	private Soldado soldadoBueno;
	private Soldado soldadoMalo;

	@BeforeEach
	void crearSoldados(){
		soldadoBueno = new Soldado();
		soldadoMalo = new Soldado();
	}
	
	// TEST METODO PUEDEDISPARAR
	// A continuación, testeamos la clase puedeDisparar con todas las posibilidades que nos pueden aparecer :
	
	/** PRUEBA 1
	 * En este test probamos si el soldado puede disparar si el número de balas es mayor que 0
	 * Resultado esperado : True , porque se establecen 100 balas
	 */
	@Test
	void testPuedeDisparar100() {
		soldadoBueno.setNumeroBalas(100);
		assertTrue(soldadoBueno.puedeDisparar());
		System.out.println(soldadoBueno.puedeDisparar());
	}
	
	/** PRUEBA 2
	 * En este test probamos si el soldado puede disparar si el número de balas es 0
	 * Resultado esperado : False , porque se establecen 0 balas
	 */
	@Test
	void testPuedeDisparar0() {
		soldadoBueno.setNumeroBalas(0);
		assertFalse(soldadoMalo.puedeDisparar());
		System.out.println(soldadoMalo.puedeDisparar());
	}
	
	

}
