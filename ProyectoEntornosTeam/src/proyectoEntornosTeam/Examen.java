package proyectoEntornosTeam;
/**
 * <h2> Clase Absracto Examen </h2>
 * Esta clase es la clase padre de todos los examenes
 * 
 * @author Bernardo,Zupan
 * 
 */
public abstract class Examen {
	
	/**
	 * Atributo porcentaje
	 * 
	 * Indica el peso de los mismos en la nota global de la asignatura, 
	 * 
	 */
	protected double porcentaje = 0;
	public Examen() {};
	public Examen (double porcentaje) {
		setPorcentaje(porcentaje);
	}
	
	/**
	 * 
	 * @return El porcentaje de la nota del examen en la nota global
	 */
	public double getPorcentaje() {
		return porcentaje;
	}
	
	/**
	 * 
	 * @param porcentaje El porcentaje de la nota del examen en la nota global, debe ser entre 0 y 1
	 * @return Devuelve true si el porcentaje es valido y lo asigna al atributo porcentaje y false si no es valido
	 */
	public boolean setPorcentaje(double porcentaje) {
		if (porcentaje > 0 & porcentaje <= 1) 
			this.porcentaje = porcentaje;
		else
			return false;
		return true;
	}
	
	/**
	 * 
	 * @return La nota del examen
	 * @throws SinPorcentajeExcepcion El porcentaje no esta asignado
	 */
	public abstract double getNota() throws SinPorcentajeExcepcion;
}
