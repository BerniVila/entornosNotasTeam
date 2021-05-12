package proyectoEntornosTeam;

public class ExamenTest extends Examen{

	private static final int NUM_PREGUNTAS = 30;
	private static final double VALOR_TEST = 10.0;
	private static final double VALOR_PREGUNTA = VALOR_TEST / NUM_PREGUNTAS;
	private static final double VALOR_FALLO = VALOR_PREGUNTA / 3.0;

	private int numAciertos;
	private int numFallos;
	
	public ExamenTest() {};
	public ExamenTest(double porcentaje, int numAciertos, int numFallos) throws notaInvalidoExamenTestExcepcion {
		super(porcentaje);
		setNumAciertos(numAciertos);
		setNumFallos(numFallos);
	}

	public int getNumPreguntas() {
		return NUM_PREGUNTAS;
	}

	public int getNumAciertos() {
		return numAciertos;
	}

	public int getNumFallos() {
		return numFallos;
	}

	public void setNumAciertos(int numAciertos) throws notaInvalidoExamenTestExcepcion {
		if (ckNotaValidad()) {
			this.numAciertos = numAciertos; 
		}		
	}

	public void setNumFallos(int numFallos) throws notaInvalidoExamenTestExcepcion {
		if (ckNotaValidad()) {
			this.numFallos = numFallos; 
		}
	}

	public boolean ckNotaValidad() throws notaInvalidoExamenTestExcepcion{
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
		return "ExamenTest [numPreguntas=" + NUM_PREGUNTAS + ", numAciertos=" + numAciertos + ", numFallos=" + numFallos
				+ ", noContestadas=" + (NUM_PREGUNTAS - numAciertos - numFallos)+ "]";
	}

	public double calcularNota() {
		double nota = (this.numAciertos * VALOR_PREGUNTA) - (this.numFallos * VALOR_FALLO);
		if (nota < 0) nota = 0;
		return nota;
	}

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
