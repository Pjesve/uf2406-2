package controlador;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FuncionesTest {

	@Test
	void rotarDerechaTest() {
		int v[]= {1,5,9};
		int central[] = {5};
		calc.rotarDerecha(v);
		assertArrayEquals("El numero central es {5}",
				central,v);
	}
		
	
	@Test
	void esbisiesto() {
		assertTrue(calc.esbisiesto(2020),
			"El numero 2020 deberia devolver true");
		assertFalse(calc.esbisiesto(2022),
			"El numero 2022 deberia devolver false");	
		assertTrue(calc.esbisiesto(2024),
				"El numero 2024 deberia devolver true");
			assertFalse(calc.esbisiesto(2023),
				"El numero 2023 deberia devolver false");	
			assertTrue(calc.esbisiesto(2000),
					"El numero 2020 deberia devolver true");
				assertFalse(calc.esbisiesto(2005),
					"El numero 2022 deberia devolver false");	

		
	}
	
	@Test
	void esbisiesto2() {
	int anyo;
	if ((anyo % 4 == 0) ;
		System.out.println("true");
	else
		System.out.println("false");
}

}