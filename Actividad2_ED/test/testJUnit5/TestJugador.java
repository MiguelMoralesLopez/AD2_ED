package testJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.javabean.Jugador;

class TestJugador {
	
	private Jugador jug1;
	
	@BeforeEach 
	
	void ini() {
		jug1 = new Jugador();
	}
	
	@AfterEach
	
	void fin( ) {
		jug1 = null;
	}
	
	
	@Test
	void testPonerDorsal() {
		
		jug1.ponerDorsal(1);
		
		int resultadoEsperado = 1;
		int resultadoObtenido = jug1.getDorsal();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		jug1.ponerDorsal(30);
		int resultadoEsperado2 = 30;
		int resultadoObtenido2 = jug1.getDorsal();
		
		assertEquals(resultadoEsperado2, resultadoObtenido2);
		
		jug1.ponerDorsal(40);
		int resultadoEsperado3 = -1;
		int resultadoObtenido3 = jug1.getDorsal();
		
		assertEquals(resultadoEsperado3, resultadoObtenido3);
		
		
	}
	
	@Test
	
	void testEstaExpulsado () {
		
		jug1.setNumeroTarjetasAmarillas(2);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = jug1.estaExpulsado();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		jug1.setNumeroTarjetasRojas(1);
		boolean resultadoEsperado2 = true;
		boolean resultadoObtenido2 = jug1.estaExpulsado();
		assertEquals (resultadoEsperado2, resultadoObtenido2);
		
		
		Jugador jug2 = new Jugador();
		jug2.setNumeroTarjetasAmarillas(1);
		boolean resultadoEsperado3 = false;
		boolean resultadoObtenido3 = jug2.estaExpulsado();
		assertEquals (resultadoEsperado3, resultadoObtenido3);
		
		jug2.setNumeroTarjetasRojas(10);
		boolean resultadoEsperado4 = false;
		boolean resultadoObtenido4 = jug2.estaExpulsado();
		assertEquals (resultadoEsperado4, resultadoObtenido4);
		
	}

}
