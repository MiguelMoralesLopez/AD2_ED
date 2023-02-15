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
	private Soldado soldado;
	private Soldado soldadoBueno;
	private Soldado soldadoMalo;

	@BeforeEach
	void crearSoldados(){
		soldado = new Soldado();
		soldadoBueno = new Soldado(false, 10);
		soldadoMalo = new Soldado(true, 10);
	}
	
	@AfterEach
	void borrarSoldados() {
		soldado = null;
		soldadoBueno = null;
		soldadoMalo = null;
	}
	
	// TEST METODO PUEDEDISPARAR
	// A continuación, testeamos la clase puedeDisparar con todas las posibilidades que nos pueden aparecer :
		
	/** PRUEBA 1
	 * En este test probamos si el soldado puede disparar si el número de balas es 0
	 * Resultado esperado : False , porque se establecen 0 balas
	 */
	@Test
	void testPuedeDisparar0() {
		soldado.setNumeroBalas(0);
		assertFalse(soldado.puedeDisparar());
	}
	
	
	/** PRUEBA 2
	 * En este test probamos si el soldado puede disparar si el número de balas es mayor que 0
	 * Resultado esperado : True , porque se establecen 100 balas
	 */
	@Test
	void testPuedeDisparar100() {
		soldado.setNumeroBalas(100);
		assertTrue(soldado.puedeDisparar());
	}
	
	//TEST METODO DISPARAR
	/** PRUEBA 1
	 * En este caso, el soldadoMalo está muerto y tiene 10 balas
	 * El resultado esperado es True
	 */
	@Test
	void testDispararSi() {
		assertTrue(soldadoMalo.isEstaMuerto());
		System.out.println(soldadoMalo.isEstaMuerto());
		}
	
	/** PRUEBA 2
	 *  En este caso, el soldadoBueno no está muerto, y tiene 10 balas
	 *  El resultado esperado es False
	 */
	@Test
	void testDispararsNo() {
		assertFalse(soldadoBueno.isEstaMuerto());
		System.out.println(soldadoBueno.isEstaMuerto());
		}
	
	/** PRUEBA 3
	 * En este caso, el soldado sinBalas está muerto, y tiene 0 balas
	 * El resultado esperado es True
	 */
	@Test
	void testDispararSinBalas() {
		Soldado sinBalas = new Soldado(true, 0);
		assertTrue(sinBalas.isEstaMuerto());
		}
	
	

}
