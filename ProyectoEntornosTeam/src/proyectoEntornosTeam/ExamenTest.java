package proyectoEntornosTeam;

/**
 * <h1> Clase ExamenClasico </h1>
 * Esta clase hereda de la clase Examen, es el examen cl�sico del alumno
 * 
 * @author Bernardo Vila, Zupan Teng
 *
 */
public class ExamenTest extends Examen{

	/**
	 * Constante NUM_PREGUNTAS
	 * 
	 * El n�mero total de preguntas del test
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
	 * Penalizaci�n porcentual por cada fallo sobre 10 puntos
	 * 
	 */
	private static final double VALOR_FALLO = VALOR_PREGUNTA / 3.0;
	
	/**
	 * Atributo numAciertos
	 * 
	 * El n�mero de preguntas respondidas correctamente
	 */	
	private int numAciertos;
	
	/**
	 * Atributo numFallos
	 * 
	 * El n�mero de preguntas respondidas incorrectamente
	 */	
	private int numFallos;
	
	/**
	 * 
	 * @param porcentaje El porcentaje de la nota del examen en la nota global
	 * @param numAciertos El n�mero de preguntas respondidas correctamente
	 * @param numFallos El n�mero de preguntas respondidas incorrectamente
	 * @throws notaInvalidoExamenTestExcepcion La nota no es valida
	 */
	public ExamenTest(double porcentaje, int numAciertos, int numFallos) throws notaInvalidoExamenTestExcepcion {
		super(porcentaje);
		setNumAciertos(numAciertos);
		setNumFallos(numFallos);
	}

	/**
	 * 
	 * @return El n�mero de preguntas respondidas correctamente
	 */
	public int getNumAciertos() {
		return numAciertos;
	}

	/**
	 * 
	 * @return El n�mero de preguntas respondidas incorrectamente
	 */
	public int getNumFallos() {
		return numFallos;
	}

	/**
	 * 
	 * @param numAciertos El n�mero de preguntas respondidas correctamente
	 * @return Devuelve true y lo asigna al atributo numAciertos si el n�mero de preguntas acertadas es valido,  y devuelve false si no es valido
	 * @throws notaInvalidoExamenTestExcepcion
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
	 * @param numFallos El n�mero de preguntas respondidas incorrectamente
	 * @return Devuelve true y lo asigna al atributo numFallos si el n�mero de preguntas falladas es valido, y devuelve false si no es valido
	 * @throws notaInvalidoExamenTestExcepcion
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
	 * @return Devuelve true si la cantidad de preguntas acertadas y falladas es valido y false si no es valido
	 * @throws notaInvalidoExamenTestExcepcion La suma del n�mero de preguntas acertadas y falladas no puede superar al n�mero total de preguntas
	 */
	private boolean ckNotaValidad() throws notaInvalidoExamenTestExcepcion{
		try {
			if ((numAciertos+numFallos) <= NUM_PREGUNTAS)
				return true;
			else throw new notaInvalidoExamenTestExcepcion("el número de las preguntas contesdadas debe ser igual o menor que 30");
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
	 * @return Devuelve el porcentaje de la nota de este examen en la nota global 
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
