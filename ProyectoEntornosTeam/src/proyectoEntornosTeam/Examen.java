package proyectoEntornosTeam;
/**
 * <h2> Clase Absracta Examen </h2>
 * Esta clase es la clase padre de todos los examenes
 * 
 * @author Bernardo Vila, Zupan Teng
 * 
 */
public abstract class Examen {
	
	
	/**
	 * Atributo descripcion
	 * Es la descripci�n sobre el examen
	 */
	protected String descripcion = "";


	/**
	 * Atributo porcentaje
	 * Indica el peso de los mismos en la nota global de la asignatura, 
	 * 
	 */
	protected double porcentaje = 0;
	
	/**
	 * Constructor vacío de objetos de la clase Examen
	 */
	public Examen() {};
	
	/**
	 * 
	 * @param porcentaje Indica el peso en porcentaje de la nota del exámen en la nota global
	 * @throws SinPorcentajeExcepcion 
	 */
	public Examen (double porcentaje) throws SinPorcentajeExcepcion {
		setPorcentaje(porcentaje);
	}
	
	/**
	 * 
	 * @return El porcentaje de la nota del exámen en la nota global
	 */
	public double getPorcentaje() {
		return porcentaje;
	}
	
	/**
	 * 
	 * @param porcentaje El porcentaje de la nota del exámen en la nota global, debe ser entre 0 y 1
	 * @return Devuelve true y lo asigna al atributo porcentaje si el porcentaje es válido, y devuelve false si no es válido
	 */
	public void setPorcentaje(double porcentaje) throws SinPorcentajeExcepcion{
		if (porcentaje > 0 & porcentaje <= 1) 
			this.porcentaje = porcentaje;
		else
			throw new SinPorcentajeExcepcion("Porcentaje no asignado");
	}
	
	/**
	 * 
	 * @return devuelve la decripci�n del examen
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * 
	 * @param descripcion Indica la descripci�n sobre el examen
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * 
	 * @return Devuelve la nota del exámen
	 * @throws SinPorcentajeExcepcion El porcentaje no está asignado
	 */
	public abstract double getNota() throws SinPorcentajeExcepcion;
}
