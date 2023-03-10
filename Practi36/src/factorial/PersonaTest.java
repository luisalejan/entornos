package factorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

		@Test
		void testEsMayorEdadEdadesNegativas() {
			Persona persona = new Persona();
			persona.setEdad(-13);
			try {
				persona.esMayorEdad();
				fail();
			}catch(AssertionError error) {
				
			}catch(Exception ex) {
				fail();
			}
		}
		
		@Test
		void testEsMayorEdadMenoresDeEdad() {
			Persona persona = new Persona();
			persona.setEdad(12);
			/*
			boolean expected = false;
			boolean actual = persona.esMayorEdad();
			assertEquals(expected, actual);
			_*/
			assertFalse(persona.esMayorEdad());
			
		}
		
		@Test
		void testEsMayorEdadMayoresDeEdad() {
			Persona persona = new Persona();
			persona.setEdad(21);
			assertTrue(persona.esMayorEdad());
		}
	}
