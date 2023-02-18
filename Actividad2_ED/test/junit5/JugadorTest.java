package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.javabean.Jugador;

class JugadorTest {
	
	private Jugador j1;
	// Se crea un objeto de tipo Jugador, j1, que servirá como ejemplo o prueba
	
	@BeforeEach
	void cargaDatos() {
		j1 = new Jugador();
	}
	/**
	 * Este método ejecuta después de cada test, utilizado para limpiar el entorno de testing
	 */
	@AfterEach
	void borrarDatos() {
		j1 = null;
	}
	/**
	 * TestPonerDorsal, establezco limitaciones, para probar los casos cuestionados
	 * entre >= 1 y <=30, utilizo el 1 y el 30 para probarlo, y su limitacion >1, en este caso
	 * el 0 y >30 prueblo con el 31
	 */

	@Test
	void testPonerDorsal() {
		j1.ponerDorsal(1);
		int resultadoEsperado = 1;
		int resultadoObtenido = j1.getDorsal();
		System.out.println(j1.getDorsal());
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		j1.ponerDorsal(30);
		resultadoEsperado = 30;
		resultadoObtenido = j1.getDorsal();
		System.out.println(j1.getDorsal());
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		j1.ponerDorsal(0);
		resultadoEsperado = -1;
		resultadoObtenido = j1.getDorsal();
		System.out.println(j1.getDorsal());
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		j1.ponerDorsal(31);
		resultadoEsperado = -1;
		resultadoObtenido = j1.getDorsal();
		System.out.println(j1.getDorsal());
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	/**
	 * testEstaExpulsado, comenzamos reseteando todos los valores en 0
	 * Debemos tener en cuenta las posibilidades de ser expulsado
	 * 0 tarjetas amarillas y 0 rojas, no esta expulsado entonces false
	 * 1 tarjeta amarilla y 0 rojas, no esta expulsado por lo tanto false
	 * 2 tarjetas amarillas y 0 rojas, sera expulsado porque 2 amarillas=1 roja True
	 * 0 tarjetas amarillas y 1 roja, expulsado entonces True
	 */
	@Test
	void testEstaExpulsado() {
		
		j1.setDorsal(0);
		j1.setNumeroTarjetasAmarillas(0);
		j1.setNumeroTarjetasRojas(0);
		assertFalse(j1.estaExpulsado());
		
		int tarjetasAmarillasEsperadas = 0;
		int tarjetasAmarillasObtenidas = j1.getNumeroTarjetasAmarillas();
		assertEquals(tarjetasAmarillasEsperadas, tarjetasAmarillasObtenidas);
		
		int tarjetasRojasEsperadas = 0;
		int tarjetasRojasObtenidas = j1.getNumeroTarjetasRojas();
		assertEquals(tarjetasRojasEsperadas, tarjetasRojasObtenidas);
		
		j1.setNumeroTarjetasAmarillas(1);
		j1.setNumeroTarjetasRojas(0);
		assertFalse(j1.estaExpulsado());
		
		tarjetasAmarillasEsperadas = 1;
		tarjetasAmarillasObtenidas = j1.getNumeroTarjetasAmarillas();
		assertEquals(tarjetasAmarillasEsperadas, tarjetasAmarillasObtenidas);
		
		tarjetasRojasEsperadas = 0;
		tarjetasRojasObtenidas = j1.getNumeroTarjetasRojas();
		assertEquals(tarjetasRojasEsperadas, tarjetasRojasObtenidas);
		
		j1.setNumeroTarjetasAmarillas(2);
		j1.setNumeroTarjetasRojas(0);
		assertTrue(j1.estaExpulsado());
		
		tarjetasAmarillasEsperadas = 2;
		tarjetasAmarillasObtenidas = j1.getNumeroTarjetasAmarillas();
		assertEquals(tarjetasAmarillasEsperadas, tarjetasAmarillasObtenidas);
		
		tarjetasRojasEsperadas = 0;
		tarjetasRojasObtenidas = j1.getNumeroTarjetasRojas();
		assertEquals(tarjetasRojasEsperadas, tarjetasRojasObtenidas);
		
		j1.setNumeroTarjetasAmarillas(0);
		j1.setNumeroTarjetasRojas(1);
		assertTrue(j1.estaExpulsado());
		
		tarjetasAmarillasEsperadas = 0;
		tarjetasAmarillasObtenidas = j1.getNumeroTarjetasAmarillas();
		assertEquals(tarjetasAmarillasEsperadas, tarjetasAmarillasObtenidas);
		
		tarjetasRojasEsperadas = 1;
		tarjetasRojasObtenidas = j1.getNumeroTarjetasRojas();
		assertEquals(tarjetasRojasEsperadas, tarjetasRojasObtenidas);
	}
}

	


