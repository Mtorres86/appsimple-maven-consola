package hn.uht.torres.aplicacion_simple_maven_consola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;




/**
 * Unit test for simple App.
 */

/**
 * en esta etapa se ejecita la metodolia tdt que primero creo el codigo en version de prueba
 * lo ejecuto y luego lo renderizo si es necesario
 * 
 * si todo marcha bien se procede a crear el codigo en el main*/

//los test se hacen para probar que funcionar en todos los casos. 

/**SE REFACTIORIZA UNA VEZX QUE SE EJECUTEN LAS PRUEBAS Y TODO ESTE CORRECTO*/
public class AppTest {
	
	@Before
	public void configuracionInicial()
	{
		System.out.println("Metodo tipo setup, se ejecuta antes de cada prueba");
		
	}	
	
	//aqui se evaluan las operaciones de la calculdora
	@Test
	public void testsuma() {
		//assertEquals se debe de espeficiar los margenes de error enm las sumas, en la operacion, o sea con que tanta exactitud se debe de hacer la oepracion
		//este es mas exacto
		//aqui le decimos que despues del asser mandamos a llamar nuestro metodo y le decimo que 
				//5+6 son 11 y debera mostrar un error minino de 00001
		assertEquals(App.sumar(5.0,6.0), 11,0, .00001);
	}
	
	
	

	private void assertEquals(double sumar, int i, int j, double d) {
		// TODO Auto-generated method stub
		
	}

	@Test //esta es una anotacion para indicar que se hara una prueba
	public void testsuma2() {
		//assertTrue es mas general no se ocupa espeficiar el margen de error al ejeructar la operacion
		//aqui le decimos que despues del asser mandamos a llamar nuestro metodo y le decimo que 
		//8+7 son 15 y debera mostrar un error minino de 00001
		
		assertTrue(App.sumar(5.0,6.0), 11,0, .00001);
	}
	
	
	private void assertTrue(double sumar, int i, int j, double d) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void TestResta1() {
		//aqui le decimos que despues del asser mandamos a llamar nuestro metodo y le decimo que 
				//1-1 son 0 no necesita identificr el margend e error
		//se recomienda trabajar con decimales
		assertTrue(App.restar(1.0,1.0)== 0.0);
		
	}
	private void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void TestResta2(){
		assertTrue(App.restar(2.0,1.0)== 1.0);
	}
	
	@Test
	public void TestResta3(){
		assertTrue(App.restar(1.0,2.0)== -1.0);
	}
	
	@AfterClass
	public static void finalizacionPruebas()
	{
		System.out.println(" tearDown se ejecuta despues de cada prueba");
	}	
    
}
