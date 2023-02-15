package testJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.javabean.Jugador;

class TestJugador {
	
	private Jugador j1;
	/**
	 * Carga de datos inicial antes de cada prueba. Se construye un objeto de tipo Jugador
	 * sin atributos para ser utilizado en los test.
	 */
	@BeforeEach
	void cargaDatos() {
		j1 = new Jugador();
	}
	/**
	 * Este método deja todos los valores del objeto creado en cada test a null.
	 */
	@AfterEach
	void borrarDatos() {
		j1 = null;
	}
	/**
	 * Test del método ponerDorsal() de Jugador.
	 * Se varía el argumento pasado al método de forma que coja un 
	 * número intermedio del rango entre 1 y 30 (15), los valores
	 * límite (1 y 30), un valor inferior (0) y un valor 
	 * superior (40).
	 */
	@Test
	void testPonerDorsal() {
		
		j1.ponerDorsal(15);
		int resultadoEsperado = 15;
		int resultadoObtenido = j1.getDorsal();
		System.out.println(j1.getDorsal());
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		j1.ponerDorsal(1);
		resultadoEsperado = 1;
		resultadoObtenido = j1.getDorsal();
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
		
		j1.ponerDorsal(40);
		resultadoEsperado = -1;
		resultadoObtenido = j1.getDorsal();
		System.out.println(j1.getDorsal());
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	/**
	 * Test del método estáExpulsado() de Jugador.
	 * Se establecen todos los valores a 0 en j1. Se va variando 
	 * el número de tarjetas amarillas y rojas en cada caso de prueba.
	 * Las combinaciones usadas son (tarjetaAmarilla, tarjetaRoja):
	 * (0,0);(1,0);(2,0);(0,1). Los resultados esperados son, respectivamente:
	 * false, false, true, true.
	 */
	@Test
	void testEstaExpulsado() {
		
		j1.setDorsal(0);
		j1.setNumeroTarjetasAmarillas(0);
		j1.setNumeroTarjetasRojas(0);
		boolean testExpulsado = j1.estaExpulsado();
		boolean expulsado = false;
		assertEquals(testExpulsado, expulsado);
		
		int tarjetasAmarillasEsperadas = 0;
		int tarjetasAmarillasObtenidas = j1.getNumeroTarjetasAmarillas();
		assertEquals(tarjetasAmarillasEsperadas, tarjetasAmarillasObtenidas);
		int tarjetasRojasEsperadas = 0;
		int tarjetasRojasObtenidas = j1.getNumeroTarjetasRojas();
		assertEquals(tarjetasRojasEsperadas, tarjetasRojasObtenidas);
		
		j1.setNumeroTarjetasAmarillas(1);
		j1.setNumeroTarjetasRojas(0);
		testExpulsado = j1.estaExpulsado();
		expulsado = false;
		assertEquals(testExpulsado, expulsado);
		
		tarjetasAmarillasEsperadas = 1;
		tarjetasAmarillasObtenidas = j1.getNumeroTarjetasAmarillas();
		assertEquals(tarjetasAmarillasEsperadas, tarjetasAmarillasObtenidas);
		tarjetasRojasEsperadas = 0;
		tarjetasRojasObtenidas = j1.getNumeroTarjetasRojas();
		assertEquals(tarjetasRojasEsperadas, tarjetasRojasObtenidas);
		
		j1.setNumeroTarjetasAmarillas(2);
		j1.setNumeroTarjetasRojas(0);
		testExpulsado = j1.estaExpulsado();
		expulsado = true;
		assertEquals(testExpulsado, expulsado);
		
		tarjetasAmarillasEsperadas = 2;
		tarjetasAmarillasObtenidas = j1.getNumeroTarjetasAmarillas();
		assertEquals(tarjetasAmarillasEsperadas, tarjetasAmarillasObtenidas);
		tarjetasRojasEsperadas = 0;
		tarjetasRojasObtenidas = j1.getNumeroTarjetasRojas();
		assertEquals(tarjetasRojasEsperadas, tarjetasRojasObtenidas);
		
		j1.setNumeroTarjetasAmarillas(0);
		j1.setNumeroTarjetasRojas(1);
		testExpulsado = j1.estaExpulsado();
		expulsado = true;
		assertEquals(testExpulsado, expulsado);
		
		tarjetasAmarillasEsperadas = 0;
		tarjetasAmarillasObtenidas = j1.getNumeroTarjetasAmarillas();
		assertEquals(tarjetasAmarillasEsperadas, tarjetasAmarillasObtenidas);
		tarjetasRojasEsperadas = 1;
		tarjetasRojasObtenidas = j1.getNumeroTarjetasRojas();
		assertEquals(tarjetasRojasEsperadas, tarjetasRojasObtenidas);
	}
}
