package proyectoEntornosTeam;

/**
 * <h1> Clase ExamenClasico </h1>
 * Esta clase hereda de la clase Examen, es el examen cl�sico del alumno
 * 
 * @author Bernardo Vila, Zupan Teng
 *
 */
public class ExamenClasico extends Examen{
	
	/**
	 * Atributo notaExamen
	 * Indica la nota del examen cl�sico
	 */
	private double notaExamen;
	/**
	 * 
	 * @param porcentaje Indica el peso en porcentaje de la nota del examen en la nota global
	 * @param nota La nota del examen cl�sico
	 * @throws notaInvalidoExamenClasicoExcepcion La nota no es valida, debe tener un valor entre 0 y 10
	 */
	public ExamenClasico(double porcentaje, double nota) throws notaInvalidoExamenClasicoExcepcion {
		super(porcentaje);
		setNotaExamen(nota);
	}
	
	/**
	 * 
	 * @param nota La nota del examen cl�sico
	 * @return Devuelve true si la nota es valida y la asigna al atributo notaExamen y false si no es valido
	 * @throws notaInvalidoExamenClasicoExcepcion La nota no es valida, debe tener un valor entre 0 y 10
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
	 * @return Fija la nota de este examen
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
		return "examen clásico: " + notaExamen;
	}
	
}
