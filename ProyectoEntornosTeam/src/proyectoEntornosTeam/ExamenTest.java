package proyectoEntornosTeam;

public class ExamenTest {

	private static final int NUM_PREGUNTAS = 30;
	private static final double VALOR_TEST = 10.0;
	private static final double VALOR_PREGUNTA = VALOR_TEST / NUM_PREGUNTAS;
	private static final double VALOR_FALLO = VALOR_PREGUNTA / 3.0;
	private static final double VALOR_GLOBAL_TEST = 0.25;

	private int numPreguntas;
	private int numAciertos;
	private int numFallos;
	private int noContestadas;
	
	public ExamenTest() {
		
	}

	public ExamenTest(int numAciertos, int numFallos, int noContestadas) {
		this.numPreguntas = NUM_PREGUNTAS;
		this.numAciertos = numAciertos;
		this.numFallos = numFallos;
		this.noContestadas = noContestadas;
	}

	public int getNumPreguntas() {
		return numPreguntas;
	}

	public int getNumAciertos() {
		return numAciertos;
	}

	public int getNumFallos() {
		return numFallos;
	}

	public int getNoContestadas() {
		return noContestadas;
	}

	public void setNumAciertos(int numAciertos) {
		this.numAciertos = numAciertos; 
	}

	public void setNumFallos(int numFallos) {
		this.numFallos = numFallos;
	}

	public void setNoContestadas(int noContestadas) {
		this.noContestadas = noContestadas;
	}

	@Override
	public String toString() {
		return "ExamenTest [numPreguntas=" + numPreguntas + ", numAciertos=" + numAciertos + ", numFallos=" + numFallos
				+ ", noContestadas=" + noContestadas + "]";
	}

	public double calcularNota() {

		double nota = (this.numAciertos * VALOR_PREGUNTA) - (this.numFallos * VALOR_FALLO);

		return nota; // poner redondeo
	}

	public double calcularValorTest() {

		return this.calcularNota() * VALOR_GLOBAL_TEST;
	}

}
