package proyectoEntornosTeam;

public class TrabajoClase {

	private boolean entregado;
	private int diasRetraso;
	private double puntosPenalizacion;

	public TrabajoClase() {

	}

	public TrabajoClase(int diasRetraso) {
		this.diasRetraso = diasRetraso;

		if (this.diasRetraso > 5) {
			this.entregado = false;
		} else {
			this.entregado = true;
			setPuntosPenalizacion();
		}

	}

	public boolean isEntregado() {
		return this.entregado;
	}

	public int getDiasRetraso() {
		return diasRetraso;
	}

	public double getPuntosPenalizacion() {
		setPuntosPenalizacion();
		return puntosPenalizacion;
	}

	private void setPuntosPenalizacion() {
		puntosPenalizacion = diasRetraso / 10.0;
	}
	
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public void setDiasRetraso(int diasRetraso) {
		setPuntosPenalizacion();
		this.diasRetraso = diasRetraso;
	}

	@Override
	public String toString() {
		return " entregado: " + entregado + ", dias de retraso: " + diasRetraso + ", penalizacion: "
				+ puntosPenalizacion;
	}
}
