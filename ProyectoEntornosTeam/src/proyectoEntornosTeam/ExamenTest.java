package proyectoEntornosTeam;

/**
 * <h2> Clase ExamenClasico </h2>
 * Esta clase hereda de la clase Examen, es el exámen clásico del alumno
 * 
 * @author Bernardo Vila, Zupan Teng
 *
 */
public class ExamenTest extends Examen{

	/**
	 * Constante NUM_PREGUNTAS
	 * 
	 * El número total de preguntas del test
	 * 
	 */
	private static final int NUM_PREGUNTAS = 30;
	
	/**
	 * Constante VALOR_PREGUNTA
	 * 
	 * Valor porcentual de cada pregunta sobre 10 puntos
	 * 
	 */
	private static final double VALOR_PREGUNTA = 10 / (double)NUM_PREGUNTAS;
	
	/**
	 * Contante VALOR_FALLO
	 * 
	 * Penalización porcentual por cada fallo sobre 10 puntos
	 * 
	 */
	private static final double VALOR_FALLO = VALOR_PREGUNTA / 3.0;
	
	/**
	 * Atributo numAciertos
	 * 
	 * El número de preguntas respondidas correctamente
	 */	
	private int numAciertos;
	
	/**
	 * Atributo numFallos
	 * 
	 * El número de preguntas respondidas incorrectamente
	 */	
	private int numFallos;
	
	/**
	 * 
	 * @param porcentaje El porcentaje de la nota del exámen en la nota global
	 * @param numAciertos El número de preguntas respondidas correctamente
	 * @param numFallos El número de preguntas respondidas incorrectamente
	 * @throws notaInvalidoExamenTestExcepcion La nota no es válida
	 */
	public ExamenTest(double porcentaje, int numAciertos, int numFallos) throws notaInvalidoExamenTestExcepcion {
		super(porcentaje);
		setNumAciertos(numAciertos);
		setNumFallos(numFallos);
	}

	/**
	 * 
	 * @return El número de preguntas respondidas correctamente
	 */
	public int getNumAciertos() {
		return numAciertos;
	}

	/**
	 * 
	 * @return El número de preguntas respondidas incorrectamente
	 */
	public int getNumFallos() {
		return numFallos;
	}

	/**
	 * 
	 * @param numAciertos El número de preguntas respondidas correctamente
	 * @return Devuelve true y lo asigna al atributo numAciertos si el número de preguntas acertadas es válido,  y devuelve false si no es válido
	 * @throws notaInvalidoExamenTestExcepcion Nota no válida
	 */
	public boolean setNumAciertos(int numAciertos) throws notaInvalidoExamenTestExcepcion {
		if (ckNotaValidad()) {
			this.numAciertos = numAciertos; 
			return true;
		}		
		return false;
	}

	/**
	 * 
	 * @param numFallos El número de preguntas respondidas incorrectamente
	 * @return Devuelve true y lo asigna al atributo numFallos si el número de preguntas falladas es válido, y devuelve false si no es válido
	 * @throws notaInvalidoExamenTestExcepcion Nota no válida
	 */
	public boolean setNumFallos(int numFallos) throws notaInvalidoExamenTestExcepcion {
		if (ckNotaValidad()) {
			this.numFallos = numFallos; 
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @return Devuelve true si la cantidad de preguntas acertadas y falladas es válida y false si no es válido
	 * @throws notaInvalidoExamenTestExcepcion La suma del número de preguntas acertadas y falladas no puede superar al número total de preguntas
	 */
	private boolean ckNotaValidad() throws notaInvalidoExamenTestExcepcion{
		try {
			if ((numAciertos+numFallos) <= NUM_PREGUNTAS)
				return true;
			else throw new notaInvalidoExamenTestExcepcion("El número de las preguntas contestadas debe ser igual o menor que " + NUM_PREGUNTAS);
		} catch (notaInvalidoExamenTestExcepcion e) {
			System.out.println(e);
			return false;
		}
	}
	@Override
	public String toString() {
		return "preguntas: " + NUM_PREGUNTAS + ", aciertos: " + numAciertos + ", fallos: " + numFallos
				+ ", no contestadas: " + (NUM_PREGUNTAS - numAciertos - numFallos);
	}

	/**
	 * 
	 * @return Devuelve la nota de este examen sobre 10 puntos
	 */
	public double calcularNota() {
		double nota = (this.numAciertos * VALOR_PREGUNTA) - (this.numFallos * VALOR_FALLO);
		if (nota < 0) nota = 0;
		return nota;
	}

	/**
	 * 
	 * @return Devuelve el porcentaje de la nota de este exámen en la nota global 
	 */
	@Override
	public double getNota() throws SinPorcentajeExcepcion {
		try {
			if (porcentaje == 0) throw new SinPorcentajeExcepcion("Porcentaje no asignado");
			else return calcularNota()*porcentaje;
		} catch (SinPorcentajeExcepcion e) {
			System.out.println(e);
			return 0;
		}
	}
}
