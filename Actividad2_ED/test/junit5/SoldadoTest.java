package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import modelo.javabean.Soldado;

class SoldadoTest {
	
	
	private Soldado s1;
	// Se crea un objeto de tipo Soldado, s1, que servirá como ejemplo o prueba
	
	@BeforeEach
	void cargaDatos() {
		s1 = new Soldado();
	}
	/**
	 * Este método ejecuta después de cada test, utilizado para limpiar el entorno de testing
	 */
	@AfterEach
	void borrarDatos() {
		s1 = null;
	}
	/**
	 * TestPuedeDisparar, establezco limitaciones 5 balas por ejemplo
	 * Al realizar la prueba nos da true, que era lo esperado
	 * Luego testeo con 0 balas, para establecer que sin balas no puede disparar, 
	 * resultado false, que era el esperado
	 */

		@Test
		
		void testPuedeDisparar() {
			s1.setNumeroBalas(5);
			assertTrue(s1.puedeDisparar());
			
			s1.setNumeroBalas(0);
			assertFalse(s1.puedeDisparar());
		}
		/**
		 * Test del método disparar() de Soldado.
		 * Para realizar las pruebas de disparar necesito a quien disparar en este caso s2
		 * El primer soldado s1, se cargara con 5 balas
		 * Resultado esperado: a s1 le quedan 4 balas, al disparar a s2, este  pasa a true al estar muerto
		 * Resultado obtenido: a s1 le quedan 4 balas y s2 cambia a estaMuerto por lo tanto true.
		 */
		@Test
		void testDisparar() {
			Soldado s2 = new Soldado();
			
			s1.setNumeroBalas(5);
			s2.setEstaMuerto(false);
			
			s1.disparar(s2);
			int balasEsperadas = 4;
			int balasObtenidas = s1.getNumeroBalas();
			assertEquals(balasEsperadas, balasObtenidas);
			assertTrue(s2.isEstaMuerto());
			
			}
		}