package proyectoEntornosTeamVersionBD;

/**
 * <h2> Clase TrabajoClase </h2>
 * Esta clase representa un trabajo de clase, recibido como parámetro por la clase Alumno
 * 
 * @author Bernardo Vila, Zupan Teng
 *
 */

public class TrabajoClase {

	/**
	 * Atributo entregado
	 * Indica si el trabajo ha sido entregado dentro del plazo
	 */
	private boolean entregado;
	
	/**
	 * Atributo diasRetraso
	 * Indica los días de retraso en la entrega del trabajo
	 */
	private int diasRetraso;
	
	/**
	 * Atributo puntosPenalizacion
	 * Indica los puntos de penalización por retraso en la entrega del trabajo
	 */
	private double puntosPenalizacion;

	private String descripcion;
	
	/**
	 * Constructor vacío de objetos de la clase TrabajoClase
	 */
	public TrabajoClase() {

	}

	/**
	 * 
	 * @param diasRetraso Indica los días de retraso en la entrega del trabajo
	 */
	public TrabajoClase(int diasRetraso, String descripcion) {
		this.diasRetraso = diasRetraso;
		this.descripcion = descripcion;
		if (this.diasRetraso > 5) {
			this.entregado = false;
		} else {
			this.entregado = true;
			setPuntosPenalizacion();
		}

	}

	/**
	 * @return Devuelve true si el trabajo ha sido entregado a tiempo y false si no
	 */
	public boolean isEntregado() {
		return this.entregado;
	}

	/**
	 * @return Devuelve los días de retraso en la entrega del trabajo
	 */
	public int getDiasRetraso() {
		return diasRetraso;
	}

	/**
	 * @return Devuelve los puntos de penalización por retraso en la entrega del trabajo
	 */
	public double getPuntosPenalizacion() {
		setPuntosPenalizacion();
		return puntosPenalizacion;
	}

	/**
	 * Fija los puntos de penalización por retraso en la entrega del trabajo
	 */
	private void setPuntosPenalizacion() {
		puntosPenalizacion = diasRetraso / 10.0;
	}
	
	/**
	 * @param entregado Representa si el trabajo ha sido entregado a tiempo o no
	 * Fija si el trabajo ha sido entregado a tiempo o no
	 */
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	/**
	 * @param diasRetraso Indica los días de retraso en la entrega del trabajo
	 * Fija los días de retraso en la entrega del trabajo y calcula la penalización correspondiente
	 */
	public void setDiasRetraso(int diasRetraso) {
		setPuntosPenalizacion();
		this.diasRetraso = diasRetraso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "entregado: " + entregado + ", dias de retraso: " + diasRetraso + ", penalizacion: "
				+ puntosPenalizacion;
	}
}
