package proyectoEntornosTeam;

/**
 * <h2> Clase ExamenClasico </h2>
 * Esta clase hereda de la clase Examen, es el exámen clásico del alumno
 * 
 * @author Bernardo Vila, Zupan Teng
 *
 */
public class ExamenClasico extends Examen{
	
	/**
	 * Atributo notaExamen
	 * Indica la nota del exámen clásico
	 */
	private double notaExamen;
	/**
	 * 
	 * @param porcentaje Indica el peso en porcentaje de la nota del exámen en la nota global
	 * @param nota La nota del exámen clásico
	 * @throws notaInvalidoExamenClasicoExcepcion La nota no es válida, debe tener un valor entre 0 y 10
	 * @throws SinPorcentajeExcepcion 
	 */
	public ExamenClasico(double porcentaje, double nota) throws notaInvalidoExamenClasicoExcepcion, SinPorcentajeExcepcion {
		super(porcentaje);
		try {
			setNotaExamen(nota);
		} catch (notaInvalidoExamenClasicoExcepcion e) {
			throw e;
		}
	}
	
	/**
	 * 
	 * @param nota La nota del exámen clásico
	 * @return Devuelve true si la nota es válida y la asigna al atributo notaExamen y false si no es válido
	 * @throws notaInvalidoExamenClasicoExcepcion La nota no es válida, debe tener un valor entre 0 y 10
	 */
	public boolean setNotaExamen(double nota) throws notaInvalidoExamenClasicoExcepcion {
		try {
			if (nota >= 0 && nota <= 10)
				this.notaExamen = nota;
			else throw new notaInvalidoExamenClasicoExcepcion("La nota debe ser entre 0 y 10");
			return true;
		} catch (notaInvalidoExamenClasicoExcepcion e) {
			throw e;
		}
		
	}
	
	/**
	 * 
	 * @return Fija la nota de este exámen
	 */
	public double getNotaExamen() {
		return notaExamen;
	}

	/**
	 * 
	 * @return Devuelve la nota de este exámen en la nota global 
	 * @throws notaInvalidoExamenClasicoExcepcion La nota no es válido, debe ser entre 0 y 10
	 */
	@Override
	public double getNota() throws SinPorcentajeExcepcion{
		try {
			if (porcentaje != 0) return notaExamen*porcentaje;
			else throw new SinPorcentajeExcepcion("Porcentaje no asignado");
		} catch (SinPorcentajeExcepcion e) {
			throw e;
		}
		
	}
	
	@Override
	public String toString() {
		return "examen clásico: " + notaExamen;
	}
	
}
