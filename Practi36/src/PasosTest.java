import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasosTest {

	@Test
	void testValoracion1() {
		String esperado = "Lleva una vida sedentaria";
		Pasos carol=new Pasos(500);
		String valoracion = carol.valoracion();
		assertEquals(esperado, valoracion);
	}
	@Test
	void testValoracion2() {
		String esperado = "Lleva una vida poco activa";
		Pasos luis=new Pasos(1500);
		String valoracion = luis.valoracion();
		assertEquals(esperado, valoracion);
	}
	@Test
	void testValoracion3() {
		String esperado = "Se acerca el objetivo";
		Pasos luis2=new Pasos(3800);
		String valoracion = luis2.valoracion();
		assertEquals(esperado, valoracion);
	}
	@Test
	void testValoracion4() {
		String esperado = "No está mal";
		Pasos luis3=new Pasos(5000);
		String valoracion = luis3.valoracion();
		assertEquals(esperado, valoracion);
	}
	@Test
	void testValoracion5() {
		String esperado = "Así se hace";
		Pasos luis4=new Pasos(6500);
		String valoracion = luis4.valoracion();
		assertEquals(esperado, valoracion);
	}

}
