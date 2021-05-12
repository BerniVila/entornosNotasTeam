package proyectoEntornosTeam;

public abstract class Examen {
	//valor porcentaje de cada examen(0.00 - 1.00)
	protected double porcentaje = 0;
	public Examen() {};
	public Examen (double porcentaje) {
		setPorcentaje(porcentaje);
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	public abstract double getNota() throws SinPorcentajeExcepcion;
}
