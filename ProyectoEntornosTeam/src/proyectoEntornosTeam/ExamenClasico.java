package proyectoEntornosTeam;

public class ExamenClasico extends Examen{
	private double notaExamen;
	public ExamenClasico() {};
	public ExamenClasico(double porcentaje, double nota) throws notaInvalidoExamenClasicoExcepcion {
		super(porcentaje);
		setNotaExamen(nota);
	}
	public void setNotaExamen(double nota) throws notaInvalidoExamenClasicoExcepcion {
		try {
			if (nota >= 0 && nota <= 10)
				this.notaExamen = nota;
			else throw new notaInvalidoExamenClasicoExcepcion("La nota debe ser entre 0 y 10");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	public double getNotaExamen() {
		return notaExamen;
	}
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
