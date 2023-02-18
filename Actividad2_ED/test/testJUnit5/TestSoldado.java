package testJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.javabean.Soldado;

class TestSoldado {
	
	private Soldado sol1;
	/**
	 * Carga de datos inicial antes de cada prueba. Se construye un objeto de tipo Soldado
	 * sin atributos para ser utilizado en los test.
	 */
	@BeforeEach
	void cargaDatos() {
		sol1 = new Soldado();
	}
	/**
	 * Este método deja todos los valores del objeto creado en cada test a null.
	 */
	@AfterEach
	void borrarDatos() {
		sol1 = null;
	}
	/**
	 * Test del método puedeDisparar() de Soldado.
	 * Se hace una primera prueba estableciendo el número de balas en 10.
	 * Resultado esperado: true. Resultado obtenido: true.
	 * Se hace una variación del número de balas y se deja a 0.
	 * Resultado esperado: false. Resultado obtenido: false.
	 */
	@Test
	void testPuedeDisparar() {
		sol1.setNumeroBalas(10);
		assertTrue(sol1.puedeDisparar());
		
		sol1.setNumeroBalas(0);
		assertFalse(sol1.puedeDisparar());
	}
	/**
	 * Test del método disparar() de Soldado.
	 * Se crea un segundo objeto de tipo Soldado y se hace una carga de balas al primero (+10).
	 * Se ejecuta el método de sol1 usando como argumento del mismo a sol2.
	 * Resultado esperado: a sol1 le quedan 9 balas y el atributo estaMuerto de sol2 pasa a true.
	 * Resultado obtenido: a sol1 le quedan 9 balas y el atributo estaMuerto de sol2 pasa a true.
	 */
	@Test
	void testDisparar() {
		Soldado sol2 = new Soldado();
		
		sol1.setNumeroBalas(10);
		sol2.setEstaMuerto(false);
		
		sol1.disparar(sol2);
		int balasEsperadas = 9;
		int balasObtenidas = sol1.getNumeroBalas();
		assertEquals(balasEsperadas, balasObtenidas);
		assertTrue(sol2.isEstaMuerto());
		
		
	}

}
