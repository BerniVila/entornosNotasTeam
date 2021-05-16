package proyectoEntornosTeam;

/**
 * <h1> Clase ExamenClasico </h1>
 * Esta clase es heredado de la clase Examen, es el examen clásico del alumno
 * 
 * @author Bernardo,Zupan
 *
 */
public class ExamenClasico extends Examen{
	
	/**
	 * Atributo notaExamen
	 * La nota del examen clásico
	 */
	private double notaExamen;
	/**
	 * 
	 * @param porcentaje El porcentaje de la nota del examen en la nota global
	 * @param nota La nota del examen clásico
	 * @throws notaInvalidoExamenClasicoExcepcion La nota no es valido, debe ser entre 0 y 10
	 */
	public ExamenClasico(double porcentaje, double nota) throws notaInvalidoExamenClasicoExcepcion {
		super(porcentaje);
		setNotaExamen(nota);
	}
	
	/**
	 * 
	 * @param nota La nota del examen clásico
	 * @return Devuelve true si la nota es valido y lo asigna al atributo notaExamen y false si no es valido
	 * @throws notaInvalidoExamenClasicoExcepcion La nota no es valido, debe ser entre 0 y 10
	 */
	public boolean setNotaExamen(double nota) throws notaInvalidoExamenClasicoExcepcion {
		try {
			if (nota >= 0 && nota <= 10)
				this.notaExamen = nota;
			else throw new notaInvalidoExamenClasicoExcepcion("La nota debe ser entre 0 y 10");
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		
	}
	
	/**
	 * 
	 * @return La nota de este examen
	 */
	public double getNotaExamen() {
		return notaExamen;
	}

	/**
	 * 
	 * @return Devuelve la nota de este examen en la nota global 
	 * @throws notaInvalidoExamenClasicoExcepcion La nota no es valido, debe ser entre 0 y 10
	 */
	@Override
	public double getNota() throws SinPorcentajeExcepcion{
		try {
			if (porcentaje != 0) return notaExamen*porcentaje;
			else throw new SinPorcentajeExcepcion("Porcentaje no asignado");
		} catch (SinPorcentajeExcepcion e) {
			System.out.println(e);
			return 0;
		}
		
	}
	
	@Override
	public String toString() {
		return "examen clÃ¡sico: " + notaExamen;
	}
	
}
