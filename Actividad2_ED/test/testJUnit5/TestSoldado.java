package testJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.javabean.Soldado;


class TestSoldado {

	private Soldado sol1;
	
	@BeforeEach
	
	void ini() {
		sol1 = new Soldado();
	}
	
	@AfterEach
	void fin() {
		sol1 = null;
	}
	
	@Test
	void testPuedeDisparar() {
		
		sol1.setNumeroBalas(5);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = sol1.puedeDisparar();
		assertEquals (resultadoEsperado, resultadoObtenido);
		
		sol1.setNumeroBalas(0);
		boolean resultadoEsperado2 = false;
		boolean resultadoObtenido2 = sol1.puedeDisparar();
		assertEquals (resultadoEsperado2, resultadoObtenido2);
		
		sol1.setNumeroBalas(-15);
		boolean resultadoEsperado3 = false;
		boolean resultadoObtenido3 = sol1.puedeDisparar();
		assertEquals (resultadoEsperado3, resultadoObtenido3);

		
	}

	@Test
	void testDisparar() {
		
		Soldado sol2 = new Soldado();

		sol1.setNumeroBalas(2);
		sol1.disparar(sol2);

		boolean resultadoEsperado = true;
		boolean resultadoObtenido = sol2.getEstaMuerto();
		assertEquals (resultadoEsperado, resultadoObtenido);

		int balasRestantesEsperadas = 1;
		int balasRestantesObtenidas = sol1.getNumeroBalas();
		assertEquals (balasRestantesEsperadas, balasRestantesObtenidas );
		
		}

}


