package proyectoEntornosTeamSinExcepcion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlumnoTest {
	//Alumno al1 = new Alumno("1", 10, 10, 10, new ExamenTest(30, 0, 0), new ExamenTest(30, 0, 0), new TrabajoClase(true, 0), new TrabajoClase(true, 0), new TrabajoClase(true, 0));
	//Alumno al1 = new Alumno("1", 10, 10, 10, new ExamenTest(30, 0, 0), new ExamenTest(30, 0, 0), new TrabajoClase(100), new TrabajoClase(100), new TrabajoClase(100));
	/*Alumno al1 = new Alumno("1", new ExamenClasico(0.1, 10), new ExamenClasico(0.2, 10), new ExamenClasico(0.2, 10),
			new ExamenTest(0.25, 30, 0), new ExamenTest(0.25, 30, 0), new TrabajoClase(0),
			new TrabajoClase(0), new TrabajoClase(0));*/
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void calcNotaGlobal() throws SinPorcentajeExcepcion {
		//double result = al1.calcNotaGlobal();
		//assertEquals(10, result);
	}

}
