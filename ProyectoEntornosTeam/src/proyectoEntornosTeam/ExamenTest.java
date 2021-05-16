package proyectoEntornosTeam;

/**
 * <h1> Clase ExamenClasico </h1>
 * Esta clase es heredado de la clase Examen, es el examen clásico del alumno
 * 
 * @author Bernardo,Zupan
 *
 */
public class ExamenTest extends Examen{

	/**
	 * Constante NUM_PREGUNTAS
	 * 
	 * El número total de las preguntas
	 * 
	 */
	private static final int NUM_PREGUNTAS = 30;
	
	/**
	 * Constante VALOR_PREGUNTA
	 * 
	 * Valor porcentuales de cada pregunta en 10 puntos
	 * 
	 */
	private static final double VALOR_PREGUNTA = 10 / (double)NUM_PREGUNTAS;
	
	/**
	 * Contante VALOR_FALLO
	 * 
	 * Penalización porcentuales de cada fallo en 10 puntos
	 * 
	 */
	private static final double VALOR_FALLO = VALOR_PREGUNTA / 3.0;
	
	/**
	 * Atributo numAciertos
	 * 
	 * El número de preguntas respondidas correcta
	 */	
	private int numAciertos;
	
	/**
	 * Atributo numFallos
	 * 
	 * El número de preguntas respondidas incorrecta
	 */	
	private int numFallos;
	
	/**
	 * 
	 * @param porcentaje El porcentaje de la nota del examen en la nota global
	 * @param numAciertos El número de preguntas respondidas correcta
	 * @param numFallos El número de preguntas respondidas incorrecta
	 * @throws notaInvalidoExamenTestExcepcion La nota no es valido
	 */
	public ExamenTest(double porcentaje, int numAciertos, int numFallos) throws notaInvalidoExamenTestExcepcion {
		super(porcentaje);
		setNumAciertos(numAciertos);
		setNumFallos(numFallos);
	}

	/**
	 * 
	 * @return El número de preguntas respondidas correcta
	 */
	public int getNumAciertos() {
		return numAciertos;
	}

	/**
	 * 
	 * @return El número de preguntas respondidas incorrecta
	 */
	public int getNumFallos() {
		return numFallos;
	}

	/**
	 * 
	 * @param numAciertos El número de preguntas respondidas correcta
	 * @return Devuelve true si el número de preguntas aciertas es valido y lo asigna al atributo numAciertos y false si no es valido
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
	 * @param numFallos El número de preguntas respondidas incorrecta
	 * @return Devuelve true si el número de preguntas falladas es valido y lo asigna al atributo numFallos y false si no es valido
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
	 * @return Devuelve true si la cantidad de preguntas aciertas y falladas es valido y false si no es valido
	 * @throws notaInvalidoExamenTestExcepcion La suma del número de preguntas aciertas y falladas no puede superar al número de todas las preguntas
	 */
	private boolean ckNotaValidad() throws notaInvalidoExamenTestExcepcion{
		try {
			if ((numAciertos+numFallos) <= NUM_PREGUNTAS)
				return true;
			else throw new notaInvalidoExamenTestExcepcion("el nÃºmero de las preguntas contesdadas debe ser igual o menor que 30");
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
	 * @return Devuelve la nota de esta examen en 10 puntos
	 */
	public double calcularNota() {
		double nota = (this.numAciertos * VALOR_PREGUNTA) - (this.numFallos * VALOR_FALLO);
		if (nota < 0) nota = 0;
		return nota;
	}

	/**
	 * 
	 * @return Devuelve la nota de este examen en la nota global 
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
