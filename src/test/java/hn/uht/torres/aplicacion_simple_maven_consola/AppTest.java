package hn.uht.torres.aplicacion_simple_maven_consola;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Before
	public void configuracionInicial()
	{
		System.out.println("se ejecuta al inicio de la pruebas");
		
	}	
	@Test
	public void testsuma() {
		
		assertEquals(App.sumar(5.0,6.0), 11,0, .00001);
	}
	
	private void assertEquals(Object sumar, int expected, int actual, double delta) {
		// TODO Auto-generated method stub
		
	}
	@After
	public void finalizacionPruebas()
	{
		System.out.println(" tearDown se ejecuta despues de cada prueba");
	}	
    
}
