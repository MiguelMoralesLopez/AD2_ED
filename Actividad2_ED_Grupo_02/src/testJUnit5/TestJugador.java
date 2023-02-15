
package testJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.javabean.Jugador;

/** En la clase testJugador probaremos las diferentes posibilidades de los metodos ponerDorsal y estaExpulsado
 * @author Sheila
 *
 */
class TestJugador {

	// TEST METODO PONERDORSAL
	// A continuación, testeamos la clase ponerDorsal con todas las posibilidades que nos pueden aparecer :
	
	
	/** PRUEBA 1
	 * En este test probamos el método ponerDorsal, por lo tanto, el resultado que obtengamos para que nos de bien el test
	 * debe de tener un número de dorsal mayor o igual que 1, y menor o igual que 30.
	 * El resultado esperado para este test es : número de dorsal = -1 ,ya que el dorsal 0 se sale del límite, es menor a 1.
	 */
	@Test
	void testPonerDorsal0() {
		Jugador jugador1 = new Jugador(0,0,0);
		jugador1.ponerDorsal(0);
		int resultadoEsperado = -1;
		int resultadoObtenido = jugador1.getDorsal();
		System.out.println(jugador1.getDorsal());
		assertEquals(resultadoEsperado, resultadoObtenido);
	} 
	
	
	/** PRUEBA 2
	 * En este test probamos el método ponerDorsal, por lo tanto, el resultado que obtengamos para que nos de bien el test
	 * debe de tener un número de dorsal mayor o igual que 1, y menor o igual que 30.
	 * El resultado esperado para este test es : número de dorsal = 1
	 */
	@Test
	void testPonerDorsal1() {
		Jugador jugador1 = new Jugador(1,0,0);
		int resultadoEsperado = 1;
		int resultadoObtenido = jugador1.getDorsal();
		System.out.println(jugador1.getDorsal());
		assertEquals(resultadoEsperado, resultadoObtenido);	
	}
	
	
	/** PRUEBA 3
	 * En este test probamos el método ponerDorsal, por lo tanto, el resultado que obtengamos para que nos de bien el test
	 * debe de tener un número de dorsal mayor o igual que 1, y menor o igual que 30.
	 * El resultado esperado para este test es : número de dorsal = 15
	 */
	@Test
	void testPonerDorsal15() {
		Jugador jugador1 = new Jugador(15, 0, 0);
		int resultadoEsperado = 15;
		int resultadoObtenido = jugador1.getDorsal();
		System.out.println(jugador1.getDorsal());
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	/** PRUEBA 4
	 * En este test probamos el método ponerDorsal, por lo tanto, el resultado que obtengamos para que nos de bien el test
	 * debe de tener un número de dorsal mayor o igual que 1, y menor o igual que 30.
	 * El resultado esperado para este test es : número de dorsal = 30
	 */
	@Test
	void testPonerDorsal30() {
		Jugador jugador1 = new Jugador(30, 0, 0);
		int resultadoEsperado = 30;
		int resultadoObtenido = jugador1.getDorsal();
		System.out.println(jugador1.getDorsal());
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	/** PRUEBA 5
	 * En este test probamos el método ponerDorsal, por lo tanto, el resultado que obtengamos para que nos de bien el test
	 * debe de tener un número de dorsal mayor o igual que 1, y menor o igual que 30.
	 * El resultado esperado para este test es : número de dorsal = -1 ,ya que el dorsal 40 se sale del límite, es mayor a 30.
	 */
	@Test
	void testPonerDorsal40() {
		Jugador jugador1 = new Jugador(40, 0, 0);
		int resultadoEsperado = 40;
		int resultadoObtenido = jugador1.getDorsal();
		System.out.println(jugador1.getDorsal());
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	// TEST METODO ESTAEXPULSADO
	// A continuación, testeamos la clase estaExpulsado con todas las posibilidades que nos pueden aparecer :
	
	/** PRUEBA 1
	 * El jugador estara expulsado si tiene 2 tarjetas amarillas o 1 roja
	 * Probamos un jugador con 1 tarjeta amarilla y 0 rojas
	 * Resultado esperado estaExpulsado = false
	 */
	@Test
	void estaExpulsado1() {
		Jugador jugador2 = new Jugador(1, 0);
		assertFalse(jugador2.estaExpulsado());
		System.out.println(jugador2.estaExpulsado());
	}
	
	/** PRUEBA 2
	 * El jugador estara expulsado si tiene 2 tarjetas amarillas o 1 roja
	 * Probamos un jugador con 2 tarjetas amarillas y 0 rojas
	 * Resultado esperado estaExpulsado = true
	 */
	@Test
	void estaExpulsado2() {
		Jugador jugador2 = new Jugador(2, 0);
		assertTrue(jugador2.estaExpulsado());
		System.out.println(jugador2.estaExpulsado());
	} 
	
	/** PRUEBA 3
	 * El jugador estara expulsado si tiene 2 tarjetas amarillas o 1 roja
	 * Probamos un jugador con 0 tarjeta amarilla y 1 roja
	 * Resultado esperado estaExpulsado = true
	 */
	@Test
	void estaExpulsado3() {
		Jugador jugador2 = new Jugador(0, 1);
		assertTrue(jugador2.estaExpulsado());
		System.out.println(jugador2.estaExpulsado());
	}
	
	/** PRUEBA 4
	 * El jugador estara expulsado si tiene 2 tarjetas amarillas o 1 roja
	 * Probamos un jugador con 0 tarjetas amarillas y 0 rojas
	 * Resultado esperado estaExpulsado = false
	 */
	@Test
	void estaExpulsado4() {
		Jugador jugador2 = new Jugador(0, 0);
		assertFalse(jugador2.estaExpulsado());
		System.out.println(jugador2.estaExpulsado());
	}

	/** PRUEBA 5
	 * El jugador estara expulsado si tiene 2 tarjetas amarillas o 1 roja
	 * Probamos un jugador con 1 tarjeta amarilla y 1 roja
	 * Resultado esperado estaExpulsado = true
	 */
	@Test
	void estaExpulsado5() {
		Jugador jugador2 = new Jugador(1, 1);
		assertTrue(jugador2.estaExpulsado());
		System.out.println(jugador2.estaExpulsado());
	}
}
	

	

